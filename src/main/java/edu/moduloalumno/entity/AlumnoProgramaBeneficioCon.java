package edu.moduloalumno.entity;


import java.util.Date;

public class AlumnoProgramaBeneficioCon {
	
	private String cod_alumno;
//	private Integer id_programa;
	private Integer id_beneficio;
	private Integer benef_otrogado;
	private String benef_max;
	private String tipo;
	private String autorizacion;
	private String resolucion;
	private Integer id_bc;
	private String condicion;
	private Date fecha;
	private Integer id_abp;
	private String criterio;
	private String observacion;
	
	
	public Integer getBenef_otrogado() {
		return benef_otrogado;
	}
	public void setBenef_otrogado(Integer benef_otrogado) {
		this.benef_otrogado = benef_otrogado;
	}
	public String getBenef_max() {
		return benef_max;
	}
	public void setBenef_max(String benef_max) {
		this.benef_max = benef_max;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getId_bc() {
		return id_bc;
	}
	public void setId_bc(Integer id_bc) {
		this.id_bc = id_bc;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getCod_alumno() {
		return cod_alumno;
	}
	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}
/*	public Integer getId_programa() {
		return id_programa;
	}
	public void setId_programa(Integer id_programa) {
		this.id_programa = id_programa;
	}*/
	public Integer getId_beneficio() {
		return id_beneficio;
	}
	public void setId_beneficio(Integer id_beneficio) {
		this.id_beneficio = id_beneficio;
	}
	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getId_abp() {
		return id_abp;
	}
	public void setId_abp(Integer id_abp) {
		this.id_abp = id_abp;
	}
	
	
	public String getCriterio() {
		return criterio;
	}
	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}
	@Override
	public String toString() {
		return "AlumnoProgramaBeneficioCon [cod_alumno=" + cod_alumno + ", id_programa=" +", id_beneficio=" + id_beneficio + ", benef_otrogado=" + benef_otrogado + ", benef_max=" + benef_max
				+ ", tipo=" + tipo + ", autorizacion=" + autorizacion + ", resolucion=" + resolucion + ", id_bc="
				+ id_bc + ", condicion=" + condicion + ", fecha=" + fecha + ", observacion=" + observacion + "]";
	}
	
}
