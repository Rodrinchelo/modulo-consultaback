package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.TipoBeneficio;

public class TipoBeneficioRowMapper implements RowMapper<TipoBeneficio> {

	@Override
	public TipoBeneficio mapRow(ResultSet rs, int rowNum) throws SQLException {
		TipoBeneficio tipobeneficio = new TipoBeneficio();
		tipobeneficio.setId_tipo(rs.getInt("id_beneficio"));
		tipobeneficio.setTipo(rs.getString("tipo"));
		tipobeneficio.setResolucion(rs.getString("resolucion"));
		tipobeneficio.setBeneficio_max(rs.getString("beneficio_max"));
		return tipobeneficio;
	}

	
}
