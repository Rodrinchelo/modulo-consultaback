package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.BeneficioReporteCiclo;

public class BeneficioReporte_RowMapper implements RowMapper<BeneficioReporteCiclo> {

	@Override
	public BeneficioReporteCiclo mapRow(ResultSet rs, int rowNum) throws SQLException {
		BeneficioReporteCiclo br = new BeneficioReporteCiclo();
		
		br.setCiclo(rs.getFloat("ciclo"));
		br.setD_ciclo(rs.getFloat("d_ciclo"));
		br.setEpg(rs.getInt("epg"));
		br.setUpg(rs.getInt("upg"));
		br.setD_epg(rs.getInt("d_epg"));
		br.setD_upg(rs.getFloat("d_upg"));
		br.setTipo(rs.getString("tipo"));
		return br;
	}

}