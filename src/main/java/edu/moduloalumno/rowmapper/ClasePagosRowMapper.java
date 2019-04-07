package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.ClasePagos;

public class ClasePagosRowMapper implements RowMapper<ClasePagos> {
	@Override
	public ClasePagos mapRow(ResultSet row, int rowNum) throws SQLException {
		ClasePagos clasePagos = new ClasePagos();
		clasePagos.setIdClasePagos(row.getInt("id_clase_pagos"));
		clasePagos.setDescripcion(row.getString("descripcion"));
		return clasePagos;
	}
}