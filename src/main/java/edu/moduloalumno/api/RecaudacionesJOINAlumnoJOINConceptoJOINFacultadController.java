package edu.moduloalumno.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.moduloalumno.component.FloatFormat;
import edu.moduloalumno.entity.CodigosporNomApe;
import edu.moduloalumno.entity.RecaudacionesJOINAlumnoJOINConceptoJOINFacultad;
import edu.moduloalumno.model.DataActualizar;
import edu.moduloalumno.model.Filtro;
import edu.moduloalumno.service.IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadService;
import edu.moduloalumno.util.Operaciones;


@RestController
@RequestMapping("recaudaciones/alumno/concepto")
public class RecaudacionesJOINAlumnoJOINConceptoJOINFacultadController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IRecaudacionesJOINAlumnoJOINConceptoJOINFacultadService recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice;
	
	@Autowired
	@Qualifier("floatformat")
	private FloatFormat floatformat;

	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads() {
		logger.info("> getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list = null;
		try {
			list = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads();

			if (list == null) {
				list = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}
			
			logger.info("list "+list);
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAllRecaudacionesJOINAlumnoJOINConceptoJOINFacultads [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/leer/restringido/{nombres}/{apellidos}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadIdByNombresApellidosRestringido(@PathVariable("nombres") String nombres, @PathVariable("apellidos") String apellidos) {
		logger.info("> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosRestringido [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list = null;
		try {
			list = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadIdByNombresApellidosRestringido(nombres, apellidos);

			if (list == null) {
				list = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNombresApellidosRestringido [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listar/{nomApe}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApe(@PathVariable("nomApe") String nomApe) {
		logger.info("> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApe [Recaudaciones]");

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list = null;

		try {

			list = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApe(nomApe);
			if (list == null) {
				list = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getRecaudacionesByNomApe [Recaudaciones]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.OK);
	}
       
	// microservicio especail para abel
	
	@RequestMapping(value = "/obs/{observacion}/{idrec}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean insertObesrvacion(@PathVariable("observacion") String observacion,@PathVariable("idrec") String idrec) {
		logger.info(">>>> observacion <<<<");
		logger.info(">>>>>!!! "+observacion+" "+idrec);
		
		boolean response = false;

		try {
			response = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.insertObservacion(observacion,Integer.parseInt(idrec));

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return false;
		}
		logger.info("response: "+response);
		logger.info("observacion");
		return response; // q cha pasa
	}
        
  /**/  @RequestMapping(value = "/listar_cod/{codigo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByCodigo(@PathVariable("codigo") String codigo) {
		logger.info("> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByCodigo [Recaudaciones]");

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list = null;

		try {

			list = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByCodigo(codigo);
			if (list == null) {
				list = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}
			else {
				for(RecaudacionesJOINAlumnoJOINConceptoJOINFacultad r:list) {
					if(r.getMoneda().equals("113")) {
					//	logger.info(" XX "+( (float) r.getImporte() ));
					//	logger.info(" XyX "+ floatformat.dolares_a_soles(r.getFecha().toString()).getCompra());
						
						r.setImporte_tc(( (float) r.getImporte() )*floatformat.dolares_a_soles(r.getFecha().toString()).getCompra());
					//	logger.info("importe "+r.getImporte_tc());
					}
					else {
						r.setImporte_tc(( (float) r.getImporte() )*1);
					}
					
					r.setImporte_tc(floatformat.round(r.getImporte_tc(), 2));
				}
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getRecaudacionesByNomApe [Recaudaciones]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.OK);
	}
  	/*
  	public PruebaTCambio dolares_a_soles(Date fecha) throws MalformedURLException {
  		PruebaTCambio p= null;
		URL url = new URL("https://api.sunat.cloud/cambio/"+fecha);
		ObjectMapper mapper = new ObjectMapper();

		try {
			
	        BufferedReader in = new BufferedReader(
	        new InputStreamReader(url.openStream()));

	        String inputLine="",lineafinal="";
	        int campos=0;
	        while ((inputLine = in.readLine()) != null) {
	        	if(campos == 2 || campos == 3)
	        			lineafinal+=inputLine;
	         campos++;
	        }
	        
	        lineafinal="{"+lineafinal+"}";
	        
	        logger.info("cuerpo "+lineafinal.trim());
	        
	        Reader reader = new StringReader(lineafinal.trim());
	        p = mapper.readValue(reader, PruebaTCambio.class);
			
			logger.info("> objeto "+p);
			if(p.getCompra() == 0.0) {
				p.setCompra(1);
			}
			logger.info("> objeto "+p);
			in.close();
		
		} catch (IOException e){
			System.out.println("ERROR! USUARIOS NO GUARDADOS : " + e.getMessage());
		}
	
		return p; 
  	}*/
        
/**/    @RequestMapping(value = "/listar_codigos/{nomApe}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CodigosporNomApe>> getCodigosByNombre(@PathVariable("nomApe") String nomApe) {
		logger.info("> getCodigoByNombre [Recaudaciones]");

		List<CodigosporNomApe> list = null;

		try {

			list = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getCodigoByNombre(nomApe);
			if (list == null) {
				list = new ArrayList<CodigosporNomApe>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<CodigosporNomApe>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getCodigoByNombre [Recaudaciones]");
		return new ResponseEntity<List<CodigosporNomApe>>(list, HttpStatus.OK);
	}       

	// abel tipo de cambio
	
	
        

	@RequestMapping(value = "/listar/{fechaInicial}/{fechaFinal}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByStartDateBetween(@PathVariable("fechaInicial") String fechaInicial,
			@PathVariable("fechaFinal") String fechaFinal) {
		logger.info("> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByStartDateBetween [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list = null;
		Date fInicial;
		Date fFinal;

		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		try {

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);

			list = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByStartDateBetween(fInicial, fFinal);

			if (list == null) {
				list = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByStartDateBetween [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/{nom_ape}/{fechaInicial}/{fechaFinal}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeStartDateBetween(@PathVariable("nom_ape") String nom_ape,
			@PathVariable("fechaInicial") String fechaInicial, @PathVariable("fechaFinal") String fechaFinal) {
		logger.info("> getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeStartDateBetween [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");

		List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> list = null;
		Date fInicial;
		Date fFinal;

		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

		try {

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);

			list = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeStartDateBetween(nom_ape, fInicial, fFinal);

			if (list == null) {
				list = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeStartDateBetween [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/listar/filtrar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>> getRecaudacionesByFilter(@RequestBody Filtro filtro) {
		logger.info("> filterByAlumno [RecaudacionesJOINAlumnoJOINConceptoJOINFacultad]");
		
		String fechaFinal = filtro.getFechaFinal();

		String nom_ape = filtro.getNom_ape();

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
				list01 = operacion.union(list01,
						recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeConcepto(concepto, nom_ape));
			}

			logger.info("LISTA DE RECAUDACIONES POR CONCEPTO: \n" + list01);

			for (String recibo : recibos) {
				list02 = operacion.union(list02, recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeRecibo(recibo.trim(), nom_ape));
				logger.info("L \n" + recibo);
			}

			logger.info("LISTA DE RECAUDACIONES POR RECIBOS: \n" + list02);

			fInicial = formateador.parse(fechaInicial);
			fFinal = formateador.parse(fechaFinal);
			
			logger.info("LISTA DE RECAUDACIONES POR CONCEPTO: asas\n" + fInicial);
			logger.info("LISTA DE RECAUDACIONES POR CONCEPTO: scsc\n" + fFinal);
			list03 = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.getRecaudacionesJOINAlumnoJOINConceptoJOINFacultadByNomApeStartDateBetween(nom_ape, fInicial, fFinal);

			if (list03 == null) {
				list03 = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
			}

			logger.info("LISTA DE RECAUDACIONES POR FECHAS: \n" + list03);

			list03 = operacion.intersection(list03, conceptos.length != 0 ? list01 : list03);
			list03 = operacion.intersection(list03, recibos.length != 0 ? list02 : list03);
			
			logger.info("LISTA DE RECAUDACIONES INTERSECCION: \n " + list03);
			logger.info("Hola mundo");
			
			for(RecaudacionesJOINAlumnoJOINConceptoJOINFacultad obj:list03) {
					if(obj.getMoneda().equals("113")) {
						
						obj.setImporte_tc(( (float) obj.getImporte() )*floatformat.dolares_a_soles(obj.getFecha().toString()).getCompra());
					
					//	logger.info("importe "+r.getImporte_tc());
					}
					else {
						obj.setImporte_tc(( (float) obj.getImporte() )*1);
					}
					
					obj.setImporte_tc(floatformat.round(obj.getImporte_tc(), 2));
			
			}
			logger.info("LISTA DE RECAUDACIONES INTERSECCION: \n " + list03);

		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list03, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< filterByAlumno [Recaudaciones]");
		return new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(list03, HttpStatus.OK);
	}
	

// edicion 	
	@RequestMapping(value = "/actualizar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean doRecaudacionesJOINAlumnoJOINConceptoJOINFacultadActualizar(@RequestBody DataActualizar dataactualizar) throws ParseException {
		logger.info("> doRecaudacionesJOINAlumnoJOINConceptoJOINFacultadActualizar " +dataactualizar );
		
		String idRec = dataactualizar.getIdRec();

		String fecha = dataactualizar.getFecha();
		
		String id_concepto = dataactualizar.getId_concepto();
		
		String id_moneda = dataactualizar.getId_moneda();
		
		String recibo = dataactualizar.getRecibo();
		
		String ciclo = dataactualizar.getCiclo();
		
		logger.info("id:concepto: "+id_concepto);
		
		//List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> listanueva = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
		logger.info("> Commo00n: "+dataactualizar);

		DateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		
		boolean response = false; 
		try {
			
			logger.info(">>>>>>>: "+Integer.parseInt(id_concepto)+" <<<< "+id_moneda);
			response = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.updaterecaudacionesJOINAlumnoJOINConceptoJOINFacultad(Integer.parseInt(id_concepto),id_moneda,formateador.parse(fecha),recibo,Integer.parseInt(ciclo),Integer.parseInt(idRec));		
			logger.info("> resp0: "+response);
			
			
			logger.info("> Commo11n: "+dataactualizar);
		} catch (Exception e) {
			logger.error("Unexpected Exception caught. "+ e.getMessage()+response);
			return false;//new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(listanueva,HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< filterByAlumno [Recaudaciones]");
		return response;//new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(listanueva, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/actualizar_cod/{id_rec}/{cod_alumno}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Integer actualizarCod_Alumno(@PathVariable("id_rec") Integer id_rec,@PathVariable("cod_alumno") String cod_alumno){
		logger.info("> actualir cod_alumno ");
		
		
		//List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad> listanueva = new ArrayList<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>();
		logger.info("> Commo00n: "+id_rec+" "+cod_alumno);

		Integer response = 0;
		
		try {
			
			
			response = recaudacionesJOINAlumnoJOINConceptoJOINFacultadservice.updateRecaudacionesCodAlumni(id_rec, cod_alumno);		
		
			logger.info("> resp0: "+response);
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught. "+ e.getMessage()+response);
			return response;//new ResponseEntity<List<RecaudacionesJOINAlumnoJOINConceptoJOINFacultad>>(listanueva,HttpStatus.INTERNAL_SERVER_ERROR);
		}

		
		return response;
	}


}
