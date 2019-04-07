package edu.moduloalumno.entity;

import java.io.Serializable;

public class Disponibilidad implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idDisponibilidad;
    
    private String hrInicio;
    
    private String hrFin;
    
    private String totHrs;

    private Ciclo idCiclo;
    
    private Dia idDia;
    
    private Docente idDocente;

    public Disponibilidad() {
    }

    public Disponibilidad(int idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public Disponibilidad(int idDisponibilidad, String hrInicio, String hrFin, String totHrs) {
        this.idDisponibilidad = idDisponibilidad;
        this.hrInicio = hrInicio;
        this.hrFin = hrFin;
        this.totHrs = totHrs;
    }

    public int getIdDisponibilidad() {
        return idDisponibilidad;
    }

    public void setIdDisponibilidad(int idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public String getHrInicio() {
        return hrInicio;
    }

    public void setHrInicio(String hrInicio) {
        this.hrInicio = hrInicio;
    }

    public String getHrFin() {
        return hrFin;
    }

    public void setHrFin(String hrFin) {
        this.hrFin = hrFin;
    }

    public String getTotHrs() {
        return totHrs;
    }

    public void setTotHrs(String totHrs) {
        this.totHrs = totHrs;
    }

    public Ciclo getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(Ciclo idCiclo) {
        this.idCiclo = idCiclo;
    }

    public Dia getIdDia() {
        return idDia;
    }

    public void setIdDia(Dia idDia) {
        this.idDia = idDia;
    }

    public Docente getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docente idDocente) {
        this.idDocente = idDocente;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDisponibilidad;
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
		Disponibilidad other = (Disponibilidad) obj;
		if (idDisponibilidad != other.idDisponibilidad)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disponibilidad [idDisponibilidad=" + idDisponibilidad + ", hrInicio=" + hrInicio + ", hrFin=" + hrFin
				+ ", totHrs=" + totHrs + ", idCiclo=" + idCiclo + ", idDia=" + idDia + ", idDocente=" + idDocente + "]";
	}

}
