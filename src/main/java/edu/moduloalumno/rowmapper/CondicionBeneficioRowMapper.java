package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.CondicionBeneficio;

public class CondicionBeneficioRowMapper implements RowMapper<CondicionBeneficio>{

	@Override
	public CondicionBeneficio mapRow(ResultSet rs, int rowNum) throws SQLException {
		CondicionBeneficio tipobeneficio = new CondicionBeneficio();
		tipobeneficio.setId_tbeneficio(rs.getInt("id_benef_condicion"));
		tipobeneficio.setCondicion(rs.getString("condicion"));
		return tipobeneficio;
	}

}
