package edu.moduloalumno.entity;

public class Moneda {
	
	private String id_moneda;
	private String moneda;
	private String mascara;
	public String getId_moneda() {
		return id_moneda;
	}
	public void setId_moneda(String id_moneda) {
		this.id_moneda = id_moneda;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getMascara() {
		return mascara;
	}
	public void setMascara(String mascara) {
		this.mascara = mascara;
	}
	@Override
	public String toString() {
		return "Moneda [id_moneda=" + id_moneda + ", moneda=" + moneda + ", mascara=" + mascara + "]";
	}
		
}
