package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.RegistroCarga;

public class RegistroCargaRowMapper implements RowMapper<RegistroCarga> {
	@Override
	public RegistroCarga mapRow(ResultSet row, int rowNum) throws SQLException {
		RegistroCarga registroCarga = new RegistroCarga();
		registroCarga.setIdRegistro(row.getInt("id_registro"));
		registroCarga.setNombreEquipo(row.getString("nombre_equipo"));
		registroCarga.setIp(row.getString("ip"));
		registroCarga.setRuta(row.getString("ruta"));
		registroCarga.setFechaCarga(row.getDate("fecha_carga"));
		return registroCarga;
	}
}