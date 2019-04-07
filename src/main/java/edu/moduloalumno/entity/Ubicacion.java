package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

public class Ubicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idUbicacion;
    
    private String descripcion;
    
    private List<Recaudaciones> recaudacionesList;

    public Ubicacion() {
    }

    public Ubicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Recaudaciones> getRecaudacionesList() {
        return recaudacionesList;
    }

    public void setRecaudacionesList(List<Recaudaciones> recaudacionesList) {
        this.recaudacionesList = recaudacionesList;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUbicacion == null) ? 0 : idUbicacion.hashCode());
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
		Ubicacion other = (Ubicacion) obj;
		if (idUbicacion == null) {
			if (other.idUbicacion != null)
				return false;
		} else if (!idUbicacion.equals(other.idUbicacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ubicacion [idUbicacion=" + idUbicacion + ", descripcion=" + descripcion + ", recaudacionesList="
				+ recaudacionesList + "]";
	}
  
}
