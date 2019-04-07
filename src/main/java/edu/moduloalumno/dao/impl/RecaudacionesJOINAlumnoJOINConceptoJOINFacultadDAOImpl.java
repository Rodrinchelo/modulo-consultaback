package edu.moduloalumno.dao.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO;
import edu.moduloalumno.entity.CodigosporNomApe;

import edu.moduloalumno.entity.RecaudacionesJOINAlumnoJOINConceptoJOINFacultad;
import edu.moduloalumno.rowmapper.CodigosporNomApeRowMapper;
import edu.moduloalumno.rowmapper.RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper;

@Transactional
@Repository
public class RecaudacionesJOINAlumnoJOINConceptoJOINFacultadDAOImpl implements IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override //aqui
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads() {	
		String sql = "select r.id_rec,r.id_alum,rc.estado,a.ape_nom,r.ciclo,c.concepto,c.id_concepto,a.dni,r.numero,f.nombre,m.id_moneda,m.moneda, " + 
		"r.importe, r.fecha,ap.anio_ingreso,p.nom_programa, " + 
		"p.id_programa, r.cod_alumno, r.observacion " + 
		"from " + 
		"recaudaciones r, " + 
		"alumno a, " + 
		"registro_carga rc, " + 
		"facultad f, " + 
		"concepto c, " + 
		"programa p, " + 
		"alumno_programa ap, " + 
		"moneda m " + 
		"where (r.id_alum = a.id_alum) " + 
		"and (rc.id_registro = r.id_registro) " + 
		"and (ap.id_programa = r.id_programa) " + 
		"and (ap.cod_alumno = r.cod_alumno) " + 
		"and (a.id_facultad = f.id_facultad) " + 
		"and (r.id_concepto = c.id_concepto) " + 
		"and (c.id_clase_pagos = 2) " + 
		"and (ap.id_programa = p.id_programa) " + 
		"and (m.id_moneda = r.moneda) " + 
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}
	
	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadIdByNombresApellidosRestringido(String nombres, String apellidos) {
		String sql = "select r.id_rec, r.id_alum, a.ape_nom, c.concepto, " + 
		"r.numero, f.nombre, r.moneda, r.importe, r.fecha, r.id_programa, " + 
		"r.cod_alumno, r.observacion " + 
		"from recaudaciones r, alumno a, facultad f, concepto c " + 
		"where (r.id_alum = a.id_alum) " + 
		"and (a.id_facultad = f.id_facultad) " + 
		"and ((a.ape_nom like '%'|| ? ||'%') " + 
		"and (a.ape_nom like '%'|| ? ||'%')) " + 
		"and (r.id_concepto = c.id_concepto) " + 
		"and (c.id_clase_pagos = 2) " + 
		"order by c.concepto, r.fecha";
		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nombres, apellidos);
	}
	
	@Override
	public RecaudacionesJOINAlumnoJOINConceptoJOINFacultad getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadById(int idRecaudaciones) {
		logger.info("Facultadupdate id"+ idRecaudaciones);

		String sql="select r.id_rec, r.id_alum, rc.estado, a.ape_nom, " +  
		"c.concepto,r.ciclo,c.id_concepto,a.dni, r.numero, f.nombre, " + 
		"r.moneda, r.importe, r.fecha,p.nom_programa ,p.id_programa, " + 
		"p.sigla_programa, r.cod_alumno, r.observacion " + 
		"from " + 
		"recaudaciones r, " + 
		"registro_carga rc, " + 
		"alumno a, " + 
		"facultad f, " + 
		"concepto c, " + 
		"programa p, " + 
		"alumno_programa ap " + 
		"where (r.id_rec = ? ) " + 
		"and (rc.id_registro = r.id_registro) " + 
		"and (r.id_alum = a.id_alum) " + 
		"and (a.id_facultad = f.id_facultad) " + 
		"and (r.id_concepto = c.id_concepto) " + 
		"and (ap.cod_alumno = r.cod_alumno) " + 
		"and (ap.id_programa = r.id_programa) " + 
		"and (c.id_clase_pagos = 2) " + 
		"and (ap.id_programa = p.id_programa) " + 
		"order by c.concepto,r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new BeanPropertyRowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>(RecaudacionesJOINAlumnoJOINConceptoJOINFacultad.class);
		RecaudacionesJOINAlumnoJOINConceptoJOINFacultad recaudaciones = jdbcTemplate.queryForObject(sql, rowMapper, idRecaudaciones);
		logger.info("Facultadupdate idREC"+ recaudaciones);
		
		return recaudaciones;
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByStartDateBetween(Date fechaInicial, Date fechaFinal) {
		String sql = "select r.id_rec, r.id_alum, rc.estado ,a.ape_nom, " + 
		"c.concepto, r.numero, f.nombre, r.moneda, r.importe, r.fecha, " + 
		"p.id_programa, r.cod_alumno, r.observacion " + 
		"from recaudaciones r, registro_carga rc, alumno a, " + 
		"facultad f, concepto c " + 
		"where (r.fecha between ? and ?) " + 
		"and (r.id_alum = a.id_alum) " + 
		"and (rc.id_registro = r.id_registro) " + 
		"and (a.id_facultad = f.id_facultad) " + 
		"and (r.id_concepto = c.id_concepto) " + 
		"and (c.id_clase_pagos = 2) " + 
		"order by c.concepto, r.fecha";
		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, fechaInicial, fechaFinal);
	}

	@Override // aqui
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeStartDateBetween(String nomApe, Date fechaInicial,
			Date fechaFinal) {	

		String sql="select r.id_rec, r.id_alum, rc.estado, " + 
		"ap.nom_alumno || ' ' || ap.ape_paterno || ' ' || ap.ape_materno as ape_nom, " + 
		"r.ciclo ,c.concepto,c.id_concepto,a.dni, r.numero, f.nombre, m.id_moneda, " +  
		"m.moneda, r.importe, r.fecha,ap.anio_ingreso,p.nom_programa, " + 
		"p.id_programa,p.sigla_programa, r.cod_alumno, r.observacion " + 
		"from " + 
		"recaudaciones r, " + 
		"registro_carga rc, " + 
		"alumno a, " + 
		"facultad f, " + 
		"concepto c, " + 
		"alumno_programa ap, " + 
		"programa p, " +  
		"moneda m " + 
		"where to_tsquery( ? ) @@ to_tsvector(coalesce(ap.cod_alumno,'') ) " + 
		"and (rc.id_registro = r.id_registro) " + 
		"and (ap.id_programa = r.id_programa) " + 
		"and (ap.cod_alumno = r.cod_alumno) " +  
		"and (a.id_alum = r.id_alum) " + 
		"and ((r.fecha between ? and ?) or r.fecha = null) " + 
		"and (a.id_facultad = f.id_facultad) " + 
		"and (r.id_concepto = c.id_concepto) " + 
		"and (c.id_clase_pagos = 2) " + 
		"and (ap.id_programa = p.id_programa) " + 
		"and (m.id_moneda = r.moneda) " + 
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nomApe, fechaInicial, fechaFinal);
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApe(String nomApe) {
		
		String sql="select r.id_rec, r.id_alum, " +  
		"ap.nom_alumno || ' ' || ap.ape_paterno || ' ' || ap.ape_materno as ape_nom, " +
		"c.concepto, r.numero, f.nombre, r.moneda, r.importe, " +
		"r.fecha, r.id_programa, ap.cod_alumno, r.observacion " +  
		"from " +  
		"recaudaciones r, " +  
		"alumno a, " +
		"facultad f, " +
		"concepto c, " +  
		"alumno_programa ap " +  
		"where to_tsquery( ? ) @@ to_tsvector(coalesce(ap.nom_alumno,'') || ' ' ||coalesce(ap.ape_paterno,'') || ' ' ||coalesce(ap.ape_materno,'')) " +  
		"and (ap.id_programa = r.id_programa) " +  
		"and (ap.cod_alumno = r.cod_alumno) " +  
		"and (a.id_alum = r.id_alum) " +  
		"and (a.id_facultad = f.id_facultad) " +  
		"and (r.id_concepto = c.id_concepto) " +  
		"and (c.id_clase_pagos = 2) " +  
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nomApe);
	}// under claass
        
        @Override
		public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByCodigo(String codigo) {		
		
		String sql="select r.id_rec, r.id_alum, rc.estado, " +  
		"ap.nom_alumno || ' ' || ap.ape_paterno || ' ' || ap.ape_materno as ape_nom, " +  
		"r.ciclo,c.concepto,c.id_concepto, ap.dni_m as dni, " +  
		"r.numero, f.nombre,  m.id_moneda, m.moneda, r.importe, " +  
		"COALESCE( s.fecha_equiv,r.fecha) as fecha,ap.anio_ingreso, " +  
		"p.nom_programa, p.id_programa,p.sigla_programa, " +  
		"r.cod_alumno, r.observacion " +  
		"from recaudaciones r " +  
		"inner join registro_carga rc on (rc.id_registro = r.id_registro) " +
		"inner join alumno_programa ap on (ap.cod_alumno = r.cod_alumno and ap.id_programa=r.id_programa) " +
		"inner join programa p on (ap.id_programa = p.id_programa) " +
		"inner join alumno a on (r.id_alum = a.id_alum) " + 
		"inner join facultad f on (a.id_facultad = f.id_facultad) " +   
		"inner join concepto c on (r.id_concepto = c.id_concepto) " +   
		"left outer join moneda m on (r.moneda = m.id_moneda) " +   
		"left outer join sunat_sintipocambio s on (r.fecha = s.fecha) " +   
		"where to_tsquery(?) @@ to_tsvector(coalesce(ap.cod_alumno,'') || ' ') " +   
		"and (c.id_clase_pagos = 2) " +   
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, codigo);
	}

