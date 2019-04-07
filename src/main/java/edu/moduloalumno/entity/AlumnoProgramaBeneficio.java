package edu.moduloalumno.entity;

import java.util.Date;

public class AlumnoProgramaBeneficio {
	private String cod_alumno;
	//private Integer id_programa;
	private Integer id_beneficio;
	private Integer beneficio_otorgado;
	private String observacion;
	private Integer id_bcondicion;
	private String autorizacion;
	private Date fecha;
	private Integer id_abp;
	private Integer id_bcc;
	private boolean toQuery;
	
	
	public boolean getToQuery() {
		return toQuery;
	}
	public void setToQuery(boolean toQuery) {
		this.toQuery = toQuery;
	}
	public Integer getId_bcondicion() {
		return id_bcondicion;
	}
	public void setId_bcondicion(Integer id_bcondicion) {
		this.id_bcondicion = id_bcondicion;
	}
	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Integer getBeneficio_otorgado() {
		return beneficio_otorgado;
	}
	public void setBeneficio_otorgado(Integer beneficio_otorgado) {
		this.beneficio_otorgado = beneficio_otorgado;
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
	
	public Integer getId_abp() {
		return id_abp;
	}
	public void setId_abp(Integer id_abp) {
		this.id_abp = id_abp;
	}
	
	public Integer getId_bcc() {
		return id_bcc;
	}
	public void setId_bcc(Integer id_bcc) {
		this.id_bcc = id_bcc;
	}
	@Override
	public String toString() {
		return "AlumnoProgramaBeneficio [cod_alumno=" + cod_alumno + ", id_beneficio=" + id_beneficio
				+ ", beneficio_otorgado=" + beneficio_otorgado + ", observacion=" + observacion + ", id_bcondicion="
				+ id_bcondicion + ", autorizacion=" + autorizacion + ", fecha=" + fecha + ", id_abp=" + id_abp
				+ ", id_bcc=" + id_bcc + ", toQuery=" + toQuery + "]";
	}
	
	
	
}