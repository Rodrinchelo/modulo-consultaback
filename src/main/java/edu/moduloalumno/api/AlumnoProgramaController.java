package edu.moduloalumno.api;

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

import edu.moduloalumno.entity.AlumnoPrograma;
import edu.moduloalumno.service.IAlumnoProgramaService;

@RestController
@RequestMapping("/alumnoprograma")
public class AlumnoProgramaController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IAlumnoProgramaService service;

	@RequestMapping(value = "/leer/{nombresApellidos}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAlumnoProgramasIdByNombresApellidos(@PathVariable("nombresApellidos") String nombresApellidos) {
		logger.info("> getAlumnoProgramasIdByNombresApellidos [AlumnoPrograma]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAlumnoProgramasIdByNombresApellidos(nombresApellidos);

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramasIdByNombresApellidos [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}

	@RequestMapping(value = "/leer/{codAlum}/{idProg}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAlumnoProgramasIdByCodAlumIdProg(@PathVariable("codAlum") String codAlum,@PathVariable("idProg") Integer idProg) {
		logger.info("> getAlumnoProgramasIdByCodAlumIdProg [AlumnoPrograma]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAlumnoProgramasIdByCodAlumIdProg(codAlum,idProg);

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramasIdByCodAlumIdProg [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/leer/restringido/{nombresApellidos}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAlumnoProgramasIdByNombresApellidosRestringido(@PathVariable("nombresApellidos") String nombresApellidos) {
		logger.info("> getAlumnoProgramasIdByNombresApellidosRestringido [AlumnoPrograma]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAlumnoProgramasIdByNombresApellidosRestringido(nombresApellidos);//

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramasIdByNombresApellidosRestringido [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAllAlumnoPrograma() {
		logger.info("> getAlumnoProgramasIdByNombresApellidosRestringido [AlumnoPrograma]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAllAlumnoProgramas();

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramasIdByNombresApellidosRestringido [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/buscarc/{codAlumno}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AlumnoPrograma> getAlumnoProgramaByCodAlumno(@PathVariable("codAlumno") String codAlumno) {
		logger.info("> getAlumnoProgramaByCodAlumno [AlumnoPrograma]");

		AlumnoPrograma alum = null;
		try {
			alum = service.getAlumnoProgramaById(codAlumno);

			if (alum == null) {
				alum = new AlumnoPrograma();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<AlumnoPrograma>(alum, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramaByCodAlumno [AlumnoPrograma]");
		return new ResponseEntity<AlumnoPrograma>(alum, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/buscard/{dni}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AlumnoPrograma>> getAlumnoProgramaByDni(@PathVariable("dni") String dni) {
		logger.info("> getAlumnoProgramaByDni [DNI]");

		List<AlumnoPrograma> list = null;
		try {
			list = service.getAlumnoProgramaByDni(dni);

			if (list == null) {
				list = new ArrayList<AlumnoPrograma>();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoProgramaByCodAlumno [AlumnoPrograma]");
		return new ResponseEntity<List<AlumnoPrograma>>(list, HttpStatus.OK);
	}

}
