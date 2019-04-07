package edu.moduloalumno.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IRecaudacionesDAO;
import edu.moduloalumno.entity.Recaudaciones;
import edu.moduloalumno.service.IRecaudacionesService;

@Service
public class RecaudacionesServiceImpl implements IRecaudacionesService {
	@Autowired
	private IRecaudacionesDAO recaudacionesDAO;
	
	@Override
	public List<Recaudaciones> getAllRecaudaciones() {
		return recaudacionesDAO.getAllRecaudaciones();
	}

	@Override
	public Recaudaciones getRecaudacionesById(int idRecaudaciones) {

		Recaudaciones recaudaciones = recaudacionesDAO.getRecaudacionesById(idRecaudaciones);
		
		return recaudaciones;
	}

	@Override
	public List<Recaudaciones> getRecaudacionesByStartDateBetween(Date fechaInicial, Date fechaFinal) {

		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionesByStartDateBetween(fechaInicial,
				fechaFinal);
		return recaudacionesList;
	}

	@Override
	public List<Recaudaciones> getRecaudacionesByNomApeStartDateBetween(String nomApe, Date fechaInicial,
			Date fechaFinal) {

		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionesByNomApeStartDateBetween(nomApe,
				fechaInicial, fechaFinal);
		
		return recaudacionesList;
	}

	@Override
	public List<Recaudaciones> getRecaudacionesByNomApe(String nomApe) {

		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionesByNomApe(nomApe);
		return recaudacionesList;
	}

	@Override
	public List<Recaudaciones> getRecaudacionesByNomApeConcepto(String concepto, String nomApe) {

		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionesByNomApeConcepto(concepto, nomApe);
		
		return recaudacionesList;
	}

	@Override
	public List<Recaudaciones> getRecaudacionesByNomApeRecibo(String recibo, String nomApe) {

		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionesByNomApeRecibo(recibo, nomApe);
		return recaudacionesList;

	}

	@Override
	public List<Recaudaciones> getRecaudacionesByPosgrado() {
		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionesByPosgrado();
		
		return recaudacionesList;
	}

	@Override
	public List<Recaudaciones> getRecaudacionesByNombresApellidosStartDateBetween(String nombres, String apellidos,
			Date fechaInicial, Date fechaFinal) {

		List<Recaudaciones> recaudacionesList = recaudacionesDAO
				.getRecaudacionesByNombresApellidosStartDateBetween(nombres, apellidos, fechaInicial, fechaFinal);
		
		return recaudacionesList;
	}

	@Override
	public List<Recaudaciones> getRecaudacionesByNombresApellidos(String nombres, String apellidos) {

		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionesByNombresApellidos(nombres, apellidos);
		
		return recaudacionesList;
	}

	@Override
	public List<Recaudaciones> getRecaudacionesByNombresApellidosConcepto(String concepto, String nombres,
			String apellidos) {

		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionesByNombresApellidosConcepto(concepto,
				nombres, apellidos);
		
		return recaudacionesList;
	}

	@Override
	public List<Recaudaciones> getRecaudacionesByNombresApellidosRecibo(String recibo, String nombres,
			String apellidos) {

		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionesByNombresApellidosRecibo(recibo,
				nombres, apellidos);
		return recaudacionesList;
	}

	@Override
	public synchronized void addRecaudaciones(Recaudaciones recaudaciones) {
		recaudacionesDAO.addRecaudaciones(recaudaciones);

	}

	@Override
	public int updateRecaudaciones(Recaudaciones recaudaciones) {
		return recaudacionesDAO.updateRecaudaciones(recaudaciones);
	}

	@Override
	public int updateRecaudaciones(List<Recaudaciones> reacaudacionesList) {
		int update = 0;
		for (Recaudaciones recaudaciones : reacaudacionesList) {
			update+=recaudacionesDAO.updateRecaudaciones(recaudaciones);
		}
		return update;
	}

	@Override
	public void updateRecaudaciones(int idRec, String codAlum, int idProg) {
		recaudacionesDAO.updateRecaudaciones(idRec,codAlum,idProg);
	}

	@Override
	public void deleteRecaudaciones(int idRecaudaciones) {
		recaudacionesDAO.deleteRecaudaciones(idRecaudaciones);
	}

	@Override
	public List<Recaudaciones> getRecaudacionReci(String recibo) {
		List<Recaudaciones> recaudacionesList = recaudacionesDAO.getRecaudacionReci(recibo);
		
		return recaudacionesList;
	}

}

