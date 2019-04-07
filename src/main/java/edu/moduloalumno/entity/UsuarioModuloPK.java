package edu.moduloalumno.entity;

import java.io.Serializable;

public class UsuarioModuloPK implements Serializable {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idUsuario;
    
    private int idMod;

    public UsuarioModuloPK() {
    }

    public UsuarioModuloPK(int idUsuario, int idMod) {
        this.idUsuario = idUsuario;
        this.idMod = idMod;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdMod() {
        return idMod;
    }

    public void setIdMod(int idMod) {
        this.idMod = idMod;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMod;
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
		UsuarioModuloPK other = (UsuarioModuloPK) obj;
		if (idMod != other.idMod)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioModuloPK [idUsuario=" + idUsuario + ", idMod=" + idMod + "]";
	}
   
}
