package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IClasePagosDAO;
import edu.moduloalumno.entity.ClasePagos;
import edu.moduloalumno.rowmapper.ClasePagosRowMapper;

@Transactional
@Repository
public class ClasePagosDAOImpl implements IClasePagosDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public ClasePagos getClasePagosById(int idClasePagos) {
		String sql = "SELECT id_clase_pagos, descripcion FROM clase_pagos WHERE id_clase_pagos = ?";
		RowMapper<ClasePagos> rowMapper = new BeanPropertyRowMapper<ClasePagos>(ClasePagos.class);
		ClasePagos clasePagos = jdbcTemplate.queryForObject(sql, rowMapper, idClasePagos);
		return clasePagos;
	}

	@Override
	public List<ClasePagos> getAllClasePagoss() {
		String sql = "SELECT id_clase_pagos, descripcion FROM clase_pagos";
		// RowMapper<ClasePagos> rowMapper = new
		// BeanPropertyRowMapper<ClasePagos>(ClasePagos.class);
		RowMapper<ClasePagos> rowMapper = new ClasePagosRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addClasePagos(ClasePagos clasePagos) {
		// Add clasePagos
		String sql = "INSERT INTO clase_pagos (id_clase_pagos, descripcion) values (?, ?)";
		jdbcTemplate.update(sql, clasePagos.getIdClasePagos(), clasePagos.getDescripcion());

		// Fetch clasePagos id
		sql = "SELECT id_clase_pagos FROM clase_pagos WHERE id_clase_pagos = ?";
		int idClasePagos = jdbcTemplate.queryForObject(sql, Integer.class, clasePagos.getIdClasePagos());

		// Set clasePagos id
		clasePagos.setIdClasePagos(idClasePagos);
	}

	@Override
	public void updateClasePagos(ClasePagos clasePagos) {
		String sql = "UPDATE clase_pagos SET descripcion = ? WHERE id_clase_pagos = ?";
		jdbcTemplate.update(sql, clasePagos.getDescripcion(), clasePagos.getIdClasePagos());
	}

	@Override
	public void deleteClasePagos(int idClasePagos) {
		String sql = "DELETE FROM clase_pagos WHERE id_clase_pagos = ?";
		jdbcTemplate.update(sql, idClasePagos);
	}

}