package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DesignacionJuradoInformante implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int id;
    
    private Date fechaDesignacion;
    
    private String nroDesignacion;
    
    private List<Docente> docenteList;
    
    private Tesis idtesis;

    public DesignacionJuradoInformante() {
    }

    public DesignacionJuradoInformante(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaDesignacion() {
        return fechaDesignacion;
    }

    public void setFechaDesignacion(Date fechaDesignacion) {
        this.fechaDesignacion = fechaDesignacion;
    }

    public String getNroDesignacion() {
        return nroDesignacion;
    }

    public void setNroDesignacion(String nroDesignacion) {
        this.nroDesignacion = nroDesignacion;
    }

    public List<Docente> getDocenteList() {
        return docenteList;
    }

    public void setDocenteList(List<Docente> docenteList) {
        this.docenteList = docenteList;
    }

    public Tesis getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Tesis idtesis) {
        this.idtesis = idtesis;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		DesignacionJuradoInformante other = (DesignacionJuradoInformante) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DesignacionJuradoInformante [id=" + id + ", fechaDesignacion=" + fechaDesignacion + ", nroDesignacion="
				+ nroDesignacion + ", docenteList=" + docenteList + ", idtesis=" + idtesis + "]";
	}

}
