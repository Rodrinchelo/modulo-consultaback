package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.Alumno;

public interface IAlumnoService {
	
	List<Alumno> getAllAlumnos();

	Alumno getAlumnoById(int idAlum);
	
	Alumno getAlumnoIdByApeNom(String apeNom);
	
	List<Alumno> getAlumnoIdByNombresApellidos(String nombres,String apellidos);
	
	List<Alumno> getAlumnoIdByNombresApellidosRestringido(String nombresApellidos);

	void addAlumno(Alumno alumno);

	void updateAlumno(Alumno alumno);

	void deleteAlumno(int idAlum);
}