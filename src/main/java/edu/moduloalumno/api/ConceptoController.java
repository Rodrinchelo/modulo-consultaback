package edu.moduloalumno.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.entity.Concepto;
import edu.moduloalumno.entity.Moneda;
import edu.moduloalumno.service.IConceptoService;

@RestController
@RequestMapping("/concepto")
public class ConceptoController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IConceptoService service;
	
	@RequestMapping(value = "/buscar/{idConcepto}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Concepto> getConceptoById(@PathVariable("idConcepto") Integer idConcepto) {
		logger.info("> getConceptoById [Concepto]");

		Concepto concepto = null;

		try {
			concepto = service.getConceptoById(idConcepto);
			
			if (concepto == null) {
				concepto = new Concepto();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<Concepto>(concepto, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getConceptoById [Concepto]");
		return new ResponseEntity<Concepto>(concepto, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/conceptos", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Concepto>> getAllConcepto() {
		logger.info("> getConceptoById [Concepto]");

		List<Concepto> conceptos = null;

		try {
			conceptos = service.getAllConceptos();
			logger.info("conceptos "+conceptos);
			if (conceptos == null) {
				conceptos = new ArrayList<Concepto>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Concepto>>(conceptos, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getConceptoById [Concepto]");
		return new ResponseEntity<List<Concepto>>(conceptos, HttpStatus.OK);
	}

	
	@RequestMapping(value = "/leer/{apeNom}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Concepto>> getConceptoIdByApeNom(@PathVariable("apeNom") String apeNom) {
		logger.info("> getConceptoIdByApeNom [Concepto]");

		List<Concepto> list = null;

		try {
			list = service.getConceptoIdByApeNom(apeNom);
			
			if (list == null) {
				list = new ArrayList<Concepto>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Concepto>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getConceptoIdByApeNom [Concepto]");
		return new ResponseEntity<List<Concepto>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/tcambio/{fecha}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Float> getTipodecambio(@PathVariable("fecha") String fecha) {
		logger.info("> getConceptoIdByApeNom [Concepto]");

		Float tcambio = null;
		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		try {
			tcambio = service.getTipodecambio(formateador.parse(fecha));
			
			if (tcambio == null) {
				tcambio = (float) 1.0;
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<Float>(tcambio, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getConceptoIdByApeNom [Concepto]");
		return new ResponseEntity<Float>(tcambio, HttpStatus.OK);
	}
	
         
	@RequestMapping(value = "/leer/restringido/{apeNom}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Concepto>> getConceptoIdByApeNomRestringido(@PathVariable("apeNom") String apeNom) {
		logger.info("> getConceptoIdByApeNomRestringido [Concepto]");

		List<Concepto> list = null;

		try {
			list = service.getConceptoIdByApeNomRestringido(apeNom);
			
			if (list == null) {
				list = new ArrayList<Concepto>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Concepto>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getConceptoIdByApeNomRestringido [Concepto]");
		return new ResponseEntity<List<Concepto>>(list, HttpStatus.OK);
	}
	
	
        @RequestMapping(value = "/leer/restringido_cod/{codigo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Concepto>> getConceptoIdByApeNomRestringidoCodigo(@PathVariable("codigo") String codigo) {
		logger.info("> getConceptoIdByApeNomRestringido [Concepto]");

		List<Concepto> list = null;

		try {
			list = service.getConceptoIdByApeNomRestringidoCodigo(codigo);
			
			if (list == null) {
				list = new ArrayList<Concepto>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Concepto>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getConceptoIdByApeNomRestringido [Concepto]");
		return new ResponseEntity<List<Concepto>>(list, HttpStatus.OK);
	}
        
        
    @RequestMapping(value = "/leer/{nombres}/{apellidos}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Concepto>> getConceptoApellidosNombres(@PathVariable("nombres") String nombres,@PathVariable("apellidos") String apellidos) {
		logger.info("> getConceptoApellidosNombres [Concepto]");

		List<Concepto> list = null;

		try {
			list = service.getConceptoIdByNombresApellidos(nombres, apellidos);
			
			if (list == null) {
				list = new ArrayList<Concepto>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Concepto>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getConceptoApellidosNombres [Concepto]");
		return new ResponseEntity<List<Concepto>>(list, HttpStatus.OK);
	}    
    
    @RequestMapping(value = "/monedas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Moneda>> getAllMoneda(){
		logger.info("> getConceptoApellidosNombres [Concepto]");

		List<Moneda> list = null;

		try {
			list = service.getAllMoneda();
			
			if (list == null) {
				list = new ArrayList<Moneda>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Moneda>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getConceptoApellidosNombres [Concepto]");
		return new ResponseEntity<List<Moneda>>(list, HttpStatus.OK);
	}    
}
