package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IRegistroCargaDAO;
import edu.moduloalumno.entity.RegistroCarga;
import edu.moduloalumno.rowmapper.RegistroCargaRowMapper;

@Transactional
@Repository
public class RegistroCargaDAOImpl implements IRegistroCargaDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public RegistroCarga getRegistroCargaById(int idRegistroCarga) {
		String sql = "SELECT id_registro, nombre_equipo, ip, ruta, fecha_carga FROM registro_carga WHERE id_registro = ?";
		RowMapper<RegistroCarga> rowMapper = new BeanPropertyRowMapper<RegistroCarga>(RegistroCarga.class);
		RegistroCarga registroCarga = jdbcTemplate.queryForObject(sql, rowMapper, idRegistroCarga);
		return registroCarga;
	}

	@Override
	public List<RegistroCarga> getAllRegistroCargas() {
		String sql = "SELECT id_registro, nombre_equipo, ip, ruta, fecha_carga FROM registro_carga";
		// RowMapper<RegistroCarga> rowMapper = new
		// BeanPropertyRowMapper<RegistroCarga>(RegistroCarga.class);
		RowMapper<RegistroCarga> rowMapper = new RegistroCargaRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addRegistroCarga(RegistroCarga registroCarga) {
		// Add registroCarga
		String sql = "INSERT INTO registro_carga (id_registro, nombre_equipo, ip, ruta, fecha_carga) values (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, registroCarga.getIdRegistro(), registroCarga.getNombreEquipo(), registroCarga.getIp(),
				registroCarga.getRuta(), registroCarga.getFechaCarga());

		// Fetch registroCarga id
		sql = "SELECT id_registro FROM registro_carga WHERE id_registro = ?";
		int idRegistroCarga = jdbcTemplate.queryForObject(sql, Integer.class, registroCarga.getIdRegistro());

		// Set registroCarga id
		registroCarga.setIdRegistro(idRegistroCarga);
	}

	@Override
	public void updateRegistroCarga(RegistroCarga registroCarga) {
		String sql = "UPDATE registro_carga SET nombre_equipo = ?, ip = ?, ruta = ?, fecha_carga = ? WHERE id_registro = ?";
		jdbcTemplate.update(sql, registroCarga.getNombreEquipo(), registroCarga.getIp(), registroCarga.getRuta(),
				registroCarga.getFechaCarga(), registroCarga.getIdRegistro());
	}

	@Override
	public void deleteRegistroCarga(int idRegistroCarga) {
		String sql = "DELETE FROM registro_carga WHERE id_registro = ?";
		jdbcTemplate.update(sql, idRegistroCarga);
	}

}