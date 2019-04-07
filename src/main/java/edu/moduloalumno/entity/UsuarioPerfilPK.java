package edu.moduloalumno.entity;

import java.io.Serializable;

public class UsuarioPerfilPK implements Serializable {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUsuario;
    private int idPerfil;

    public UsuarioPerfilPK() {
    }

    public UsuarioPerfilPK(int idUsuario, int idPerfil) {
        this.idUsuario = idUsuario;
        this.idPerfil = idPerfil;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPerfil;
		result = prime * result + idUsuario;
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
		UsuarioPerfilPK other = (UsuarioPerfilPK) obj;
		if (idPerfil != other.idPerfil)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioPerfilPK [idUsuario=" + idUsuario + ", idPerfil=" + idPerfil + "]";
	}

  
}
