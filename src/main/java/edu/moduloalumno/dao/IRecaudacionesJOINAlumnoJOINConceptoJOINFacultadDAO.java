package edu.moduloalumno.dao;

import edu.moduloalumno.entity.CodigosporNomApe;
import java.util.Date;
import java.util.List;

import edu.moduloalumno.entity.RecaudacionesJOINAlumnoJOINConceptoJOINFacultad;

public interface IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadDAO {

	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads();
	
	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadIdByNombresApellidosRestringido( String nombres, String apellidos);

	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByStartDateBetween(Date fechaInicial,Date fechaFinal);

	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeStartDateBetween(String nomApe,Date fechaInicial,Date fechaFinal);

	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApe(String nomApe);
	
    List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByCodigo(String codigo);
        
	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeConcepto(String concepto, String nomApe);
	
	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeRecibo( String recibo, String nomApe);
	
	List<CodigosporNomApe> getCodigoByNombre(String nomApe); /* new*/
    
	boolean updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(Integer id_concepto,String moneda,Date fecha, String recibo,int ciclo,int idRec);
	
	boolean insertObservacion(String observacion,Integer idrec);
        
	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByPosgrado();

	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosStartDateBetween(String nombres,String apellidos,Date fechaInicial, Date fechaFinal);

	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidos(String nombres, String apellidos);
	
	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosConcepto(String concepto, String nombres, String apellidos);
	
	List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosRecibo( String recibo, String nombres, String apellidos);

	RecaudacionesJOINAlumnoJOINConceptoJOINFacultad getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadById(int idRec);

	int updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(RecaudacionesJOINAlumnoJOINConceptoJOINFacultad reacaudaciones);
	
	public int updateRecaudacionesCodAlumno(Integer id_rec,String cod_alumno);
	
	void deleteRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(int idRec);

}