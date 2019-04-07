package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoAlumnoProgramaDAO;
import edu.moduloalumno.entity.AlumnoAlumnoPrograma;
import edu.moduloalumno.service.IAlumnoAlumnoProgramaService;

@Service
public class AlumnoAlumnoProgramaServiceImpl implements IAlumnoAlumnoProgramaService {
	@Autowired
	private IAlumnoAlumnoProgramaDAO alumnoAlumnoProgramaDAO;

	@Override
	public AlumnoAlumnoPrograma getAlumnoAlumnoProgramaById(int idAlum) {
		AlumnoAlumnoPrograma obj = alumnoAlumnoProgramaDAO.getAlumnoAlumnoProgramaById(idAlum);
		return obj;
	}

	@Override
	public List<AlumnoAlumnoPrograma> getAllAlumnoAlumnoProgramas() {
		return alumnoAlumnoProgramaDAO.getAllAlumnoAlumnoProgramas();
	}

	@Override
	public synchronized AlumnoAlumnoPrograma addAlumnoAlumnoPrograma(AlumnoAlumnoPrograma alumnoAlumnoPrograma) {
		return alumnoAlumnoProgramaDAO.addAlumnoAlumnoPrograma(alumnoAlumnoPrograma);
	}

	@Override
	public void updateAlumnoAlumnoPrograma(AlumnoAlumnoPrograma alumnoAlumnoPrograma) {
		alumnoAlumnoProgramaDAO.updateAlumnoAlumnoPrograma(alumnoAlumnoPrograma);
	}

	@Override
	public void deleteAlumnoAlumnoPrograma(int idAlum) {
		alumnoAlumnoProgramaDAO.deleteAlumnoAlumnoPrograma(idAlum);
	}
}
