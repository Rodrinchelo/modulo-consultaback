package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.RegistroCarga;

public interface IRegistroCargaService {
	
	List<RegistroCarga> getAllRegistroCargas();

	RegistroCarga getRegistroCargaById(int idRegistroCarga);

	void addRegistroCarga(RegistroCarga registroCarga);

	void updateRegistroCarga(RegistroCarga registroCarga);

	void deleteRegistroCarga(int idRegistroCarga);
}