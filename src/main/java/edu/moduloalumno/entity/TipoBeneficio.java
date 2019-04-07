package edu.moduloalumno.entity;

public class TipoBeneficio {
	
	private Integer id_tipo;
	private String tipo;
	private String resolucion;
	private String beneficio_max;
	
	
	public Integer getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(Integer id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getBeneficio_max() {
		return beneficio_max;
	}
	public void setBeneficio_max(String beneficio_max) {
		this.beneficio_max = beneficio_max;
	}
	
	
}
