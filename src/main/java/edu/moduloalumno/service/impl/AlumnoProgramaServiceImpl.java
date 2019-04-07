package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoProgramaDAO;
import edu.moduloalumno.entity.AlumnoPrograma;
import edu.moduloalumno.service.IAlumnoProgramaService;

@Service
public class AlumnoProgramaServiceImpl implements IAlumnoProgramaService {
	@Autowired
	private IAlumnoProgramaDAO alumnoProgramaDAO;

	@Override
	public AlumnoPrograma getAlumnoProgramaById(String codAlumno) {
		
		AlumnoPrograma alumnoPrograma = alumnoProgramaDAO.getAlumnoProgramaById(codAlumno);
		
		return alumnoPrograma;
	}
	
	@Override
	public List<AlumnoPrograma> getAlumnoProgramaByDni(String dni) {
		
		List<AlumnoPrograma> alumnoPrograma = alumnoProgramaDAO.getAlumnoProgramaByDni(dni);
		
		return alumnoPrograma;
	}

	@Override
	public List<AlumnoPrograma> getAllAlumnoProgramas() {
		
		List<AlumnoPrograma> alumnoProgramaList = alumnoProgramaDAO.getAllAlumnoProgramas();
		
		return alumnoProgramaList;
	}
	
	@Override
	public List<AlumnoPrograma> getAlumnoProgramasIdByNombresApellidos(String nombresApellidos) {
		
		List<AlumnoPrograma> alumnoProgramaList = alumnoProgramaDAO.getAlumnoProgramasIdByNombresApellidos(nombresApellidos);
		
		return alumnoProgramaList;
	}
	
	@Override
	public List<AlumnoPrograma> getAlumnoProgramasIdByCodAlumIdProg(String codAlum, Integer idProg) {
		
		List<AlumnoPrograma> alumnoProgramaList = alumnoProgramaDAO.getAlumnoProgramasIdByCodAlumIdProg(codAlum, idProg);
		
		return alumnoProgramaList;
	}

	@Override
	public List<AlumnoPrograma> getAlumnoProgramasIdByNombresApellidosRestringido(String nombresApellidos) {
		
		List<AlumnoPrograma> alumnoProgramaList = alumnoProgramaDAO.getAlumnoProgramasIdByNombresApellidosRestringido(nombresApellidos);
		
		return alumnoProgramaList;
	}

	@Override
	public synchronized void addAlumnoPrograma(AlumnoPrograma alumnoPrograma) {
		alumnoProgramaDAO.addAlumnoPrograma(alumnoPrograma);

	}

	@Override
	public void updateAlumnoPrograma(AlumnoPrograma alumnoPrograma) {
		alumnoProgramaDAO.updateAlumnoPrograma(alumnoPrograma);
	}

	@Override
	public void deleteAlumnoPrograma(String codAlumno) {
		alumnoProgramaDAO.deleteAlumnoPrograma(codAlumno);
	}

}