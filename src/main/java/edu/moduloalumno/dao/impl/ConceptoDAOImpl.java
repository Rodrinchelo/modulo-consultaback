package edu.moduloalumno.dao.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IConceptoDAO;
import edu.moduloalumno.entity.Concepto;
import edu.moduloalumno.entity.Moneda;
import edu.moduloalumno.rowmapper.ConceptoRowMapper;
import edu.moduloalumno.rowmapper.MonedaRowMapper;

@Transactional
@Repository
public class ConceptoDAOImpl implements IConceptoDAO {
	

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Concepto getConceptoById(int idConcepto) {
		String sql = "SELECT id_concepto, concepto, concep_a, concep_b, descripcion, id_clase_pagos FROM concepto WHERE id_concepto = ?";
		RowMapper<Concepto> rowMapper = new BeanPropertyRowMapper<Concepto>(Concepto.class);
		Concepto concepto = jdbcTemplate.queryForObject(sql, rowMapper, idConcepto);
		return concepto;
	}

	@Override
	public List<Concepto> getAllConceptos() {
		String sql = "SELECT id_concepto, concepto, concep_a, concep_b, descripcion, id_clase_pagos FROM concepto where id_clase_pagos=2";//concep_a='210' and
		RowMapper<Concepto> rowMapper = new ConceptoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<Concepto> getConceptoIdByApeNom(String apeNom) {
		String sql = "select c.id_concepto, c.concepto, c.concep_a, c.concep_b, c.descripcion, c.id_clase_pagos from Recaudaciones r, Concepto c, alumno a where (a.ape_nom = ?) and (r.id_alum = a.id_alum) and (r.id_concepto = c.id_concepto) and (c.id_clase_pagos = 2) group by c.id_concepto";
		RowMapper<Concepto> rowMapper = new ConceptoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, apeNom);
	}
        
