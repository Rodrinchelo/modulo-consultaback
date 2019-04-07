package edu.moduloalumno.entity;

import java.io.Serializable;

public class Configuracion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idConfiguracion;
    
    private String descripcion;
    
    private char estado;
    
    private ClasePagos idClasePagos;

    public Configuracion() {
    }

    public Configuracion(int idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public int getIdConfiguracion() {
        return idConfiguracion;
    }

    public void setIdConfiguracion(int idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public ClasePagos getIdClasePagos() {
        return idClasePagos;
    }

    public void setIdClasePagos(ClasePagos idClasePagos) {
        this.idClasePagos = idClasePagos;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idConfiguracion;
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
		Configuracion other = (Configuracion) obj;
		if (idConfiguracion != other.idConfiguracion)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Configuracion [idConfiguracion=" + idConfiguracion + ", descripcion=" + descripcion + ", estado="
				+ estado + ", idClasePagos=" + idClasePagos + "]";
	}

    
}
