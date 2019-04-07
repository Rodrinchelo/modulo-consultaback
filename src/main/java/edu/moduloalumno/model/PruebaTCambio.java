package edu.moduloalumno.model;

public class PruebaTCambio {
	
	private float compra;
	private float venta;
	
	
	public float getCompra() {
		return compra;
	}
	public void setCompra(float compra) {
		this.compra = compra;
	}
	public float getVenta() {
		return venta;
	}
	public void setVenta(float venta) {
		this.venta = venta;
	}
	@Override
	public String toString() {
		return "PruebaTCambio [compra=" + compra + ", venta=" + venta + "]";
	}
	
}
