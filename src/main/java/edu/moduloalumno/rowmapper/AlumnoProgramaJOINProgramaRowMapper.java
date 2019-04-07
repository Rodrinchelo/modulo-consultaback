package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AlumnoProgramaJOINProgramaJOINAlumno;

public class AlumnoProgramaJOINProgramaRowMapper implements RowMapper<AlumnoProgramaJOINProgramaJOINAlumno> {
	@Override
	public AlumnoProgramaJOINProgramaJOINAlumno mapRow(ResultSet row, int rowNum) throws SQLException {
		AlumnoProgramaJOINProgramaJOINAlumno alumnoProgramaJOINProgramaJOINAlumno = new AlumnoProgramaJOINProgramaJOINAlumno();
		alumnoProgramaJOINProgramaJOINAlumno.setIdAlumno(0);
		alumnoProgramaJOINProgramaJOINAlumno.setApeNom(row.getString("nom_alumno"));
		alumnoProgramaJOINProgramaJOINAlumno.setCodAlumno(row.getString("cod_alumno"));
		alumnoProgramaJOINProgramaJOINAlumno.setIdPrograma(row.getInt("id_programa"));
		alumnoProgramaJOINProgramaJOINAlumno.setNomPrograma(row.getString("nom_programa"));
		alumnoProgramaJOINProgramaJOINAlumno.setSiglaPrograma(row.getString("sigla_programa"));
		return alumnoProgramaJOINProgramaJOINAlumno;
	}
}







