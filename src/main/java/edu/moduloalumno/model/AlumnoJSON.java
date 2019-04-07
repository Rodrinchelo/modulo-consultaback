package edu.moduloalumno.model;

import java.io.Serializable;

import edu.moduloalumno.entity.Facultad;
import edu.moduloalumno.entity.Usuario;

public class AlumnoJSON implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idAlum;

    private String apeNom;

    private String codigo;

    private String dni;

    private Facultad facultad;

    private Usuario usuario;

    public AlumnoJSON() {
    }

    public AlumnoJSON(Integer idAlum) {
        this.idAlum = idAlum;
    }

    public AlumnoJSON(Integer idAlum, String apeNom) {
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

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
		AlumnoJSON other = (AlumnoJSON) obj;
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
				+ ", facultad=" + facultad + ", usuario=" + usuario + "]";
	}
    
}
