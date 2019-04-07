package edu.moduloalumno.dao.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IUbicacionDAO;
import edu.moduloalumno.entity.Ubicacion;
import edu.moduloalumno.rowmapper.UbicacionRowMapper;

@Transactional
@Repository
public class UbicacionDAOImpl implements IUbicacionDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Ubicacion getUbicacionById(int idUbicacion) {
		String sql = "SELECT id_ubicacion, descripcion FROM ubicacion WHERE id_ubicacion = ?";
		RowMapper<Ubicacion> rowMapper = new BeanPropertyRowMapper<Ubicacion>(Ubicacion.class);
		Ubicacion ubicacion = jdbcTemplate.queryForObject(sql, rowMapper, idUbicacion);
		return ubicacion;
	}

	@Override
	public List<Ubicacion> getAllUbicacions() {
		String sql = "SELECT id_ubicacion, descripcion FROM ubicacion";
		// RowMapper<Ubicacion> rowMapper = new
		// BeanPropertyRowMapper<Ubicacion>(Ubicacion.class);
		RowMapper<Ubicacion> rowMapper = new UbicacionRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public void addUbicacion(Ubicacion ubicacion) {
		// Add ubicacion
		String sql = "INSERT INTO ubicacion (id_ubicacion, descripcion) values (?, ?)";
		jdbcTemplate.update(sql, ubicacion.getIdUbicacion(),
		ubicacion.getDescripcion());

		// Fetch ubicacion id
		sql = "SELECT id_ubicacion FROM ubicacion WHERE id_ubicacion = ?";
		int idUbicacion = jdbcTemplate.queryForObject(sql, Integer.class, ubicacion.getIdUbicacion());

		// Set ubicacion id
		ubicacion.setIdUbicacion(idUbicacion);
	}

	@Override
	public void updateUbicacion(Ubicacion ubicacion) {
		String sql = "UPDATE ubicacion SET descripcion = ? WHERE id_ubicacion = ?";
		jdbcTemplate.update(sql, ubicacion.getDescripcion(), ubicacion.getIdUbicacion());
	}

	@Override
	public void deleteUbicacion(int idUbicacion) {
		String sql = "DELETE FROM ubicacion WHERE id_ubicacion = ?";
		jdbcTemplate.update(sql, idUbicacion);
	}

}