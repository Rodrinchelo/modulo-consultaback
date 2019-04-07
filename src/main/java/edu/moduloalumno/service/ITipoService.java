package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.Tipo;

public interface ITipoService {
	
	List<Tipo> getAllTipos();

	Tipo getTipoById(int idTipo);

	void addTipo(Tipo tipo);

	void updateTipo(Tipo tipo);

	void deleteTipo(int idTipo);
}