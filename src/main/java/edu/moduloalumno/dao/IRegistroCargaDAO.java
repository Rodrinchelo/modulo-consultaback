package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.RegistroCarga;

public interface IRegistroCargaDAO {

	List<RegistroCarga> getAllRegistroCargas();

	RegistroCarga getRegistroCargaById(int idRegistroCarga);

	void addRegistroCarga(RegistroCarga registroCarga);

	void updateRegistroCarga(RegistroCarga registroCarga);

	void deleteRegistroCarga(int idRegistroCarga);

}