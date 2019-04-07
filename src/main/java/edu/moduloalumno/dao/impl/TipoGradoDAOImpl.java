package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.ITipoGradoDAO;
import edu.moduloalumno.entity.TipoGrado;
import edu.moduloalumno.rowmapper.TipoGradoRowMapper;

@Transactional
@Repository
public class TipoGradoDAOImpl implements ITipoGradoDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public TipoGrado getTipoGradoById(String idTipoGrado) {
		String sql = "SELECT id_tip_grado, nom_tip_grado FROM tipo_grado WHERE id_tip_grado = ?";
		RowMapper<TipoGrado> rowMapper = new BeanPropertyRowMapper<TipoGrado>(TipoGrado.class);
		TipoGrado tipoGrado = jdbcTemplate.queryForObject(sql, rowMapper, idTipoGrado);
		return tipoGrado;
	}

	@Override
	public List<TipoGrado> getAllTipoGrados() {
		String sql = "SELECT id_tip_grado, nom_tip_grado FROM tipo_grado";
		// RowMapper<TipoGrado> rowMapper = new
		// BeanPropertyRowMapper<TipoGrado>(TipoGrado.class);
		RowMapper<TipoGrado> rowMapper = new TipoGradoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addTipoGrado(TipoGrado tipoGrado) {
		// Add tipoGrado
		String sql = "INSERT INTO tipo_grado (id_tip_grado, nom_tip_grado) values (?, ?)";
		jdbcTemplate.update(sql, tipoGrado.getIdTipGrado(),
		tipoGrado.getNomTipGrado());

		// Fetch tipoGrado id
		sql = "SELECT id_tip_grado FROM tipo_grado WHERE id_tip_grado = ?";
		String idTipoGrado = jdbcTemplate.queryForObject(sql, String.class, tipoGrado.getIdTipGrado());

		// Set tipoGrado id
		tipoGrado.setIdTipGrado(idTipoGrado);
	}

	@Override
	public void updateTipoGrado(TipoGrado tipoGrado) {
		String sql = "UPDATE tipo_grado SET nom_tip_grado = ? WHERE id_tip_grado = ?";
		jdbcTemplate.update(sql, tipoGrado.getNomTipGrado(), tipoGrado.getIdTipGrado());
	}

	@Override
	public void deleteTipoGrado(String idTipoGrado) {
		String sql = "DELETE FROM tipo_grado WHERE id_tip_grado = ?";
		jdbcTemplate.update(sql, idTipoGrado);
	}

}