        @Override
	public List<Concepto> getConceptoIdByApeNomRestringidoCodigo(String codigo) {
		//String sql = "select c.id_concepto, c.concepto, c.concep_a, c.concep_b, c.descripcion, c.id_clase_pagos from Recaudaciones r, Concepto c, alumno_alumno_programa aap where (aap.cod_alumno = ?) and (r.id_alum = aap.id_alum) and (r.id_concepto = c.id_concepto) and (c.id_clase_pagos = 2) group by c.id_concepto";
		String sql = "select distinct " +
		"c.id_concepto,  " +
		"c.concepto,  " +
		"c.concep_a,  " +
		"c.concep_b,  " +
		"c.descripcion,  " +
		"c.id_clase_pagos  " +
		"from Recaudaciones r,  " +
		"Concepto c,  " +
		"alumno_programa ap  " +
		"where (ap.cod_alumno = ?)  " +
		"and (r.cod_alumno = ap.cod_alumno)  " +
		"and (r.id_programa = ap.id_programa)  " +
		"and (r.id_concepto = c.id_concepto)  " +
		"and (c.id_clase_pagos = 2)";

		RowMapper<Concepto> rowMapper = new ConceptoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, codigo);
	}
        
	
	@Override
	public List<Concepto> getConceptoIdByApeNomRestringido(String apeNom) {
		//String sql = "select c.id_concepto, c.concepto, c.concep_a, c.concep_b, c.descripcion, c.id_clase_pagos from Recaudaciones r, Concepto c, alumno a, alumno_programa ap, alumno_alumno_programa aap where to_tsquery( ? ) @@ to_tsvector(coalesce(ap.nom_alumno,'') || ' ' ||coalesce(ap.ape_paterno,'') || ' ' ||coalesce(ap.ape_materno,'')) and (ap.id_programa = aap.id_programa) and (ap.cod_alumno = aap.cod_alumno) and (aap.id_alum = a.id_alum) and (a.id_alum = r.id_alum) and (r.id_concepto = c.id_concepto) and (c.id_clase_pagos = 2) group by c.id_concepto";
		String sql = "select distinct " +
		"c.id_concepto,  " +
		"c.concepto,  " +
		"c.concep_a,  " +
		"c.concep_b,  " +
		"c.descripcion,  " +
		"c.id_clase_pagos  " +
		"from Recaudaciones r,  " +
		"Concepto c,  " +
		"alumno a,  " +
		"alumno_programa ap " +
		"where to_tsquery( ? ) " +
		"@@ to_tsvector(coalesce(ap.nom_alumno,'') || ' ' ||coalesce(ap.ape_paterno,'') || ' ' ||coalesce(ap.ape_materno,'')) " +
		"and (ap.id_programa = r.id_programa)  " +
		"and (ap.cod_alumno = r.cod_alumno)  " +
		"and (r.id_alum = a.id_alum)  " +
		"and (r.id_concepto = c.id_concepto)  " +
		"and (c.id_clase_pagos = 2)";

		RowMapper<Concepto> rowMapper = new ConceptoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, apeNom);
	}

	@Override
	public List<Concepto> getConceptoIdByNombresApellidos(String nombres, String apellidos) {
		String sql = "select c.id_concepto, c.concepto, c.concep_a, c.concep_b, c.descripcion, c.id_clase_pagos from Recaudaciones r, Concepto c, alumno a where ((a.ape_nom like '%'|| ? ||'%') or (a.ape_nom like '%'|| ? ||'%')) and (r.id_alum = a.id_alum) and (r.id_concepto = c.id_concepto) and (c.id_clase_pagos = 2) group by c.id_concepto";
		RowMapper<Concepto> rowMapper = new ConceptoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nombres, apellidos);
	}
	
	@Override
	public List<Moneda> getAllMoneda() {
		String sql = "select * from moneda;";
		RowMapper<Moneda> rowMapper = new MonedaRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}
	
	@Override
	public void addConcepto(Concepto concepto) {
		// Add concepto
		String sql = "INSERT INTO concepto (id_concepto, concepto, concep_a, concep_b, descripcion, id_clase_pagos) values (?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, concepto.getIdConcepto(), concepto.getConcepto(), concepto.getConcepA(),
				concepto.getConcepB(), concepto.getDescripcion(), concepto.getIdClasePagos());

		// Fetch concepto id
		sql = "SELECT id_concepto FROM concepto WHERE id_concepto = ?";
		int idConcepto = jdbcTemplate.queryForObject(sql, Integer.class, concepto.getIdConcepto());

		// Set concepto id
		concepto.setIdConcepto(idConcepto);
	}

	@Override
	public void updateConcepto(Concepto concepto) {
		String sql = "UPDATE concepto SET concepto = ?, concep_a = ?, concep_b = ?, descripcion = ?, id_clase_pagos = ? WHERE id_concepto = ?";
		jdbcTemplate.update(sql, concepto.getConcepto(), concepto.getConcepA(), concepto.getConcepB(),
				concepto.getDescripcion(), concepto.getIdClasePagos(), concepto.getIdConcepto());
	}

	@Override
	public void deleteConcepto(int idConcepto) {
		String sql = "DELETE FROM concepto WHERE id_concepto = ?";
		jdbcTemplate.update(sql, idConcepto);
	}

	@Override
	public boolean updateConcepto(String concepto, Integer id_concepto) {
		
		//logger.info("Facultad DAO "+fecha+" "+" "+obs+" "+idRec);
		
		String concep_a = concepto.substring(0, 3);
		String concep_b = concepto.substring(3, 6);
		System.out.println("ca :"+concep_a);
		System.out.println("cb :"+concep_b);
		String sql = "UPDATE concepto SET concepto = ?,concep_a = ?,concep_b= ? WHERE id_concepto = ?";
		Integer resp = jdbcTemplate.update(sql,concepto,concep_a,concep_b,id_concepto);
		//logger.info("resp :"+resp);
		
		System.out.println("resp :"+resp);
		if(resp.equals(1)) {
			return true;
		}
		else {
			return false;
		}

	}

	@Override
	public Float getTipodecambio(Date fecha) {
		try {
			String sql = "select compra from tipo_cambio where fecha = ?";
			String compra = jdbcTemplate.queryForObject(sql, new Object[] { fecha }, String.class);
			System.out.println(" "+compra);
			Float tcambio = Float.parseFloat(compra);
			
			return tcambio;
			
		}
		catch(EmptyResultDataAccessException e) {
			System.out.println("tcambio fuckkkkk");
			return null;
		}
	}
	
}