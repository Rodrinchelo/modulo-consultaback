package edu.moduloalumno.entity;

import java.io.Serializable;

public class AlumnoAlumnoPrograma implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private Integer idAlumno;
    
    private String codAlumno;
    
    private Integer idPrograma;

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public Integer getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(Integer idPrograma) {
		this.idPrograma = idPrograma;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAlumno == null) ? 0 : codAlumno.hashCode());
		result = prime * result + ((idAlumno == null) ? 0 : idAlumno.hashCode());
		result = prime * result + ((idPrograma == null) ? 0 : idPrograma.hashCode());
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
		AlumnoAlumnoPrograma other = (AlumnoAlumnoPrograma) obj;
		if (codAlumno == null) {
			if (other.codAlumno != null)
				return false;
		} else if (!codAlumno.equals(other.codAlumno))
			return false;
		if (idAlumno == null) {
			if (other.idAlumno != null)
				return false;
		} else if (!idAlumno.equals(other.idAlumno))
			return false;
		if (idPrograma == null) {
			if (other.idPrograma != null)
				return false;
		} else if (!idPrograma.equals(other.idPrograma))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AlumnoAlumnoPrograma [idAlumno=" + idAlumno + ", codAlumno=" + codAlumno + ", idPrograma=" + idPrograma
				+ "]";
	}
    
    
}
