package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Recaudaciones;

public class RecaudacionesRowMapper implements RowMapper<Recaudaciones> {
	@Override
	public Recaudaciones mapRow(ResultSet row, int rowNum) throws SQLException {
		Recaudaciones recaudaciones = new Recaudaciones();
		recaudaciones.setIdRec(row.getInt("id_rec"));
		recaudaciones.setIdAlum(row.getInt("id_alum"));
		recaudaciones.setApeNom(row.getString("ape_nom"));
		recaudaciones.setConcepto(row.getString("concepto"));
		recaudaciones.setDni(row.getString("dni"));
		recaudaciones.setNombre(row.getString("nombre"));
		recaudaciones.setMoneda(row.getString("moneda"));
		recaudaciones.setNumero(row.getString("numero"));
		recaudaciones.setImporte(row.getInt("importe"));
		recaudaciones.setFecha(row.getDate("fecha"));	
		recaudaciones.setCodAlum(row.getString("codAlum"));	
		recaudaciones.setIdProg(row.getInt("idProg"));		
		return recaudaciones;
	}
}