package edu.moduloalumno.entity;

import java.io.Serializable;

public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idAlum;
    
    private String apeNom;
    
    private String codigo;
    
    private String dni;
      
    private Integer idFacultad;
    

    public Alumno() {
    }

    public Alumno(Integer idAlum) {
        this.idAlum = idAlum;
    }

    public Alumno(Integer idAlum, String apeNom) {
        this.idAlum = idAlum;
        this.apeNom = apeNom;
    }

    public Integer getIdAlum() {
        return idAlum;
    }

    public void setIdAlum(Integer idAlum) {
        this.idAlum = idAlum;
    }

    public String getApeNom() {
        return apeNom;
    }

    public void setApeNom(String apeNom) {
        this.apeNom = apeNom;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(Integer idFacultad) {
        this.idFacultad = idFacultad;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAlum == null) ? 0 : idAlum.hashCode());
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
		Alumno other = (Alumno) obj;
		if (idAlum == null) {
			if (other.idAlum != null)
				return false;
		} else if (!idAlum.equals(other.idAlum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumno [idAlum=" + idAlum + ", apeNom=" + apeNom + ", codigo=" + codigo + ", dni=" + dni
				+ ", idFacultad=" + idFacultad + "]";
	}

}
