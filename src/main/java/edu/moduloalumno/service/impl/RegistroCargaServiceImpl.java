package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IRegistroCargaDAO;
import edu.moduloalumno.entity.RegistroCarga;
import edu.moduloalumno.service.IRegistroCargaService;

@Service
public class RegistroCargaServiceImpl implements IRegistroCargaService {
	@Autowired
	private IRegistroCargaDAO RegistroCargaDAO;

	@Override
	public RegistroCarga getRegistroCargaById(int idRegistroCarga) {
		RegistroCarga RegistroCarga = RegistroCargaDAO.getRegistroCargaById(idRegistroCarga);
		return RegistroCarga;
	}

	@Override
	public List<RegistroCarga> getAllRegistroCargas() {
		return RegistroCargaDAO.getAllRegistroCargas();
	}

	@Override
	public synchronized void addRegistroCarga(RegistroCarga registroCarga) {
		RegistroCargaDAO.addRegistroCarga(registroCarga);

	}

	@Override
	public void updateRegistroCarga(RegistroCarga registroCarga) {
		RegistroCargaDAO.updateRegistroCarga(registroCarga);
	}

	@Override
	public void deleteRegistroCarga(int idRegistroCarga) {
		RegistroCargaDAO.deleteRegistroCarga(idRegistroCarga);
	}
}