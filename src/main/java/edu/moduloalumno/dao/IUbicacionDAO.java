package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Ubicacion;

public interface IUbicacionDAO {

	List<Ubicacion> getAllUbicacions();

	Ubicacion getUbicacionById(int idUbicacion);

	void addUbicacion(Ubicacion ubicacion);

	void updateUbicacion(Ubicacion ubicacion);

	void deleteUbicacion(int idUbicacion);

}