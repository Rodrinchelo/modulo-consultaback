package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.AlumnoProgramaBeneficioCon;



public class AlumnoBeneficioRowMapper implements RowMapper<AlumnoProgramaBeneficioCon> {

	@Override //beneficio
	public AlumnoProgramaBeneficioCon mapRow(ResultSet rs, int rowNum) throws SQLException {
		AlumnoProgramaBeneficioCon ab = new AlumnoProgramaBeneficioCon();
		ab.setCod_alumno(rs.getString("cod_alumno"));
		//ab.setId_programa(rs.getInt("id_programa"));
		ab.setId_beneficio(rs.getInt("id_beneficio"));
		ab.setAutorizacion(rs.getString("autorizacion"));
		ab.setResolucion(rs.getString("resolucion"));
		ab.setCondicion(rs.getString("condicion"));
		ab.setFecha(rs.getDate("fecha"));
		ab.setBenef_max(rs.getString("beneficio_max"));
		ab.setId_bc(rs.getInt("id_benef_condicion"));
		ab.setBenef_otrogado(rs.getInt("beneficio_otorgado"));
		ab.setTipo(rs.getString("tipo"));
		ab.setObservacion(rs.getString("observacion"));
		ab.setId_abp(rs.getInt("id_apb"));
		ab.setCriterio(rs.getString("criterio"));
		return ab;
		
		
	}

}