package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

public class Dia implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private String idDia;
    
    private String nomDia;
    
    private List<Disponibilidad> disponibilidadList;

    public Dia() {
    }

    public Dia(String idDia) {
        this.idDia = idDia;
    }

    public Dia(String idDia, String nomDia) {
        this.idDia = idDia;
        this.nomDia = nomDia;
    }

    public String getIdDia() {
        return idDia;
    }

    public void setIdDia(String idDia) {
        this.idDia = idDia;
    }

    public String getNomDia() {
        return nomDia;
    }

    public void setNomDia(String nomDia) {
        this.nomDia = nomDia;
    }

    public List<Disponibilidad> getDisponibilidadList() {
        return disponibilidadList;
    }

    public void setDisponibilidadList(List<Disponibilidad> disponibilidadList) {
        this.disponibilidadList = disponibilidadList;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idDia == null) ? 0 : idDia.hashCode());
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
		Dia other = (Dia) obj;
		if (idDia == null) {
			if (other.idDia != null)
				return false;
		} else if (!idDia.equals(other.idDia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dia [idDia=" + idDia + ", nomDia=" + nomDia + ", disponibilidadList=" + disponibilidadList + "]";
	}

    
}
