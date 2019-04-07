package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Alumno;

public class AlumnoRowMapper implements RowMapper<Alumno> {
	@Override
	public Alumno mapRow(ResultSet row, int rowNum) throws SQLException {
		Alumno alumno = new Alumno();
		alumno.setIdAlum(row.getInt("id_alum"));
		alumno.setApeNom(row.getString("ape_nom"));
		alumno.setCodigo(row.getString("codigo"));
		alumno.setDni(row.getString("dni"));
		alumno.setIdFacultad(row.getInt("id_facultad"));
		return alumno;
	}
}