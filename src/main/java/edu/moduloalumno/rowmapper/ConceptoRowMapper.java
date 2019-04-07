package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Concepto;

public class ConceptoRowMapper implements RowMapper<Concepto> {
	@Override
	public Concepto mapRow(ResultSet row, int rowNum) throws SQLException {
		Concepto concepto = new Concepto();
		concepto.setIdConcepto(row.getInt("id_concepto"));
		concepto.setConcepto(row.getString("concepto"));
		concepto.setConcepA(row.getString("concep_a"));
		concepto.setConcepB(row.getString("concep_b"));
		concepto.setDescripcion(row.getString("descripcion"));
		concepto.setIdClasePagos(row.getInt("id_clase_pagos"));
		return concepto;
	}
}