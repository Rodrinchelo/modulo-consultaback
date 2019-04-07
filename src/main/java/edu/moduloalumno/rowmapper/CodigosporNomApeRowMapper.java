/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import edu.moduloalumno.entity.CodigosporNomApe;

/**
 *
 * @author Jonathan
 */
public class CodigosporNomApeRowMapper implements RowMapper<CodigosporNomApe> {
    @Override
	public CodigosporNomApe mapRow(ResultSet row, int rowNum) throws SQLException {
		CodigosporNomApe codigosporNomApe = new CodigosporNomApe();
				codigosporNomApe.setCod_alumno(row.getString("cod_alumno"));
                codigosporNomApe.setNombre_alumno(row.getString("nombre_alumno"));
                codigosporNomApe.setNombre_programa(row.getString("nombre_programa"));
		return codigosporNomApe;
	}
    
}



