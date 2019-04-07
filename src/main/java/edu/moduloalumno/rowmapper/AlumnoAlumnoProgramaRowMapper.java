package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AlumnoAlumnoPrograma;

public class AlumnoAlumnoProgramaRowMapper implements RowMapper<AlumnoAlumnoPrograma> {
	@Override
	public AlumnoAlumnoPrograma mapRow(ResultSet row, int rowNum) throws SQLException {
		AlumnoAlumnoPrograma alumnoAlumnoPrograma = new AlumnoAlumnoPrograma();
		alumnoAlumnoPrograma.setIdAlumno(row.getInt("id_alum"));
		alumnoAlumnoPrograma.setCodAlumno(row.getString("cod_alumno"));
		alumnoAlumnoPrograma.setIdPrograma(row.getInt("id_programa"));
		return alumnoAlumnoPrograma;
	}
}
