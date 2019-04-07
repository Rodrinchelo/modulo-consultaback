package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IProgramaDAO;
import edu.moduloalumno.entity.Programa;
import edu.moduloalumno.service.IProgramaService;

@Service
public class ProgramaServiceImpl implements IProgramaService {
	@Autowired
	private IProgramaDAO ProgramaDAO;

	@Override
	public Programa getProgramaById(int idPrograma) {
		Programa Programa = ProgramaDAO.getProgramaById(idPrograma);
		return Programa;
	}

	@Override
	public List<Programa> getAllProgramas() {
		return ProgramaDAO.getAllProgramas();
	}

	@Override
	public synchronized void addPrograma(Programa programa) {
		ProgramaDAO.addPrograma(programa);

	}

	@Override
	public void updatePrograma(Programa programa) {
		ProgramaDAO.updatePrograma(programa);
	}

	@Override
	public void deletePrograma(int idPrograma) {
		ProgramaDAO.deletePrograma(idPrograma);
	}
}