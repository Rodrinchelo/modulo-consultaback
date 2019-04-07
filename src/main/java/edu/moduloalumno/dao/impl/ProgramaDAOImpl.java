package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IProgramaDAO;
import edu.moduloalumno.entity.Programa;
import edu.moduloalumno.rowmapper.ProgramaRowMapper;

@Transactional
@Repository
public class ProgramaDAOImpl implements IProgramaDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Programa getProgramaById(int idPrograma) {
		String sql = "SELECT id_programa, nom_programa, sigla_programa, vigencia_programa, id_tip_grado FROM programa WHERE id_programa = ?";
		RowMapper<Programa> rowMapper = new BeanPropertyRowMapper<Programa>(Programa.class);
		Programa programa = jdbcTemplate.queryForObject(sql, rowMapper, idPrograma);
		return programa;
	}

	@Override
	public List<Programa> getAllProgramas() {
		String sql = "SELECT id_programa, nom_programa, sigla_programa, vigencia_programa, id_tip_grado FROM programa";
		// RowMapper<Programa> rowMapper = new
		// BeanPropertyRowMapper<Programa>(Programa.class);
		RowMapper<Programa> rowMapper = new ProgramaRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addPrograma(Programa programa) {
		// Add programa
		String sql = "INSERT INTO programa (id_programa, nom_programa, sigla_programa, vigencia_programa, id_tip_grado) values (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, programa.getIdPrograma(), programa.getNomPrograma(), programa.getSiglaPrograma(),
				programa.getVigenciaPrograma(), programa.getIdTipGrado());

		// Fetch programa id
		sql = "SELECT id_programa FROM programa WHERE id_programa = ?";
		int idPrograma = jdbcTemplate.queryForObject(sql, Integer.class, programa.getIdPrograma());

		// Set programa id
		programa.setIdPrograma(idPrograma);
	}

	@Override
	public void updatePrograma(Programa programa) {
		String sql = "UPDATE programa SET nom_programa = ?, sigla_programa = ?, vigencia_programa = ?, id_tip_grado = ? WHERE id_programa = ?";
		jdbcTemplate.update(sql, programa.getNomPrograma(), programa.getSiglaPrograma(), programa.getVigenciaPrograma(),
				programa.getIdTipGrado(), programa.getIdPrograma());
	}

	@Override
	public void deletePrograma(int idPrograma) {
		String sql = "DELETE FROM programa WHERE id_programa = ?";
		jdbcTemplate.update(sql, idPrograma);
	}

}