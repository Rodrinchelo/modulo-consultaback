package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idPerfil;
    
    private String nombreTipo;
    
    private List<Modulo> moduloList;
    
    private List<PerfilModulo> perfilModuloList;
    
    private List<UsuarioPerfil> usuarioPerfilList;

    public Perfil() {
    }

    public Perfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Perfil(int idPerfil, String nombreTipo) {
        this.idPerfil = idPerfil;
        this.nombreTipo = nombreTipo;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public List<Modulo> getModuloList() {
        return moduloList;
    }

    public void setModuloList(List<Modulo> moduloList) {
        this.moduloList = moduloList;
    }

    public List<PerfilModulo> getPerfilModuloList() {
        return perfilModuloList;
    }

    public void setPerfilModuloList(List<PerfilModulo> perfilModuloList) {
        this.perfilModuloList = perfilModuloList;
    }

    public List<UsuarioPerfil> getUsuarioPerfilList() {
        return usuarioPerfilList;
    }

    public void setUsuarioPerfilList(List<UsuarioPerfil> usuarioPerfilList) {
        this.usuarioPerfilList = usuarioPerfilList;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPerfil;
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
		Perfil other = (Perfil) obj;
		if (idPerfil != other.idPerfil)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nombreTipo=" + nombreTipo + ", moduloList=" + moduloList
				+ ", perfilModuloList=" + perfilModuloList + ", usuarioPerfilList=" + usuarioPerfilList + "]";
	}

}
