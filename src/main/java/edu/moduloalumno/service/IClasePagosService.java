package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.ClasePagos;

public interface IClasePagosService {
	
	List<ClasePagos> getAllClasePagoss();

	ClasePagos getClasePagosById(int idClasePagos);

	void addClasePagos(ClasePagos clasePagos);

	void updateClasePagos(ClasePagos clasePagos);

	void deleteClasePagos(int idClasePagos);
}