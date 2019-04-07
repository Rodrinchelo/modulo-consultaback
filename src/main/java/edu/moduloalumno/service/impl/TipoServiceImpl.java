package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.ITipoDAO;
import edu.moduloalumno.entity.Tipo;
import edu.moduloalumno.service.ITipoService;

@Service
public class TipoServiceImpl implements ITipoService {
	@Autowired
	private ITipoDAO TipoDAO;

	@Override
	public Tipo getTipoById(int idTipo) {
		Tipo Tipo = TipoDAO.getTipoById(idTipo);
		return Tipo;
	}

	@Override
	public List<Tipo> getAllTipos() {
		return TipoDAO.getAllTipos();
	}

	@Override
	public synchronized void addTipo(Tipo tipo) {
		TipoDAO.addTipo(tipo);

	}

	@Override
	public void updateTipo(Tipo tipo) {
		TipoDAO.updateTipo(tipo);
	}

	@Override
	public void deleteTipo(int idTipo) {
		TipoDAO.deleteTipo(idTipo);
	}
}