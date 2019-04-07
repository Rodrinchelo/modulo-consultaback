package edu.moduloalumno.dao;

import java.util.Date;
import java.util.List;

import edu.moduloalumno.entity.Concepto;
import edu.moduloalumno.entity.Moneda;

public interface IConceptoDAO {

	List<Concepto> getAllConceptos();
	
	List<Concepto> getConceptoIdByApeNom(String apeNom);
        
        List<Concepto> getConceptoIdByApeNomRestringidoCodigo(String codigo);
	
	List<Concepto> getConceptoIdByApeNomRestringido(String apeNom);
	
	List<Concepto> getConceptoIdByNombresApellidos(String nombres,String apellidos);
	
	List<Moneda> getAllMoneda();

	Concepto getConceptoById(int idConcepto);
	
	Float getTipodecambio(Date fecha);

	void addConcepto(Concepto concepto);

	void updateConcepto(Concepto concepto);

	void deleteConcepto(int idConcepto);
	
	boolean updateConcepto(String concepto,Integer id_concepto);

}