package edu.moduloalumno.entity;

public class BeneficioReporteCredito {
	
	
	private Integer costo_credito; 
	private float costo_credito_d;
	private Integer creditos;
	private float total;
	private float epg;
	private float upg;
	private Float d_total;
	private float d_epg;
	private Float d_upg;
	private String tipo;
	private Float _Total;
	private Float D_Total;
	
	
	
	
	
	public Integer getCosto_credito() {
		return costo_credito;
	}
	public void setCosto_credito(Integer costo_credito) {
		this.costo_credito = costo_credito;
	}
	public float getCosto_credito_d() {
		return costo_credito_d;
	}
	public void setCosto_credito_d(float costo_credito_d) {
		this.costo_credito_d = costo_credito_d;
	}
	public Integer getCreditos() {
		return creditos;
	}
	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getEpg() {
		return epg;
	}
	public void setEpg(float epg) {
		this.epg = epg;
	}
	public float getUpg() {
		return upg;
	}
	public void setUpg(float upg) {
		this.upg = upg;
	}
	public Float getD_total() {
		return d_total;
	}
	public void setD_total(Float d_total) {
		this.d_total = d_total;
	}
	public float getD_epg() {
		return d_epg;
	}
	public void setD_epg(float d_epg) {
		this.d_epg = d_epg;
	}
	public Float getD_upg() {
		return d_upg;
	}
	public void setD_upg(Float d_upg) {
		this.d_upg = d_upg;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Float get_Total() {
		return _Total;
	}
	public void set_Total(Float _Total) {
		this._Total = _Total;
	}
	
	public Float getD_Total() {
		return D_Total;
	}
	public void setD_Total(Float d_Total) {
		D_Total = d_Total;
	}
	@Override
	public String toString() {
		return "BeneficioReporteCredito [costo_credito=" + costo_credito + ", costo_credito_d=" + costo_credito_d
				+ ", creditos=" + creditos + ", total=" + total + ", epg=" + epg + ", upg=" + upg + ", d_total="
				+ d_total + ", d_epg=" + d_epg + ", d_upg=" + d_upg + ", tipo=" + tipo + ", _Total=" + _Total
				+ ", D_Total=" + D_Total + "]";
	}
	
	
	

}
