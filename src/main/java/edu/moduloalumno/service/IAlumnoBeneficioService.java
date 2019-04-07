package edu.moduloalumno.service;

import java.util.List;

import edu.moduloalumno.entity.AlumnoProgramaBeneficio;
import edu.moduloalumno.entity.AlumnoProgramaBeneficioCon;
import edu.moduloalumno.entity.BeneficioReporteCiclo;
import edu.moduloalumno.entity.BeneficioReporteCredito;
import edu.moduloalumno.entity.CondicionBeneficio;
import edu.moduloalumno.entity.TipoAplicaBeneficio;
import edu.moduloalumno.entity.TipoBeneficio;

public interface IAlumnoBeneficioService {
	
	public List<AlumnoProgramaBeneficioCon> getAllAlumnoBeneficio(String codigo);
	
	public BeneficioReporteCredito funcionDescuento(String codigo, float descuento,Integer id_programa);
	public BeneficioReporteCiclo funcionDescuento_(String codigo, float descuento,Integer id_programa);
	
	public boolean insertAlumnoProgramaBeneficio(AlumnoProgramaBeneficio apbeneficio);
	
	public boolean getIdBeneficio(Integer id_apb);
	
	public List<CondicionBeneficio> getAllCondicionB();
	
	public List<TipoBeneficio> getAllTipo();

	public List<TipoAplicaBeneficio> getTipoAplicaBeneficio();

}
