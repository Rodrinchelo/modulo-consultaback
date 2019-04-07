package edu.moduloalumno.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IFacultadDAO;
import edu.moduloalumno.entity.Facultad;
import edu.moduloalumno.service.IFacultadService;

@Service
public class FacultadServiceImpl implements IFacultadService {
	@Autowired
	private IFacultadDAO FacultadDAO;

	@Override
	public Facultad getFacultadById(int idFacultad) {
		Facultad Facultad = FacultadDAO.getFacultadById(idFacultad);
		return Facultad;
	}

	@Override
	public List<Facultad> getAllFacultads() {
		return FacultadDAO.getAllFacultads();
	}

	@Override
	public synchronized void addFacultad(Facultad facultad) {
		FacultadDAO.addFacultad(facultad);

	}

	@Override
	public void updateFacultad(Facultad facultad) {
		FacultadDAO.updateFacultad(facultad);
	}

	@Override
	public void deleteFacultad(int idFacultad) {
		FacultadDAO.deleteFacultad(idFacultad);
	}
}