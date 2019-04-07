package edu.moduloalumno.entity;

import java.io.Serializable;

public class ClasePagos implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idClasePagos;
    
    private String descripcion;

    public ClasePagos() {
    }

    public ClasePagos(Integer idClasePagos) {
        this.idClasePagos = idClasePagos;
    }

    public Integer getIdClasePagos() {
        return idClasePagos;
    }

    public void setIdClasePagos(Integer idClasePagos) {
        this.idClasePagos = idClasePagos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idClasePagos == null) ? 0 : idClasePagos.hashCode());
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
		ClasePagos other = (ClasePagos) obj;
		if (idClasePagos == null) {
			if (other.idClasePagos != null)
				return false;
		} else if (!idClasePagos.equals(other.idClasePagos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClasePagos [idClasePagos=" + idClasePagos + ", descripcion=" + descripcion + "]";
	}


}