/*new*/@Override
	public List<CodigosporNomApe> getCodigoByNombre(String nomApe) {
		String sql = "select ap.cod_alumno, " +    
		"ap.nom_alumno || ' ' || ap.ape_paterno || ' ' || ap.ape_materno as nombre_alumno, " +   
		"p.nom_programa as nombre_programa " +   
		"from alumno_programa as ap, " +  
		"programa as p " +   
		"where to_tsquery( ? ) @@ to_tsvector(coalesce(ap.nom_alumno,'') || ' ' ||coalesce(ap.ape_paterno,'') || ' ' ||coalesce(ap.ape_materno,'')) and (ap.id_programa = p.id_programa)";
		RowMapper<CodigosporNomApe> rowMapper = new CodigosporNomApeRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nomApe);
	}        

	@Override // aqui
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeConcepto(String concepto, String nomApe) {
		
		String sql="select r.id_rec, r.id_alum, rc.estado,  " +   
		"ap.nom_alumno || ' ' || ap.ape_paterno || ' ' || ap.ape_materno as ape_nom, " +   
		"r.ciclo,c.concepto,c.id_concepto,a.dni, r.numero, f.nombre, m.id_moneda,  " +   
		"m.moneda, r.importe, r.fecha,ap.anio_ingreso,p.nom_programa,  " +   
		"p.id_programa,p.sigla_programa, r.cod_alumno, r.observacion  " +   
		"from recaudaciones r,  " +   
		"registro_carga rc,  " +   
		"alumno a, " +   
		"facultad f,  " +   
		"concepto c,  " +   
		"alumno_programa ap " +   
		"programa p, " +    
		"moneda m  " +   
		"where (c.concepto = ?) and to_tsquery( ? ) @@ to_tsvector(coalesce(ap.cod_alumno,'')) " +
		"and (rc.id_registro = r.id_registro) " +   
		"and (ap.id_programa = r.id_programa) " +   
		"and (ap.cod_alumno = r.cod_alumno) " +   
		"and (a.id_alum = r.id_alum)  " +   
		"and (a.id_facultad = f.id_facultad)  " +   
		"and (r.id_concepto = c.id_concepto)  " +   
		"and (c.id_clase_pagos = 2)  " +    
		"and (ap.id_programa = p.id_programa)  " +    
		"and (m.id_moneda = r.moneda)  " +    
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, concepto, nomApe);
	}

	@Override // aqui
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeRecibo(String recibo, String nomApe) {
		
		String sql = "select r.id_rec, r.id_alum,rc.estado,  " +    
		"ap.nom_alumno || ' ' || ap.ape_paterno || ' ' || ap.ape_materno as ape_nom, " + 
		"r.ciclo ,c.concepto,c.id_concepto,a.dni,r.numero,  " + 
		"f.nombre, m.id_moneda,m.moneda, r.importe, r.fecha, " + 
		"ap.anio_ingreso,p.nom_programa, p.id_programa, " + 
		"p.sigla_programa, r.cod_alumno, r.observacion  " + 
		"from recaudaciones r,  " + 
		"registro_carga rc, " + 
		"alumno a,  " + 
		"facultad f,  " + 
		"concepto c,  " + 
		"alumno_programa ap " + 
		"programa p, moneda m  " + 
		"where (r.numero = ?) and to_tsquery( ? ) @@ to_tsvector(coalesce(ap.cod_alumno,'')) " + 
		"and (rc.id_registro = r.id_registro) " + 
		"and (ap.id_programa = r.id_programa) " +  
		"and (ap.cod_alumno = r.cod_alumno) " + 
		"and (a.id_alum = r.id_alum) " + 
		"and (a.id_facultad = f.id_facultad) " + 
		"and (r.id_concepto = c.id_concepto) " + 
		"and (c.id_clase_pagos = 2) " + 
		"and (ap.id_programa = p.id_programa) " + 
		"and (m.id_moneda = r.moneda) " + 
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, recibo, nomApe);
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByPosgrado() {
		String sql = "select r.id_rec, r.id_alum, a.ape_nom, " +  
		"c.concepto, r.numero, f.nombre, r.moneda, r.importe, " +  
		"r.fecha, r.id_programa, r.cod_alumno, r.observacion " +  
		"from recaudaciones r, alumno a, facultad f, concepto c " + 
		"where (r.id_alum = a.id_alum) " + 
		"and (r.id_alum = a.id_alum) " + 
		"and (a.id_facultad = f.id_facultad)  " + 
		"and (r.id_concepto = c.id_concepto)  " + 
		"and (c.id_clase_pagos = 2)  " + 
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosStartDateBetween(String nombres, String apellidos,
			Date fechaInicial, Date fechaFinal) {
		String sql = "select r.id_rec, r.id_alum, a.ape_nom, c.concepto,  " + 
		"r.numero, f.nombre, r.moneda, r.importe, r.fecha, r.id_programa,  " + 
		"r.cod_alumno, r.observacion  " + 
		"from recaudaciones r, alumno a, facultad f, concepto c  " +  
		"where (r.id_alum = a.id_alum)   " + 
		"and (a.id_facultad = f.id_facultad)   " + 
		"and ((a.ape_nom like '%'|| ? ||'%')   " + 
		"and (a.ape_nom like '%'|| ? ||'%'))   " + 
		"and ((r.fecha between ? and ? ) or r.fecha = null)   " + 
		"and (r.id_concepto = c.id_concepto)   " + 
		"and (c.id_clase_pagos = 2)   " + 
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nombres, apellidos, fechaInicial, fechaFinal);
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidos(String nombres, String apellidos) {
		String sql = "select r.id_rec, r.id_alum, a.ape_nom, c.concepto,  " +  
		"r.numero, f.nombre, r.moneda, r.importe, r.fecha, r.id_programa,   " + 
		"r.cod_alumno, r.observacion   " + 
		"from recaudaciones r,   " + 
		"alumno a,   " + 
		"facultad f,   " + 
		"concepto c   " + 
		"where (r.id_alum = a.id_alum)   " + 
		"and (a.id_facultad = f.id_facultad)   " + 
		"and ((a.ape_nom like '%'|| ? ||'%')   " + 
		"and (a.ape_nom like '%'|| ? ||'%'))   " + 
		"and (r.id_concepto = c.id_concepto)   " + 
		"and (c.id_clase_pagos = 2)   " + 
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, nombres, apellidos);
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosConcepto(String concepto, String nombres,
			String apellidos) {
		String sql = "select r.id_rec, r.id_alum, a.ape_nom, c.concepto, r.numero,   " + 
		"f.nombre, r.moneda, r.importe, r.fecha, r.id_programa,   " + 
		"r.cod_alumno, r.observacion   " + 
		"from recaudaciones r,   " + 
		"alumno a,   " + 
		"facultad f,   " + 
		"concepto c   " + 
		"where (r.id_alum = a.id_alum)   " + 
		"and (a.id_facultad = f.id_facultad)    " + 
		"and (c.concepto = ? )    " + 
		"and ((a.ape_nom like '%'|| ? ||'%')    " + 
		"and (a.ape_nom like '%'|| ? ||'%'))   " +  
		"and (r.id_concepto = c.id_concepto)   " +  
		"and (c.id_clase_pagos = 2)   " + 
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, concepto, nombres, apellidos);
	}

	@Override
	public List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosRecibo(String recibo, String nombres,
			String apellidos) {
		String sql = "select r.id_rec, r.id_alum, a.ape_nom, c.concepto,    " + 
		"r.numero, f.nombre, r.moneda, r.importe, r.fecha, r.id_programa,    " + 
		"r.cod_alumno, r.observacion    " + 
		"from recaudaciones r,    " + 
		"alumno a,    " + 
		"facultad f,    " + 
		"concepto c    " + 
		"where (r.id_alum = a.id_alum)    " + 
		"and (a.id_facultad = f.id_facultad)    " + 
		"and (r.numero = ? )    " + 
		"and ((a.ape_nom like '%'|| ? ||'%')    " + 
		"and (a.ape_nom like '%'|| ? ||'%'))    " + 
		"and (r.id_concepto = c.id_concepto)    " + 
		"and (c.id_clase_pagos = 2)    " + 
		"order by c.concepto, r.fecha";

		RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> rowMapper = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, recibo, nombres, apellidos);
	}

	@Override
	public int updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(RecaudacionesJOINAlumnoJOINConceptoJOINFacultad recaudaciones) {
		String sql = "UPDATE recaudaciones SET id_programa = ?, cod_alumno = ? WHERE id_rec = ?";
		return jdbcTemplate.update(sql, recaudaciones.getIdPrograma(), recaudaciones.getCodAlumno(), recaudaciones.getIdRec());
	}
	
	@Override
	public int updateRecaudacionesCodAlumno(Integer id_rec,String cod_alumno) {
		String sql = "UPDATE recaudaciones SET cod_alumno = ? WHERE id_rec = ?";
		return jdbcTemplate.update(sql, cod_alumno, id_rec);
	}
	
	
	@Override
	public void deleteRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(int idRecaudaciones) {
		String sql = "DELETE FROM recaudaciones WHERE id_rec = ?";
		jdbcTemplate.update(sql, idRecaudaciones);
	}

	@Override
	public boolean updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(Integer id_concepto,String moneda,Date fecha, String numero,int ciclo,int idRec) {
		
		logger.info("Facultad DAO "+fecha+" "+" "+numero+" "+idRec);
		
		String sql = "UPDATE recaudaciones SET id_concepto=?,moneda=?,fecha = ?, numero = ?,ciclo=? WHERE id_rec = ?";
		logger.info("Facultad DAO "+sql);
		Integer resp = jdbcTemplate.update(sql,id_concepto,moneda,fecha,numero,ciclo,idRec);
		logger.info("resp :"+resp);
		if(resp.equals(1)) {
			return true;
		}
		else {
			return false;
		}

	}

	@Override
	public boolean insertObservacion(String observacion,Integer idrec) {
		String sql = "update recaudaciones set observacion = ? where id_rec = ?";
		Integer resp = jdbcTemplate.update(sql,observacion,idrec);
		logger.info("resp :"+resp);
		if(resp.equals(1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
	
