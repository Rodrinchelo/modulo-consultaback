package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.TipoGrado;

public interface ITipoGradoService {
	
	List<TipoGrado> getAllTipoGrados();

	TipoGrado getTipoGradoById(String idTipoGrado);

	void addTipoGrado(TipoGrado tipoGrado);

	void updateTipoGrado(TipoGrado tipoGrado);

	void deleteTipoGrado(String idTipoGrado);
}