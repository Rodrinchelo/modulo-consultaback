package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoProgramaJOINProgramaJOINAlumnoDAO;
import edu.moduloalumno.entity.AlumnoProgramaJOINProgramaJOINAlumno;
import edu.moduloalumno.entity.Programa;
import edu.moduloalumno.service.IAlumnoProgramaJOINProgramaJOINAlumnoService;

@Service
public class AlumnoProgramaJOINProgramaJOINAlumnoServiceImpl implements IAlumnoProgramaJOINProgramaJOINAlumnoService {
	@Autowired
	private IAlumnoProgramaJOINProgramaJOINAlumnoDAO alumnoAlumnoProgramaDAO;

	@Override
	public List<AlumnoProgramaJOINProgramaJOINAlumno> getAllAlumnoProgramaJOINProgramaJOINAlumnos() {
		return alumnoAlumnoProgramaDAO.getAllAlumnoProgramaJOINProgramaJOINAlumnos();
	}
	
	@Override
	public List<AlumnoProgramaJOINProgramaJOINAlumno> getAlumnoProgramaJOINProgramaJOINAlumnoIdByNombresApellidosRestringido(String nombresApellidos) {
		
		List<AlumnoProgramaJOINProgramaJOINAlumno> alumnoProgramaList = alumnoAlumnoProgramaDAO.getAlumnoProgramaJOINProgramaJOINAlumnoIdByNombresApellidosRestringido(nombresApellidos);
		
		return alumnoProgramaList;
	}

	@Override
	public Programa getProgramabyId(Integer id_programa) {
		Programa programa = alumnoAlumnoProgramaDAO.getProgramabyId(id_programa);
		return programa;
	}
	
	
}
