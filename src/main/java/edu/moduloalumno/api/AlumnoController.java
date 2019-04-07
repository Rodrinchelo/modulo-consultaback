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

import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.service.IAlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IAlumnoService service;
	
	@RequestMapping(value = "/buscar/{idAlum}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Alumno> getAlumnoById(@PathVariable("idAlum") Integer idAlum) {
		logger.info("> getAlumnoById [Alumno]");

		Alumno alu = null;
		try {
			alu = service.getAlumnoById(idAlum);

			if (alu == null) {
				alu = new Alumno();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<Alumno>(alu, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoById [Alumno]");
		return new ResponseEntity<Alumno>(alu, HttpStatus.OK);
	}

	@RequestMapping(value = "/leer/{apeNom}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Alumno> getAlumnoIdByApeNom(@PathVariable("apeNom") String apeNom) {
		logger.info("> getAlumnoIdByApeNom [Alumno]");

		Alumno alu = null;
		try {
			alu = service.getAlumnoIdByApeNom(apeNom);

			if (alu == null) {
				alu = new Alumno();
			}
			
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<Alumno>(alu, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		logger.info("< getAlumnoIdByApeNom [Alumno]");
		return new ResponseEntity<Alumno>(alu, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/leer/{nombres}/{apellidos}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Alumno>> getAlumnoIdByNombresApellidos(@PathVariable("nombres") String nombres,@PathVariable("apellidos") String apellidos) {
		logger.info("> getAlumnoIdByNombresApellidos [Alumno]");

		List<Alumno> list = null;

		try {
			list = service.getAlumnoIdByNombresApellidos(nombres, apellidos);
			
			if (list == null) {
				list = new ArrayList<Alumno>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Alumno>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getAlumnoIdByNombresApellidos [Alumno]");
		return new ResponseEntity<List<Alumno>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Alumno>> getAllAlumno() {
		logger.info("> getAlumnoIdByNombresApellidos [Alumno]");

		List<Alumno> list = null;

		try {
			list = service.getAllAlumnos();
			
			if (list == null) {
				list = new ArrayList<Alumno>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Alumno>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getAlumnoIdByNombresApellidos [Alumno]");
		return new ResponseEntity<List<Alumno>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/leer/restringido/{nombresApellidos}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Alumno>> getAlumnoIdByNombresApellidosRestringido(@PathVariable("nombresApellidos") String nombresApellidos) {
		logger.info("> getAlumnoIdByNombresApellidosRestringido [Alumno]");

		List<Alumno> list = null;

		try {
			list = service.getAlumnoIdByNombresApellidosRestringido(nombresApellidos);
			
			if (list == null) {
				list = new ArrayList<Alumno>();
			}
		} catch (Exception e) {
			logger.error("Unexpected Exception caught.", e);
			return new ResponseEntity<List<Alumno>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		

		logger.info("< getAlumnoIdByNombresApellidosRestringido [Alumno]");
		return new ResponseEntity<List<Alumno>>(list, HttpStatus.OK);
	}
}
