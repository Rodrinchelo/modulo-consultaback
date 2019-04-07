/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.entity;

import java.io.Serializable;

public class Concepto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idConcepto;
    
    private String concepto;
    
    private String concepA;
    
    private String concepB;
    
    private String descripcion;
    
    private Integer idClasePagos;

    public Concepto() {
    }

    public Concepto(Integer idConcepto) {
        this.idConcepto = idConcepto;
    }

    public Concepto(Integer idConcepto, String concepto, String concepA, String concepB) {
        this.idConcepto = idConcepto;
        this.concepto = concepto;
        this.concepA = concepA;
        this.concepB = concepB;
    }

    public Integer getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(Integer idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getConcepA() {
        return concepA;
    }

    public void setConcepA(String concepA) {
        this.concepA = concepA;
    }

    public String getConcepB() {
        return concepB;
    }

    public void setConcepB(String concepB) {
        this.concepB = concepB;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdClasePagos() {
        return idClasePagos;
    }

    public void setIdClasePagos(Integer idClasePagos) {
        this.idClasePagos = idClasePagos;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idConcepto == null) ? 0 : idConcepto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concepto other = (Concepto) obj;
		if (idConcepto == null) {
			if (other.idConcepto != null)
				return false;
		} else if (!idConcepto.equals(other.idConcepto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Concepto [idConcepto=" + idConcepto + ", concepto=" + concepto + ", concepA=" + concepA + ", concepB="
				+ concepB + ", descripcion=" + descripcion + ", idClasePagos=" + idClasePagos + "]";
	}

}
