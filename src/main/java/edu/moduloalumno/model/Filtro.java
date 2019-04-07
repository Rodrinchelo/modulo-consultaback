package edu.moduloalumno.model;

import java.util.Arrays;

public class Filtro {
	private String fechaFinal;

	private String nom_ape;

	private String fechaInicial;

	private String[] conceptos;

	private String[] recibos;

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getNom_ape() {
		return nom_ape;
	}

	public void setNom_ape(String nom_ape) {
		this.nom_ape = nom_ape;
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
		return "Filtro [fechaFinal=" + fechaFinal + ", nom_ape=" + nom_ape + ", fechaInicial=" + fechaInicial
				+ ", conceptos=" + Arrays.toString(conceptos) + ", recibos=" + Arrays.toString(recibos) + "]";
	}

}