package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

public class Modulo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idMod;
    
    private String nombre;
    
    private List<Perfil> perfilList;
    
    private List<PerfilModulo> perfilModuloList;
    
    private List<UsuarioModulo> usuarioModuloList;

    public Modulo() {
    }

    public Modulo(int idMod) {
        this.idMod = idMod;
    }

    public Modulo(int idMod, String nombre) {
        this.idMod = idMod;
        this.nombre = nombre;
    }

    public int getIdMod() {
        return idMod;
    }

    public void setIdMod(int idMod) {
        this.idMod = idMod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Perfil> getPerfilList() {
        return perfilList;
    }

    public void setPerfilList(List<Perfil> perfilList) {
        this.perfilList = perfilList;
    }

    public List<PerfilModulo> getPerfilModuloList() {
        return perfilModuloList;
    }

    public void setPerfilModuloList(List<PerfilModulo> perfilModuloList) {
        this.perfilModuloList = perfilModuloList;
    }

    public List<UsuarioModulo> getUsuarioModuloList() {
        return usuarioModuloList;
    }

    public void setUsuarioModuloList(List<UsuarioModulo> usuarioModuloList) {
        this.usuarioModuloList = usuarioModuloList;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMod;
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
		Modulo other = (Modulo) obj;
		if (idMod != other.idMod)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Modulo [idMod=" + idMod + ", nombre=" + nombre + ", perfilList=" + perfilList + ", perfilModuloList="
				+ perfilModuloList + ", usuarioModuloList=" + usuarioModuloList + "]";
	}
    
}
