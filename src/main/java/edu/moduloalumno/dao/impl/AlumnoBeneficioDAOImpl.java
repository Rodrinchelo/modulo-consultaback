package edu.moduloalumno.dao.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.moduloalumno.dao.IAlumnoBeneficioDAO;
import edu.moduloalumno.entity.AlumnoProgramaBeneficio;
import edu.moduloalumno.entity.AlumnoProgramaBeneficioCon;
import edu.moduloalumno.entity.BeneficioReporteCiclo;
import edu.moduloalumno.entity.BeneficioReporteCredito;
import edu.moduloalumno.entity.CondicionBeneficio;
import edu.moduloalumno.entity.TipoAplicaBeneficio;
import edu.moduloalumno.entity.TipoBeneficio;
import edu.moduloalumno.rowmapper.AlumnoBeneficioRowMapper;
import edu.moduloalumno.rowmapper.BeneficioReporteRowMapper;
import edu.moduloalumno.rowmapper.BeneficioReporte_RowMapper;
import edu.moduloalumno.rowmapper.CondicionBeneficioRowMapper;
import edu.moduloalumno.rowmapper.TipoAplicaBeneficioRowMapper;
import edu.moduloalumno.rowmapper.TipoBeneficioRowMapper;




@Transactional
@Repository
public class AlumnoBeneficioDAOImpl implements IAlumnoBeneficioDAO{
	
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private JdbcTemplate jdbcTemplate;//i wanna be adored
	
	@Override
	public List<AlumnoProgramaBeneficioCon> getAllAlumnoBeneficio(String codigo) {
		
		String sql = "select abp.cod_alumno,abp.id_beneficio,abp.beneficio_otorgado,b.beneficio_max,abp.autorizacion,b.resolucion,b.tipo,abp.id_benef_condicion,bc.condicion,abp.fecha,abp.observacion,abp.id_apb,bcc.tipo as criterio from alumno_programa_beneficio abp,beneficio b, beneficio_condicion bc,beneficio_ciclo_credito bcc where abp.cod_alumno = (?) and (abp.id_beneficio = b.id_beneficio) and (abp.id_benef_condicion =  bc.id_benef_condicion) and (abp.criterio =  bcc.id_bcc) order by abp.id_apb";
		RowMapper<AlumnoProgramaBeneficioCon> rowMapper = new AlumnoBeneficioRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper, codigo);
	}

	@Override
	public List<CondicionBeneficio> getAllCondicionB() {
		String sql = "select * from beneficio_condicion;";
		RowMapper<CondicionBeneficio> rowMapper = new CondicionBeneficioRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}
	
	@Override
	public List<TipoBeneficio> getAllTipo() {
		String sql = "select * from beneficio order by id_beneficio";
		RowMapper<TipoBeneficio> rowMapper = new TipoBeneficioRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public boolean insertAlumnoProgramaBeneficio(AlumnoProgramaBeneficio apbeneficio) {
		
		String sql="";
		Integer ret = 0;
		
		if(apbeneficio.getToQuery()) {System.out.println("insert");
			sql = "INSERT INTO alumno_programa_beneficio(cod_alumno,id_beneficio,observacion,beneficio_otorgado,id_benef_condicion,fecha,autorizacion,criterio) values (?,?,?,?,?,?,?,?)";
		 	ret = jdbcTemplate.update(sql, apbeneficio.getCod_alumno(),apbeneficio.getId_beneficio(),apbeneficio.getObservacion(),apbeneficio.getBeneficio_otorgado(),apbeneficio.getId_bcondicion(),apbeneficio.getFecha(),apbeneficio.getAutorizacion(),apbeneficio.getId_bcc());
		}
		else {System.out.println("update");
			sql = "UPDATE alumno_programa_beneficio SET id_beneficio = ?,observacion = ?,beneficio_otorgado = ?,id_benef_condicion = ?,fecha = ?,autorizacion = ?,criterio=? where id_apb = ?";
			ret = jdbcTemplate.update(sql,apbeneficio.getId_beneficio(),apbeneficio.getObservacion(),apbeneficio.getBeneficio_otorgado(),apbeneficio.getId_bcondicion(),apbeneficio.getFecha(),apbeneficio.getAutorizacion(),apbeneficio.getId_bcc(),apbeneficio.getId_abp());
		}
		System.out.println("respuesta sql "+ret);	
		
		if(ret.equals(1)) {
			return true;
		}
		else 
		{
			return false;
		}
	}

	@Override
	public boolean getIdBeneficio(Integer id_abp) {
		
		try {
			String sql = "select id_apb from alumno_programa_beneficio where id_apb = ?";
			String id_apb = jdbcTemplate.queryForObject(sql, new Object[] { id_abp }, String.class);
			System.out.println("cod_alumno "+id_apb);
			if(Integer.parseInt(id_apb) > 0)
			{	System.out.println("return true");
				return true;
			}
			else 
			{	
				System.out.println("return false");
				return false;
			}
			
		}
		catch(EmptyResultDataAccessException e) {
			System.out.println("cod_alumno");
			return false;
		}
		
	}

	@Override
	public List<TipoAplicaBeneficio> getTipoAplicaBeneficio() {
		String sql = "select * from beneficio_ciclo_credito;";
		RowMapper<TipoAplicaBeneficio> rowMapper = new TipoAplicaBeneficioRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public BeneficioReporteCredito funcionDescuento(String codigo, float descuento,Integer id_programa) {
		try {
			String sql = "select * from fn_beneficio_1(?,?,?);";
			RowMapper<BeneficioReporteCredito> rowMapper = new BeneficioReporteRowMapper();
			BeneficioReporteCredito br = jdbcTemplate.queryForObject(sql, rowMapper, codigo,descuento,id_programa);
			return br;
			}
			catch (EmptyResultDataAccessException e) {
				return null;
			}	
	}

	@Override
	public BeneficioReporteCiclo funcionDescuento_(String codigo, float descuento, Integer id_programa) {
		try {
			String sql = "select * from fn_beneficio_2(?,?,?);";
			RowMapper<BeneficioReporteCiclo> rowMapper = new BeneficioReporte_RowMapper();
			BeneficioReporteCiclo br = jdbcTemplate.queryForObject(sql, rowMapper, codigo,descuento,id_programa);
			return br;
			}
			catch (EmptyResultDataAccessException e) {
				return null;
			}	
	}

}