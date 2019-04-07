package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Tipo;

public interface ITipoDAO {

	List<Tipo> getAllTipos();

	Tipo getTipoById(int idTipo);

	void addTipo(Tipo tipo);

	void updateTipo(Tipo tipo);

	void deleteTipo(int idTipo);

}