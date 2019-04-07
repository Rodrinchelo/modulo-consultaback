package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Ubicacion;

public class UbicacionRowMapper implements RowMapper<Ubicacion> {
	@Override
	public Ubicacion mapRow(ResultSet row, int rowNum) throws SQLException {
		Ubicacion ubicacion = new Ubicacion();
		ubicacion.setIdUbicacion(row.getInt("id_ubicacion"));
		ubicacion.setDescripcion(row.getString("descripcion"));
		return ubicacion;
	}
}