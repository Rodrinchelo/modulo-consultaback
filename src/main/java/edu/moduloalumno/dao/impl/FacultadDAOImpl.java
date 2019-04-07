package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IFacultadDAO;
import edu.moduloalumno.entity.Facultad;
import edu.moduloalumno.rowmapper.FacultadRowMapper;

@Transactional
@Repository
public class FacultadDAOImpl implements IFacultadDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Facultad getFacultadById(int idFacultad) {
		String sql = "SELECT id_facultad, nombre FROM facultad WHERE id_facultad = ?";
		RowMapper<Facultad> rowMapper = new BeanPropertyRowMapper<Facultad>(Facultad.class);
		Facultad facultad = jdbcTemplate.queryForObject(sql, rowMapper, idFacultad);
		return facultad;
	}

	@Override
	public List<Facultad> getAllFacultads() {
		String sql = "SELECT id_facultad, nombre FROM facultad";
		// RowMapper<Facultad> rowMapper = new
		// BeanPropertyRowMapper<Facultad>(Facultad.class);
		RowMapper<Facultad> rowMapper = new FacultadRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addFacultad(Facultad facultad) {
		// Add facultad
		String sql = "INSERT INTO facultad (id_facultad, nombre) values (?, ?)";
		jdbcTemplate.update(sql, facultad.getIdFacultad(), facultad.getNombre());

		// Fetch facultad id
		sql = "SELECT id_facultad FROM facultad WHERE id_facultad = ?";
		int idFacultad = jdbcTemplate.queryForObject(sql, Integer.class, facultad.getIdFacultad());

		// Set facultad id
		facultad.setIdFacultad(idFacultad);
	}

	@Override
	public void updateFacultad(Facultad facultad) {
		String sql = "UPDATE facultad SET nombre = ? WHERE id_facultad = ?";
		jdbcTemplate.update(sql, facultad.getNombre(), facultad.getIdFacultad());
	}

	@Override
	public void deleteFacultad(int idFacultad) {
		String sql = "DELETE FROM facultad WHERE id_facultad = ?";
		jdbcTemplate.update(sql, idFacultad);
	}

}