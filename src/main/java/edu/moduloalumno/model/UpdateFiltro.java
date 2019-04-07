package edu.moduloalumno.model;

import java.util.Arrays;

public class UpdateFiltro {
	
	private String fechaFinal;

	private String nombres;
	
	private String apellidos;

	private String fechaInicial;

	private String[] conceptos;

	private String[] recibos;

	public String getFechaFinal() {
		return fechaFinal;
	}
	
	

	public String getNombres() {
		return nombres;
	}



	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String[] getConceptos() {
		return conceptos;
	}

	public void setConceptos(String[] conceptos) {
		this.conceptos = conceptos;
	}

	public String[] getRecibos() {
		return recibos;
	}

	public void setRecibos(String[] recibos) {
		this.recibos = recibos;
	}

	@Override
	public String toString() {
		return "UpdateFiltro [fechaFinal=" + fechaFinal +  ", fechaInicial=" + fechaInicial
				+ ", conceptos=" + Arrays.toString(conceptos) + ", recibos=" + Arrays.toString(recibos) + "]";
	}


}