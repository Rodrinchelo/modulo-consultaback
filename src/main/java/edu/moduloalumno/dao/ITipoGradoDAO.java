package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.TipoGrado;

public interface ITipoGradoDAO {

	List<TipoGrado> getAllTipoGrados();

	TipoGrado getTipoGradoById(String idTipoGrado);

	void addTipoGrado(TipoGrado tipoGrado);

	void updateTipoGrado(TipoGrado tipoGrado);

	void deleteTipoGrado(String idTipoGrado);

}