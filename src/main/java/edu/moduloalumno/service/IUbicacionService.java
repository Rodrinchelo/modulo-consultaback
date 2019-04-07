package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.Ubicacion;

public interface IUbicacionService {
	
	List<Ubicacion> getAllUbicacions();

	Ubicacion getUbicacionById(int idUbicacion);

	void addUbicacion(Ubicacion ubicacion);

	void updateUbicacion(Ubicacion ubicacion);

	void deleteUbicacion(int idUbicacion);
}