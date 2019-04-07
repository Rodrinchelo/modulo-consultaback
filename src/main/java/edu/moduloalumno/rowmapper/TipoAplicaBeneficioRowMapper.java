package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.TipoAplicaBeneficio;


public class TipoAplicaBeneficioRowMapper implements RowMapper<TipoAplicaBeneficio>{

	@Override
	public TipoAplicaBeneficio mapRow(ResultSet rs, int rowNum) throws SQLException {
		TipoAplicaBeneficio tabeneficio = new TipoAplicaBeneficio();
		tabeneficio.setId(rs.getInt("id_bcc"));
		tabeneficio.setDescripcion(rs.getString("tipo"));
		return tabeneficio;
	}

}
