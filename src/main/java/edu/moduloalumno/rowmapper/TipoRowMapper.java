package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Tipo;

public class TipoRowMapper implements RowMapper<Tipo> {
	@Override
	public Tipo mapRow(ResultSet row, int rowNum) throws SQLException {
		Tipo tipo = new Tipo();
		tipo.setIdTipo(row.getInt("id_tipo"));
		tipo.setDescripcion(row.getString("descripcion"));
		return tipo;
	}
}