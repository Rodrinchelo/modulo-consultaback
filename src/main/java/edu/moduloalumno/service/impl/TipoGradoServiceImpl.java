package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.ITipoGradoDAO;
import edu.moduloalumno.entity.TipoGrado;
import edu.moduloalumno.service.ITipoGradoService;

@Service
public class TipoGradoServiceImpl implements ITipoGradoService {
	@Autowired
	private ITipoGradoDAO TipoGradoDAO;

	@Override
	public TipoGrado getTipoGradoById(String idTipoGrado) {
		TipoGrado TipoGrado = TipoGradoDAO.getTipoGradoById(idTipoGrado);
		return TipoGrado;
	}

	@Override
	public List<TipoGrado> getAllTipoGrados() {
		return TipoGradoDAO.getAllTipoGrados();
	}

	@Override
	public synchronized void addTipoGrado(TipoGrado tipoGrado) {
		TipoGradoDAO.addTipoGrado(tipoGrado);

	}

	@Override
	public void updateTipoGrado(TipoGrado tipoGrado) {
		TipoGradoDAO.updateTipoGrado(tipoGrado);
	}

	@Override
	public void deleteTipoGrado(String idTipoGrado) {
		TipoGradoDAO.deleteTipoGrado(idTipoGrado);
	}
}