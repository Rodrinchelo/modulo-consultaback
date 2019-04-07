package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.RecaudacionesJOINAlumnoJOINConceptoJOINFacultad;

public class RecaudacionesJOINAlumnoJOINConceptoJOINFacultadRowMapper implements RowMapper<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> {
	@Override
	public RecaudacionesJOINAlumnoJOINConceptoJOINFacultad mapRow(ResultSet row, int rowNum) throws SQLException {
		RecaudacionesJOINAlumnoJOINConceptoJOINFacultad recaudacionesJOINAlumnoJOINConceptoJOINFacultad = new RecaudacionesJOINAlumnoJOINConceptoJOINFacultad();
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setIdRec(row.getInt("id_rec"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setIdAlum(row.getInt("id_alum"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setApeNom(row.getString("ape_nom"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setCiclo(row.getInt("ciclo"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setConcepto(row.getString("concepto"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setDni(row.getString("dni"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setNumero(row.getString("numero"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setNombre(row.getString("nombre"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setMoneda(row.getString("id_moneda"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setMoneda2(row.getString("moneda"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setImporte(row.getDouble("importe"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setIdconcepto(row.getInt("id_concepto"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setFecha(row.getDate("fecha"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setAnio_ingreso(row.getString("anio_ingreso"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setIdPrograma(row.getInt("id_programa"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setNomPrograma(row.getString("nom_programa")); //
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setSigla_programa(row.getString("sigla_programa")); 
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setCodAlumno(row.getString("cod_alumno"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setEstado(row.getString("estado"));
		recaudacionesJOINAlumnoJOINConceptoJOINFacultad.setObservacion(row.getString("observacion"));
		return recaudacionesJOINAlumnoJOINConceptoJOINFacultad;
	}
}







