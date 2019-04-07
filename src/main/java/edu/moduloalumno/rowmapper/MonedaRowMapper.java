package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import edu.moduloalumno.entity.Moneda;

public class MonedaRowMapper implements RowMapper<Moneda>{

	@Override
	public Moneda mapRow(ResultSet rs, int rowNum) throws SQLException {
		Moneda moneda = new Moneda();
		moneda.setId_moneda(rs.getString("id_moneda"));
		moneda.setMoneda(rs.getString("moneda"));
		moneda.setMascara(rs.getString("mascara"));
		return moneda;
	}
}
