package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.Facultad;

public interface IFacultadDAO {

	List<Facultad> getAllFacultads();

	Facultad getFacultadById(int idFacultad);

	void addFacultad(Facultad facultad);

	void updateFacultad(Facultad facultad);

	void deleteFacultad(int idFacultad);

}