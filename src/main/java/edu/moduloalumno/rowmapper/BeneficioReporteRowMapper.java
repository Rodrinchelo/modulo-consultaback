package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.BeneficioReporteCredito;

public class BeneficioReporteRowMapper implements RowMapper<BeneficioReporteCredito> {

	@Override
	public BeneficioReporteCredito mapRow(ResultSet rs, int rowNum) throws SQLException {
		BeneficioReporteCredito br = new BeneficioReporteCredito();
		br.setCosto_credito(rs.getInt("costo_credito"));
		br.setCreditos(rs.getInt("creditos"));
		br.setTotal(rs.getInt("total"));
		br.setEpg(rs.getInt("epg"));
		br.setUpg(rs.getInt("upg"));
		br.setD_total(rs.getFloat("d_total"));
		br.setD_epg(rs.getInt("d_epg"));
		br.setD_upg(rs.getFloat("d_upg"));
		br.setTipo(rs.getString("tipo"));
		return br;
	}

}
