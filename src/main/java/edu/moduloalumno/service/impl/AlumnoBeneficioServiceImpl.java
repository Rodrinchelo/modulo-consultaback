package edu.moduloalumno.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.moduloalumno.dao.IAlumnoBeneficioDAO;
import edu.moduloalumno.entity.AlumnoProgramaBeneficio;
import edu.moduloalumno.entity.AlumnoProgramaBeneficioCon;
import edu.moduloalumno.entity.BeneficioReporteCiclo;
import edu.moduloalumno.entity.BeneficioReporteCredito;
import edu.moduloalumno.entity.CondicionBeneficio;
import edu.moduloalumno.entity.TipoAplicaBeneficio;
import edu.moduloalumno.entity.TipoBeneficio;
import edu.moduloalumno.service.IAlumnoBeneficioService;

@Service
public class AlumnoBeneficioServiceImpl implements IAlumnoBeneficioService{
	
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IAlumnoBeneficioDAO alumnobeneficiodao;

	@Override
	public boolean insertAlumnoProgramaBeneficio(AlumnoProgramaBeneficio apbeneficio) {
		return alumnobeneficiodao.insertAlumnoProgramaBeneficio(apbeneficio);
	}

	@Override
	public List<AlumnoProgramaBeneficioCon> getAllAlumnoBeneficio(String codigo) {
		return alumnobeneficiodao.getAllAlumnoBeneficio(codigo);
	}

	@Override
	public boolean getIdBeneficio(Integer id_apb) {
		return alumnobeneficiodao.getIdBeneficio(id_apb);
	}

	@Override
	public List<CondicionBeneficio> getAllCondicionB() {
		return alumnobeneficiodao.getAllCondicionB();
	}

	@Override
	public List<TipoBeneficio> getAllTipo() {
		return alumnobeneficiodao.getAllTipo();
	}

	@Override
	public List<TipoAplicaBeneficio> getTipoAplicaBeneficio() {
		return alumnobeneficiodao.getTipoAplicaBeneficio();
	}

	@Override
	public BeneficioReporteCredito funcionDescuento(String codigo, float descuento,Integer id_programa) {
		return alumnobeneficiodao.funcionDescuento(codigo,descuento,id_programa);
	}

	@Override
	public BeneficioReporteCiclo funcionDescuento_(String codigo, float descuento, Integer id_programa) {
		return alumnobeneficiodao.funcionDescuento_(codigo,descuento,id_programa);
	}
	
	
	

}