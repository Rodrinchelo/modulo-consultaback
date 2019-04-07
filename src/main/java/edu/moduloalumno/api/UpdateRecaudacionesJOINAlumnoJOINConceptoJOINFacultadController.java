package edu.moduloalumno.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.model.UpdateFiltro;
import edu.moduloalumno.entity.RecaudacionesJOINAlumnoJOINConceptoJOINFacultad;
import edu.moduloalumno.service.IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadService;
import edu.moduloalumno.util.Operaciones;

@RestController
@RequestMapping("/update/recaudaciones/alumno/concepto/facultad")
public class UpdateRecaudacionesJOINAlumnoJOINConceptoJOINFacultadController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadService updaterecaudacionesService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByPosgrado() {
		logger.info("> getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list = null;
		try {
			list = updaterecaudacionesService.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByPosgrado();

			if (list == null) {
				list = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/{nombres}/{apellidos}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidos(@PathVariable("nombres") String nombres,
			@PathVariable("apellidos") String apellidos) {
		logger.info("> filterByAlumno [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list = null;

		try {

			list = updaterecaudacionesService.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidos(nombres, apellidos);
			if (list == null) {
				list = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< filterByAlumno [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.OK);
	}


	
	@RequestMapping(value = "/listar/{nombres}/{apellidos}/{fechaInicial}/{fechaFinal}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosStartDateBetween(@PathVariable("nombres") String nombres,
			@PathVariable("apellidos") String apellidos, @PathVariable("fechaInicial") String fechaInicial,
			@PathVariable("fechaFinal") String fechaFinal) {
		logger.info("> filterByAlumnoDate [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list = null;
		Date fInicial;
		Date fFinal;

		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		try {

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);

			list = updaterecaudacionesService.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosStartDateBetween(nombres, apellidos,
					fInicial, fFinal);

			if (list == null) {
				list = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< filterByAlumnoDate [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/filtrar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByUpdateFilter(@RequestBody UpdateFiltro filtro) {
		logger.info("> filterByAlumno [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");

		String fechaFinal = filtro.getFechaFinal();

		String nombres = filtro.getNombres();

		String apellidos = filtro.getApellidos();

		String fechaInicial = filtro.getFechaInicial();

		String[] conceptos = filtro.getConceptos();
		
		String[] recibos = filtro.getRecibos();

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list01 = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list02 = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list03 = null;

		Date fInicial;
		Date fFinal;

		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		Operaciones operacion = new Operaciones();

		try {

			for (String concepto : conceptos) {
				list01 = operacion.union(list01, updaterecaudacionesService
						.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosConcepto(concepto, nombres, apellidos));
			}

			logger.info("LISTA DE RECAUDACIONES POR CONCEPTO: \n" + list01);

			for (String recibo : recibos) {
				list02 = operacion.union(list02, updaterecaudacionesService
						.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosRecibo(recibo, nombres, apellidos));
			}

			logger.info("LISTA DE RECAUDACIONES POR RECIBOS: \n" + list02);

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);

			list03 = updaterecaudacionesService.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosStartDateBetween(nombres, apellidos,
					fInicial, fFinal);

			if (list03 == null) {
				list03 = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}

			logger.info("LISTA DE RECAUDACIONES POR FECHAS: \n" + list03);

			list03 = operacion.intersection(list03, conceptos.length != 0 ? list01 : list03);
			list03 = operacion.intersection(list03, recibos.length != 0 ? list02 : list03);

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list03, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< filterByAlumno [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list03, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(@RequestBody RecaudacionesJOINAlumnoJOINConceptoJOINFacultad recaudaciones) {

		Integer update = null;
		try {
			update = updaterecaudacionesService.updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(recaudaciones);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(update, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/list/actualizar", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultadList(@RequestBody List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> recaudacionesList) {

		Integer update = null;
		try {
			update = updaterecaudacionesService.updateRecaudacionesJOINAlumnoJOINConceptoJOINFacultad(recaudacionesList);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(update, HttpStatus.OK);
	}
}