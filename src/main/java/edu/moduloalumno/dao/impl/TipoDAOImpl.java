package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.ITipoDAO;
import edu.moduloalumno.entity.Tipo;
import edu.moduloalumno.rowmapper.TipoRowMapper;

@Transactional
@Repository
public class TipoDAOImpl implements ITipoDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Tipo getTipoById(int idTipo) {
		String sql = "SELECT id_tipo, descripcion FROM tipo WHERE id_tipo = ?";
		RowMapper<Tipo> rowMapper = new BeanPropertyRowMapper<Tipo>(Tipo.class);
		Tipo tipo = jdbcTemplate.queryForObject(sql, rowMapper, idTipo);
		return tipo;
	}

	@Override
	public List<Tipo> getAllTipos() {
		String sql = "SELECT id_tipo, descripcion FROM tipo";
		// RowMapper<Tipo> rowMapper = new
		// BeanPropertyRowMapper<Tipo>(Tipo.class);
		RowMapper<Tipo> rowMapper = new TipoRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addTipo(Tipo tipo) {
		// Add tipo
		String sql = "INSERT INTO tipo (id_tipo, descripcion) values (?, ?)";
		jdbcTemplate.update(sql, tipo.getIdTipo(),
		tipo.getDescripcion());

		// Fetch tipo id
		sql = "SELECT id_tipo FROM tipo WHERE id_tipo = ?";
		int idTipo = jdbcTemplate.queryForObject(sql, Integer.class, tipo.getIdTipo());

		// Set tipo id
		tipo.setIdTipo(idTipo);
	}

	@Override
	public void updateTipo(Tipo tipo) {
		String sql = "UPDATE tipo SET descripcion = ? WHERE id_tipo = ?";
		jdbcTemplate.update(sql, tipo.getDescripcion(), tipo.getIdTipo());
	}

	@Override
	public void deleteTipo(int idTipo) {
		String sql = "DELETE FROM tipo WHERE id_tipo = ?";
		jdbcTemplate.update(sql, idTipo);
	}

}