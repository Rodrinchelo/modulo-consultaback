package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IClasePagosDAO;
import edu.moduloalumno.entity.ClasePagos;
import edu.moduloalumno.service.IClasePagosService;

@Service
public class ClasePagosServiceImpl implements IClasePagosService {
	@Autowired
	private IClasePagosDAO clasePagosDAO;

	@Override
	public ClasePagos getClasePagosById(int idClasePagos) {
		ClasePagos ClasePagos = clasePagosDAO.getClasePagosById(idClasePagos);
		return ClasePagos;
	}

	@Override
	public List<ClasePagos> getAllClasePagoss() {
		return clasePagosDAO.getAllClasePagoss();
	}

	@Override
	public synchronized void addClasePagos(ClasePagos clasePagos) {
		clasePagosDAO.addClasePagos(clasePagos);

	}

	@Override
	public void updateClasePagos(ClasePagos clasePagos) {
		clasePagosDAO.updateClasePagos(clasePagos);
	}

	@Override
	public void deleteClasePagos(int idClasePagos) {
		clasePagosDAO.deleteClasePagos(idClasePagos);
	}
}