package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IUsuarioDAO;
import edu.moduloalumno.entity.Usuario;
import edu.moduloalumno.rowmapper.UsuarioRowMapper;

@Transactional
@Repository
public class UsuarioDAOImpl implements IUsuarioDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Usuario getUsuarioById(int idUsuario) {
		String sql = "SELECT id_usuario, user_name, pass FROM usuario WHERE id_usuario = ?";
		RowMapper<Usuario> rowMapper = new BeanPropertyRowMapper<Usuario>(Usuario.class);
		Usuario usuario = jdbcTemplate.queryForObject(sql, rowMapper, idUsuario);
		return usuario;
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		String sql = "SELECT id_usuario, user_name, pass FROM usuario";
		// RowMapper<Usuario> rowMapper = new
		// BeanPropertyRowMapper<Usuario>(Usuario.class);
		RowMapper<Usuario> rowMapper = new UsuarioRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addUsuario(Usuario usuario) {
		// Add usuario
		String sql = "INSERT INTO usuario (id_usuario, user_name, pass) values (?, ?, ?)";
		jdbcTemplate.update(sql, usuario.getIdUsuario(), usuario.getUserName(), usuario.getPass());

		// Fetch usuario id
		sql = "SELECT id_usuario FROM usuario WHERE id_usuario = ?";
		int idUsuario = jdbcTemplate.queryForObject(sql, Integer.class, usuario.getIdUsuario());

		// Set usuario id
		usuario.setIdUsuario(idUsuario);
	}

	@Override
	public void updateUsuario(Usuario usuario) {
		String sql = "UPDATE usuario SET descripcion = ? WHERE id_usuario = ?";
		jdbcTemplate.update(sql, usuario.getUserName(), usuario.getPass(), usuario.getIdUsuario());
	}

	@Override
	public void deleteUsuario(int idUsuario) {
		String sql = "DELETE FROM usuario WHERE id_usuario = ?";
		jdbcTemplate.update(sql, idUsuario);
	}

}