package edu.moduloalumno.entity;

public class Beneficio {
	
	private Integer id_beneficio;
	private String autorizacion;
	private String resolucion;
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

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
	
	@Override
	public String toString() {
		return "Beneficio [id_beneficio=" + id_beneficio + ", autorizacion=" + autorizacion + ", resolucion="+ resolucion+"]";
	}
}
