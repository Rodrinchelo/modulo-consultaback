package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Ciclo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idCiclo;
    
    private String nomCiclo;
    
    private Date fechaInicio;
    
    private Date fechaFin;
    
    private Boolean estado;
    
    private List<Disponibilidad> disponibilidadList;
    
    private List<Preferencia> preferenciaList;

    public Ciclo() {
    }

    public Ciclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }

    public Ciclo(int idCiclo, String nomCiclo) {
        this.idCiclo = idCiclo;
        this.nomCiclo = nomCiclo;
    }

    public int getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getNomCiclo() {
        return nomCiclo;
    }

    public void setNomCiclo(String nomCiclo) {
        this.nomCiclo = nomCiclo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Disponibilidad> getDisponibilidadList() {
        return disponibilidadList;
    }

    public void setDisponibilidadList(List<Disponibilidad> disponibilidadList) {
        this.disponibilidadList = disponibilidadList;
    }

    public List<Preferencia> getPreferenciaList() {
        return preferenciaList;
    }

    public void setPreferenciaList(List<Preferencia> preferenciaList) {
        this.preferenciaList = preferenciaList;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCiclo;
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
		Ciclo other = (Ciclo) obj;
		if (idCiclo != other.idCiclo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ciclo [idCiclo=" + idCiclo + ", nomCiclo=" + nomCiclo + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", estado=" + estado + ", disponibilidadList=" + disponibilidadList + ", preferenciaList="
				+ preferenciaList + "]";
	}
   
}
