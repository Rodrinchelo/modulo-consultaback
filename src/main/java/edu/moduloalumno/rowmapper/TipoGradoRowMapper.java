package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.TipoGrado;

public class TipoGradoRowMapper implements RowMapper<TipoGrado> {
	@Override
	public TipoGrado mapRow(ResultSet row, int rowNum) throws SQLException {
		TipoGrado tipoGrado = new TipoGrado();
		tipoGrado.setIdTipGrado(row.getString("id_tip_grado"));
		tipoGrado.setNomTipGrado(row.getString("nom_tip_grado"));
		return tipoGrado;
	}
}