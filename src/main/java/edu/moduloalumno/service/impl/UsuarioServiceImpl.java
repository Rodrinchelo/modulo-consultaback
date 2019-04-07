package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IUsuarioDAO;
import edu.moduloalumno.entity.Usuario;
import edu.moduloalumno.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	@Autowired
	private IUsuarioDAO UsuarioDAO;

	@Override
	public Usuario getUsuarioById(int idUsuario) {
		Usuario Usuario = UsuarioDAO.getUsuarioById(idUsuario);
		return Usuario;
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		return UsuarioDAO.getAllUsuarios();
	}

	@Override
	public synchronized void addUsuario(Usuario usuario) {
		UsuarioDAO.addUsuario(usuario);

	}

	@Override
	public void updateUsuario(Usuario usuario) {
		UsuarioDAO.updateUsuario(usuario);
	}

	@Override
	public void deleteUsuario(int idUsuario) {
		UsuarioDAO.deleteUsuario(idUsuario);
	}
}