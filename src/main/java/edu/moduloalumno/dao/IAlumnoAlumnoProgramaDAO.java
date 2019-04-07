package edu.moduloalumno.dao;

import java.util.List;

import edu.moduloalumno.entity.AlumnoAlumnoPrograma;

public interface IAlumnoAlumnoProgramaDAO {

	List<AlumnoAlumnoPrograma> getAllAlumnoAlumnoProgramas();

	AlumnoAlumnoPrograma getAlumnoAlumnoProgramaById(int idAlum);

	AlumnoAlumnoPrograma addAlumnoAlumnoPrograma(AlumnoAlumnoPrograma alumnoAlumnoPrograma);

	void updateAlumnoAlumnoPrograma(AlumnoAlumnoPrograma alumnoAlumnoPrograma);

	void deleteAlumnoAlumnoPrograma(int idAlum);

}