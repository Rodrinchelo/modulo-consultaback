package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoDAO;
import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.service.IAlumnoService;

@Service
public class AlumnoServiceImpl implements IAlumnoService {
	@Autowired
	private IAlumnoDAO alumnoDAO;

	@Override
	public Alumno getAlumnoById(int idAlum) {
		Alumno alumno = alumnoDAO.getAlumnoById(idAlum);
		
		return alumno;
	}
	
	@Override
	public Alumno getAlumnoIdByApeNom(String apeNom) {
		Alumno alumno = alumnoDAO.getAlumnoIdByApeNom(apeNom);
		
		return alumno;
	}
	
	@Override
	public List<Alumno> getAlumnoIdByNombresApellidos(String nombres,String apellidos) {
		return alumnoDAO.getAlumnoIdByNombresApellidos(nombres, apellidos);
	}
	
	@Override
	public List<Alumno> getAlumnoIdByNombresApellidosRestringido(String nombresApellidos) {
		return alumnoDAO.getAlumnoIdByNombresApellidosRestringido(nombresApellidos);
	}

	@Override
	public List<Alumno> getAllAlumnos() {
		
		List<Alumno> alumnoList = alumnoDAO.getAllAlumnos();
		
		return alumnoList;
	}

	@Override
	public synchronized void addAlumno(Alumno alumno) {
		alumnoDAO.addAlumno(alumno);

	}

	@Override
	public void updateAlumno(Alumno alumno) {
		alumnoDAO.updateAlumno(alumno);
	}

	@Override
	public void deleteAlumno(int idAlum) {
		alumnoDAO.deleteAlumno(idAlum);
	}


}