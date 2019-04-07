package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DesignacionJuradoExaminador implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int id;
    
    private String numeroDesignacion;
    
    private Date fechaDesignacion;
    
    private Tesis idtesis;
    
    private List<DocenteJuradoExaminador> docenteJuradoExaminadorList;

    public DesignacionJuradoExaminador() {
    }

    public DesignacionJuradoExaminador(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroDesignacion() {
        return numeroDesignacion;
    }

    public void setNumeroDesignacion(String numeroDesignacion) {
        this.numeroDesignacion = numeroDesignacion;
    }

    public Date getFechaDesignacion() {
        return fechaDesignacion;
    }

    public void setFechaDesignacion(Date fechaDesignacion) {
        this.fechaDesignacion = fechaDesignacion;
    }

    public Tesis getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Tesis idtesis) {
        this.idtesis = idtesis;
    }

    public List<DocenteJuradoExaminador> getDocenteJuradoExaminadorList() {
        return docenteJuradoExaminadorList;
    }

    public void setDocenteJuradoExaminadorList(List<DocenteJuradoExaminador> docenteJuradoExaminadorList) {
        this.docenteJuradoExaminadorList = docenteJuradoExaminadorList;
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
		DesignacionJuradoExaminador other = (DesignacionJuradoExaminador) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DesignacionJuradoExaminador [id=" + id + ", numeroDesignacion=" + numeroDesignacion
				+ ", fechaDesignacion=" + fechaDesignacion + ", idtesis=" + idtesis + ", docenteJuradoExaminadorList="
				+ docenteJuradoExaminadorList + "]";
	}

}
