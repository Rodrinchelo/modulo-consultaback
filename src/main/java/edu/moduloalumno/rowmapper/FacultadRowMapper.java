package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Facultad;

public class FacultadRowMapper implements RowMapper<Facultad> {
	@Override
	public Facultad mapRow(ResultSet row, int rowNum) throws SQLException {
		Facultad facultad = new Facultad();
		facultad.setIdFacultad(row.getInt("id_facultad"));
		facultad.setNombre(row.getString("nombre"));
		return facultad;
	}
}