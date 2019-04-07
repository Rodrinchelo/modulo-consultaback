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
import edu.moduloalumno.entity.Recaudaciones;
import edu.moduloalumno.service.IRecaudacionesService;
import edu.moduloalumno.util.Operaciones;

@RestController
@RequestMapping("/updaterecaudaciones")
public class UpdateRecaudacionesController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IRecaudacionesService updaterecaudacionesService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getRecaudacionesByPosgrado() {
		logger.info("> getAllRecaudacioness [Recaudaciones]");

		List<Recaudaciones> list = null;
		try {
			list = updaterecaudacionesService.getRecaudacionesByPosgrado();

			if (list == null) {
				list = new ArrayList<Recaudaciones>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllRecaudacioness [Recaudaciones]");
		return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/{nombres}/{apellidos}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getRecaudacionesByNombresApellidos(@PathVariable("nombres") String nombres,
			@PathVariable("apellidos") String apellidos) {
		logger.info("> filterByAlumno [Recaudaciones]");

		List<Recaudaciones> list = null;

		try {

			list = updaterecaudacionesService.getRecaudacionesByNombresApellidos(nombres, apellidos);
			if (list == null) {
				list = new ArrayList<Recaudaciones>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< filterByAlumno [Recaudaciones]");
		return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.OK);
	}


	
	@RequestMapping(value = "/listar/{nombres}/{apellidos}/{fechaInicial}/{fechaFinal}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getRecaudacionesByNombresApellidosStartDateBetween(@PathVariable("nombres") String nombres,
			@PathVariable("apellidos") String apellidos, @PathVariable("fechaInicial") String fechaInicial,
			@PathVariable("fechaFinal") String fechaFinal) {
		logger.info("> filterByAlumnoDate [Recaudaciones]");

		List<Recaudaciones> list = null;
		Date fInicial;
		Date fFinal;

		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		try {

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);

			list = updaterecaudacionesService.getRecaudacionesByNombresApellidosStartDateBetween(nombres, apellidos,
					fInicial, fFinal);

			if (list == null) {
				list = new ArrayList<Recaudaciones>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< filterByAlumnoDate [Recaudaciones]");
		return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/filtrar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getRecaudacionesByUpdateFilter(@RequestBody UpdateFiltro filtro) {
		logger.info("> filterByAlumno [Recaudaciones]");

		String fechaFinal = filtro.getFechaFinal();

		String nombres = filtro.getNombres();

		String apellidos = filtro.getApellidos();

		String fechaInicial = filtro.getFechaInicial();

		String[] conceptos = filtro.getConceptos();
		
		String[] recibos = filtro.getRecibos();

		List<Recaudaciones> list01 = new ArrayList<Recaudaciones>();
		List<Recaudaciones> list02 = new ArrayList<Recaudaciones>();
		List<Recaudaciones> list03 = null;

		Date fInicial;
		Date fFinal;

		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		Operaciones operacion = new Operaciones();

		try {

			for (String concepto : conceptos) {
				list01 = operacion.union(list01, updaterecaudacionesService
						.getRecaudacionesByNombresApellidosConcepto(concepto, nombres, apellidos));
			}

			logger.info("LISTA DE RECAUDACIONES POR CONCEPTO: \n" + list01);

			for (String recibo : recibos) {
				list02 = operacion.union(list02, updaterecaudacionesService
						.getRecaudacionesByNombresApellidosRecibo(recibo, nombres, apellidos));
			}

			logger.info("LISTA DE RECAUDACIONES POR RECIBOS: \n" + list02);

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);
			
			logger.info("LISTA DE RECAUDACIONES POR CONCEPTO: asas\n" + fInicial);
			logger.info("LISTA DE RECAUDACIONES POR CONCEPTO: scsc\n" + fFinal);
			list03 = updaterecaudacionesService.getRecaudacionesByNombresApellidosStartDateBetween(nombres, apellidos,
					fInicial, fFinal);

			if (list03 == null) {
				list03 = new ArrayList<Recaudaciones>();
			}

			logger.info("LISTA DE RECAUDACIONES POR FECHAS: \n" + list03);

			list03 = operacion.intersection(list03, conceptos.length != 0 ? list01 : list03);
			list03 = operacion.intersection(list03, recibos.length != 0 ? list02 : list03);

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Recaudaciones>>(list03, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< filterByAlumno [Recaudaciones]");
		return new ResponseEntity<List<Recaudaciones>>(list03, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizar", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> updateRecaudaciones(@RequestBody Recaudaciones recaudaciones) {

		Integer update = null;
		try {
			update = updaterecaudacionesService.updateRecaudaciones(recaudaciones);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(update, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/list/actualizar", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> updateRecaudacionesList(@RequestBody List<Recaudaciones> recaudacionesList) {

		Integer update = null;
		try {
			update = updaterecaudacionesService.updateRecaudaciones(recaudacionesList);
		} catch (Exception e) {
			return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(update, HttpStatus.OK);
	}
}