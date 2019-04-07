package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Usuario;

public interface IUsuarioDAO {

	List<Usuario> getAllUsuarios();

	Usuario getUsuarioById(int idUsuario);

	void addUsuario(Usuario usuario);

	void updateUsuario(Usuario usuario);

	void deleteUsuario(int idUsuario);

}