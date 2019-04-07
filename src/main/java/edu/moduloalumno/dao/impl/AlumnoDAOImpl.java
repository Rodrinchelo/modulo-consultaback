package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IAlumnoDAO;
import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.rowmapper.AlumnoRowMapper;

@Transactional
@Repository
public class AlumnoDAOImpl implements IAlumnoDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Alumno getAlumnoById(int idAlum) {
		String sql = "SELECT id_alum, ape_nom, codigo, dni, id_facultad  FROM alumno WHERE id_alum = ?";
		RowMapper<Alumno> rowMapper = new BeanPropertyRowMapper<Alumno>(Alumno.class);
		Alumno alumno = jdbcTemplate.queryForObject(sql, rowMapper, idAlum);
		return alumno;
	}

	@Override
	public Alumno getAlumnoIdByApeNom(String apeNom) {
		String sql = "SELECT id_alum, ape_nom, codigo, dni, id_facultad  FROM alumno WHERE ape_nom = ?";
		RowMapper<Alumno> rowMapper = new BeanPropertyRowMapper<Alumno>(Alumno.class);
		Alumno alumno = jdbcTemplate.queryForObject(sql, rowMapper, apeNom);
		return alumno;
	}
	
	@Override
	public List<Alumno> getAlumnoIdByNombresApellidos(String nombres, String apellidos) {
		String sql = "select a.id_alum, a.id_facultad, a.ape_nom, a.codigo, a.dni from alumno a where ((a.ape_nom like '%'|| ? ||'%') OR (a.ape_nom like '%'|| ? ||'%')) or (( ? like '%'|| a.ape_nom ||'%') OR (? like '%'|| a.ape_nom ||'%'))";		
		RowMapper<Alumno> rowMapper = new AlumnoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nombres, apellidos, nombres, apellidos);
	}
	
	@Override
	public List<Alumno> getAlumnoIdByNombresApellidosRestringido(String nombresApellidos) {
		//String sql = "select a.id_alum, a.id_facultad, a.ape_nom, a.codigo, a.dni from alumno a, recaudaciones r, concepto c WHERE to_tsquery( translate( ? ,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') ) @@ to_tsvector(coalesce(translate( a.ape_nom ,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU'))) and r.id_alum = a.id_alum and r.id_concepto = c.id_concepto and c.id_clase_pagos = 2 and a.id_alum != all (select id_alum from alumno_alumno_programa) group by a.id_alum";
		String sql = "select  " +
		"a.id_alum, " +
		"a.id_facultad, " +
		"a.ape_nom, " +
		"a.codigo, " +
		"a.dni " +
		"from alumno a, " +
		"recaudaciones r, " +
		"concepto c " +
		"WHERE to_tsquery( translate( ? ,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') )  " +
		"@@ to_tsvector(coalesce(translate( a.ape_nom ,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU')))" + 
		"and r.id_alum = a.id_alum " +
		"and r.id_concepto = c.id_concepto " +
		"and c.id_clase_pagos = 2 " +
		"and not exists (select 1 from alumno_programa ap where ap.cod_alumno=r.cod_alumno and ap.id_programa=r.id_programa)";
		
		RowMapper<Alumno> rowMapper = new AlumnoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nombresApellidos);
	}
	
	@Override
	public List<Alumno> getAllAlumnos() {
		String sql = "SELECT id_alum, ape_nom, codigo, dni, id_facultad  FROM alumno";
		// RowMapper<Alumno> rowMapper = new
		// BeanPropertyRowMapper<Alumno>(Alumno.class);
		RowMapper<Alumno> rowMapper = new AlumnoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addAlumno(Alumno alumno) {
		// Add alumno
		String sql = "INSERT INTO alumno (id_alum, ape_nom, codigo, dni, id_facultad ) values (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, alumno.getIdAlum(), alumno.getApeNom(), alumno.getCodigo(), alumno.getDni(),
				alumno.getIdFacultad());

		// Fetch alumno id
		sql = "SELECT id_alum FROM alumno WHERE id_alum = ?";
		int idAlum = jdbcTemplate.queryForObject(sql, Integer.class, alumno.getIdAlum());

		// Set alumno id
		alumno.setIdAlum(idAlum);
	}

	@Override
	public void updateAlumno(Alumno alumno) {
		String sql = "UPDATE alumno SET ape_nom = ?, codigo = ?, dni = ?, id_facultad = ? WHERE id_alum = ?";
		jdbcTemplate.update(sql, alumno.getApeNom(), alumno.getCodigo(), alumno.getDni(), alumno.getIdFacultad(),
				alumno.getIdAlum());
	}

	@Override
	public void deleteAlumno(int idAlum) {
		String sql = "DELETE FROM alumno WHERE id_alum = ?";
		jdbcTemplate.update(sql, idAlum);
	}

}