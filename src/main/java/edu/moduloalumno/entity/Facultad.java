package edu.moduloalumno.entity;

import java.io.Serializable;

public class Facultad implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idFacultad;
    
    private String nombre;
    
    public Facultad() {
    }

    public Facultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public Facultad(Integer idFacultad, String nombre) {
        this.idFacultad = idFacultad;
        this.nombre = nombre;
    }

    public Integer getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFacultad == null) ? 0 : idFacultad.hashCode());
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
		Facultad other = (Facultad) obj;
		if (idFacultad == null) {
			if (other.idFacultad != null)
				return false;
		} else if (!idFacultad.equals(other.idFacultad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Facultad [idFacultad=" + idFacultad + ", nombre=" + nombre + "]";
	}

	
}
