package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IUbicacionDAO;
import edu.moduloalumno.entity.Ubicacion;
import edu.moduloalumno.service.IUbicacionService;

@Service
public class UbicacionServiceImpl implements IUbicacionService {
	@Autowired
	private IUbicacionDAO UbicacionDAO;

	@Override
	public Ubicacion getUbicacionById(int idUbicacion) {
		Ubicacion Ubicacion = UbicacionDAO.getUbicacionById(idUbicacion);
		return Ubicacion;
	}

	@Override
	public List<Ubicacion> getAllUbicacions() {
		return UbicacionDAO.getAllUbicacions();
	}

	@Override
	public synchronized void addUbicacion(Ubicacion ubicacion) {
		UbicacionDAO.addUbicacion(ubicacion);

	}

	@Override
	public void updateUbicacion(Ubicacion ubicacion) {
		UbicacionDAO.updateUbicacion(ubicacion);
	}

	@Override
	public void deleteUbicacion(int idUbicacion) {
		UbicacionDAO.deleteUbicacion(idUbicacion);
	}
}