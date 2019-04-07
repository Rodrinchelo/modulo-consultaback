package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AlumnoPrograma;

public class AlumnoProgramaRowMapper implements RowMapper<AlumnoPrograma> {
	@Override
	public AlumnoPrograma mapRow(ResultSet row, int rowNum) throws SQLException {
		AlumnoPrograma alumnoPrograma = new AlumnoPrograma();
		alumnoPrograma.setCodAlumno(row.getString("cod_alumno"));
		alumnoPrograma.setApePaterno(row.getString("ape_paterno"));
		alumnoPrograma.setApeMaterno(row.getString("ape_materno"));
		alumnoPrograma.setNomAlumno(row.getString("nom_alumno"));
		alumnoPrograma.setCodEspecialidad(row.getString("cod_especialidad"));
		alumnoPrograma.setCodTipIngreso(row.getString("cod_tip_ingreso"));
		alumnoPrograma.setCodSitu(row.getString("cod_situ"));
		alumnoPrograma.setCodPerm(row.getString("cod_perm"));
		alumnoPrograma.setAnioIngreso(row.getString("anio_ingreso"));
		alumnoPrograma.setDniM(row.getString("dni_m"));
		alumnoPrograma.setIdPrograma(row.getInt("id_programa"));
		alumnoPrograma.setNom_programa(row.getString("nom_programa"));
		return alumnoPrograma;
	}
}