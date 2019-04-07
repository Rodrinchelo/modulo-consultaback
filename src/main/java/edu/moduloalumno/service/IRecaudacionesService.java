package edu.moduloalumno.service;

import java.util.Date;
import java.util.List;

import edu.moduloalumno.entity.Recaudaciones;

public interface IRecaudacionesService {
	
	List<Recaudaciones> getAllRecaudaciones();

	List<Recaudaciones> getRecaudacionesByStartDateBetween(Date fechaInicial,Date fechaFinal);

	List<Recaudaciones> getRecaudacionesByNomApeStartDateBetween(String nomApe,Date fechaInicial,Date fechaFinal);

	List<Recaudaciones> getRecaudacionesByNomApe(String nomApe);
	
	List<Recaudaciones> getRecaudacionesByNomApeConcepto(String concepto, String nomApe);
	
	List<Recaudaciones> getRecaudacionesByNomApeRecibo( String recibo, String nomApe);
	
	List<Recaudaciones> getRecaudacionReci(String recibo);
	
	List<Recaudaciones> getRecaudacionesByPosgrado();

	List<Recaudaciones> getRecaudacionesByNombresApellidosStartDateBetween(String nombres,String apellidos,Date fechaInicial, Date fechaFinal);

	List<Recaudaciones> getRecaudacionesByNombresApellidos(String nombres, String apellidos);
	
	List<Recaudaciones> getRecaudacionesByNombresApellidosConcepto(String concepto, String nombres, String apellidos);
	
	List<Recaudaciones> getRecaudacionesByNombresApellidosRecibo( String recibo, String nombres, String apellidos);
	
	Recaudaciones getRecaudacionesById(int idRecaudaciones);

	void addRecaudaciones(Recaudaciones recaudaciones);

	int updateRecaudaciones(Recaudaciones recaudaciones);	

	void updateRecaudaciones(int idRec, String codAlum, int idProg);	
	
	int updateRecaudaciones(List<Recaudaciones> reacaudacionesList);

	void deleteRecaudaciones(int idRecaudaciones);
}