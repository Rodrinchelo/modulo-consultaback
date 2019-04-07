package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Programa;

public interface IProgramaDAO {

	List<Programa> getAllProgramas();

	Programa getProgramaById(int idPrograma);

	void addPrograma(Programa programa);

	void updatePrograma(Programa programa);

	void deletePrograma(int idPrograma);

}