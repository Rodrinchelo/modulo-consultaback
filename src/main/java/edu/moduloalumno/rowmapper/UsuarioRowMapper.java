package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario> {
	@Override
	public Usuario mapRow(ResultSet row, int rowNum) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(row.getInt("id_usuario"));
		usuario.setUserName(row.getString("user_name"));
		usuario.setPass(row.getString("pass"));
		return usuario;
	}
}