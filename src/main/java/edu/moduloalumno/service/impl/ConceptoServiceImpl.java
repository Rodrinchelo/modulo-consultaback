package edu.moduloalumno.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IConceptoDAO;
import edu.moduloalumno.entity.Concepto;
import edu.moduloalumno.entity.Moneda;
import edu.moduloalumno.service.IConceptoService;

@Service
public class ConceptoServiceImpl implements IConceptoService {
	

	@Autowired
	private IConceptoDAO conceptoDAO;
	@Override
	public Concepto getConceptoById(int idConcepto) {
		
		Concepto concepto = conceptoDAO.getConceptoById(idConcepto);
		
		return concepto;
	}

	@Override
	public List<Concepto> getAllConceptos() {
		
		List<Concepto> conceptoList = conceptoDAO.getAllConceptos();
		
		return conceptoList;
	}
	
	@Override
	public List<Concepto> getConceptoIdByApeNom(String apeNom) {
		
		List<Concepto> conceptoList = conceptoDAO.getConceptoIdByApeNom(apeNom);
		
		return conceptoList;
	}
        
        @Override
	public List<Concepto> getConceptoIdByApeNomRestringidoCodigo(String codigo) {
		
		List<Concepto> conceptoList = conceptoDAO.getConceptoIdByApeNomRestringidoCodigo(codigo);
		
		return conceptoList;
	}
        
	
	@Override
	public List<Concepto> getConceptoIdByApeNomRestringido(String apeNom) {
		
		List<Concepto> conceptoList = conceptoDAO.getConceptoIdByApeNomRestringido(apeNom);
		
		return conceptoList;
	}

	@Override
	public List<Concepto> getConceptoIdByNombresApellidos(String nombres, String apellidos) {
		
		List<Concepto> conceptoList = conceptoDAO.getConceptoIdByNombresApellidos(nombres, apellidos);
		
		return conceptoList;
	}

	@Override
	public synchronized void addConcepto(Concepto concepto) {
		conceptoDAO.addConcepto(concepto);

	}

	@Override
	public void updateConcepto(Concepto concepto) {
		conceptoDAO.updateConcepto(concepto);
	}

	@Override
	public void deleteConcepto(int idConcepto) {
		conceptoDAO.deleteConcepto(idConcepto);
	}
	
	@Override
	public boolean updateConcepto(String concepto, Integer id_concepto) {
		System.out.println(concepto+" "+id_concepto);
		return conceptoDAO.updateConcepto(concepto,id_concepto);
	}

	@Override
	public Float getTipodecambio(Date fecha) {
		return conceptoDAO.getTipodecambio(fecha);
	}

	@Override
	public List<Moneda> getAllMoneda() {
		return conceptoDAO.getAllMoneda();
	}

}