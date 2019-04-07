package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.Usuario;

public interface IUsuarioService {
	
	List<Usuario> getAllUsuarios();

	Usuario getUsuarioById(int idUsuario);

	void addUsuario(Usuario usuario);

	void updateUsuario(Usuario usuario);

	void deleteUsuario(int idUsuario);
}