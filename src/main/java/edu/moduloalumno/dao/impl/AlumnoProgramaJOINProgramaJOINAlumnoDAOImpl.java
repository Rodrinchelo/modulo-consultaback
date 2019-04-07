package edu.moduloalumno.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IAlumnoProgramaJOINProgramaJOINAlumnoDAO;
import edu.moduloalumno.entity.AlumnoProgramaJOINProgramaJOINAlumno;
import edu.moduloalumno.entity.Programa;
import edu.moduloalumno.rowmapper.AlumnoProgramaJOINProgramaJOINAlumnoRowMapper;
import edu.moduloalumno.rowmapper.AlumnoProgramaJOINProgramaRowMapper;
import edu.moduloalumno.rowmapper.ProgramaRowMapper;

@Transactional
@Repository
public class AlumnoProgramaJOINProgramaJOINAlumnoDAOImpl implements IAlumnoProgramaJOINProgramaJOINAlumnoDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<AlumnoProgramaJOINProgramaJOINAlumno> getAllAlumnoProgramaJOINProgramaJOINAlumnos() {
		//String sql = "SELECT aap.id_alum, a.ape_nom as nom_alumno, aap.cod_alumno,  aap.id_programa, p.nom_programa, p.sigla_programa FROM alumno a, alumno_programa ap, alumno_alumno_programa aap, programa p where aap.id_alum = a.id_alum and aap.cod_alumno = ap.cod_alumno and aap.id_programa = p.id_programa order by aap.id_alum";
		String sql = "SELECT " +
		"a.id_alum, " +
		"a.ape_nom as nom_alumno, " +
		"ap.cod_alumno,  " +
		"ap.id_programa, " +
		"p.nom_programa, " +
		"p.sigla_programa " +
		"FROM alumno a, " +
		"alumno_programa ap, " +
		"recaudaciones r," +
		"programa p " +
		"where r.id_alum = a.id_alum " +
		"and r.cod_alumno = ap.cod_alumno " +
		"and r.id_programa = ap.id_programa " +
		"and ap.id_programa = p.id_programa " +
		"order by a.id_alum";

		RowMapper<AlumnoProgramaJOINProgramaJOINAlumno> rowMapper = new AlumnoProgramaJOINProgramaJOINAlumnoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}
	
	@Override
	public List<AlumnoProgramaJOINProgramaJOINAlumno> getAlumnoProgramaJOINProgramaJOINAlumnoIdByNombresApellidosRestringido(String nombresApellidos) {
		String sql = "SELECT ap.nom_alumno || ' ' || ap.ape_paterno || ' ' || ap.ape_materno as nom_alumno, ap.cod_alumno, p.id_programa, p.nom_programa, p.sigla_programa FROM alumno_programa ap, programa p where to_tsquery( translate( ? ,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU') ) @@ to_tsvector(coalesce(translate(ap.nom_alumno,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU'),'') || ' ' ||coalesce(translate(ap.ape_paterno,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU'),'') || ' ' ||coalesce(translate(ap.ape_materno,'áéíóúÁÉÍÓÚäëïöüÄËÏÖÜ','aeiouAEIOUaeiouAEIOU'))) and ap.id_programa = p.id_programa";
		RowMapper<AlumnoProgramaJOINProgramaJOINAlumno> rowMapper = new AlumnoProgramaJOINProgramaRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nombresApellidos);
	}

	@Override
	public Programa getProgramabyId(Integer id_programa) {
		try {
		String sql = "select id_programa,nom_programa,sigla_programa,vigencia_programa,id_tip_grado from programa where id_programa = ?";
		RowMapper<Programa> rowMapper = new ProgramaRowMapper();
		Programa programa = jdbcTemplate.queryForObject(sql, rowMapper, id_programa);
		return programa;
		}
		catch (EmptyResultDataAccessException e) {
			return null;
		}	
	}
	
	
	
}