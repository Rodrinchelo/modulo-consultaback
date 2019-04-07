package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.moduloalumno.entity.Programa;

public class ProgramaRowMapper implements RowMapper<Programa> {
	@Override
	public Programa mapRow(ResultSet row, int rowNum) throws SQLException {
		Programa programa = new Programa();
		programa.setIdPrograma(row.getInt("id_programa"));
		programa.setNomPrograma(row.getString("nom_programa"));
		programa.setSiglaPrograma(row.getString("sigla_programa"));
		programa.setVigenciaPrograma(row.getBoolean("vigencia_programa"));
		programa.setIdTipGrado(row.getInt("id_tip_grado"));
		return programa;
	}
}