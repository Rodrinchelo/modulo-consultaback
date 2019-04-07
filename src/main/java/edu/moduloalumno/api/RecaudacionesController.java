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

import edu.moduloalumno.entity.Recaudaciones;
import edu.moduloalumno.model.Filtro;
import edu.moduloalumno.service.IRecaudacionesService;
import edu.moduloalumno.util.Operaciones;

@RestController
@RequestMapping("/recaudaciones")
public class RecaudacionesController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IRecaudacionesService recaudacionesService;

	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getAllRecaudaciones() {
		logger.info("> getAllRecaudaciones [Recaudaciones]");

		List<Recaudaciones> list = null;
		try {
			list = recaudacionesService.getAllRecaudaciones();

			if (list == null) {
				list = new ArrayList<Recaudaciones>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllRecaudaciones [Recaudaciones]");
		return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.OK);
	}
	
	
	/* loco*/ 
	@RequestMapping(value = "/rec/{recibo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getRecaudacionReci(@PathVariable("recibo") String recibo) {
		logger.info("> getAllRecaudaciones [Recaudaciones]");
		
		List<Recaudaciones> list = null;

		try {

			list = recaudacionesService.getRecaudacionReci(recibo);
			if (list == null) {
				list = new ArrayList<Recaudaciones>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getRecaudacionesByNomApe [Recaudaciones]");
		return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.OK);

	}
	
	
	
	@RequestMapping(value = "/listar/{nomApe}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getRecaudacionesByNomApe(@PathVariable("nomApe") String nomApe) {
		logger.info("> getRecaudacionesByNomApe [Recaudaciones]");

		List<Recaudaciones> list = null;

		try {

			list = recaudacionesService.getRecaudacionesByNomApe(nomApe);
			if (list == null) {
				list = new ArrayList<Recaudaciones>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getRecaudacionesByNomApe [Recaudaciones]");
		return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/{fechaInicial}/{fechaFinal}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getRecaudacionesByStartDateBetween(@PathVariable("fechaInicial") String fechaInicial,
			@PathVariable("fechaFinal") String fechaFinal) {
		logger.info("> getRecaudacionesByStartDateBetween [Recaudaciones]");

		List<Recaudaciones> list = null;
		Date fInicial;
		Date fFinal;

		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		try {

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);

			list = recaudacionesService.getRecaudacionesByStartDateBetween(fInicial, fFinal);

			if (list == null) {
				list = new ArrayList<Recaudaciones>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getRecaudacionesByStartDateBetween [Recaudaciones]");
		return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/{nom_ape}/{fechaInicial}/{fechaFinal}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getRecaudacionesByNomApeStartDateBetween(@PathVariable("nom_ape") String nom_ape,
			@PathVariable("fechaInicial") String fechaInicial, @PathVariable("fechaFinal") String fechaFinal) {
		logger.info("> getRecaudacionesByNomApeStartDateBetween [Recaudaciones]");

		List<Recaudaciones> list = null;
		Date fInicial;
		Date fFinal;

		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		try {

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);

			list = recaudacionesService.getRecaudacionesByNomApeStartDateBetween(nom_ape, fInicial, fFinal);

			if (list == null) {
				list = new ArrayList<Recaudaciones>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getRecaudacionesByNomApeStartDateBetween [Recaudaciones]");
		return new ResponseEntity<List<Recaudaciones>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/filtrar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recaudaciones>> getRecaudacionesByFilter(@RequestBody Filtro filtro) {
		logger.info("> filterByAlumno [Recaudaciones]");

		String fechaFinal = filtro.getFechaFinal();

		String nom_ape = filtro.getNom_ape();

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
				list01 = operacion.union(list01,
						recaudacionesService.getRecaudacionesByNomApeConcepto(concepto, nom_ape));
			}

			logger.info("LISTA DE RECAUDACIONES POR CONCEPTO: \n" + list01);

			for (String recibo : recibos) {
				list02 = operacion.union(list02, recaudacionesService.getRecaudacionesByNomApeRecibo(recibo, nom_ape));
			}

			logger.info("LISTA DE RECAUDACIONES POR RECIBOS: \n" + list02);

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);

			list03 = recaudacionesService.getRecaudacionesByNomApeStartDateBetween(nom_ape, fInicial, fFinal);

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

	 @RequestMapping(value = "/actualizar/{id_rec}/{cod_alumno}/{id_programa}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)	 																		  
        public void updateRecaudaciones(@PathVariable("id_rec") Integer id_rec, @PathVariable("cod_alumno") String cod_alumno, @PathVariable("id_programa") Integer id_programa){
            
            logger.info("> Commo00n: " + id_rec + " " + cod_alumno + " " + id_programa);
            Integer response = 0;
            
            try{
                 recaudacionesService.updateRecaudaciones(id_rec, cod_alumno, id_programa);
            } catch(Exception e){
                logger.error("Unexpected Exception caught. "+ e.getMessage());
            }
            
        } 

}