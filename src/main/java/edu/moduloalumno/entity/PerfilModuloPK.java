package edu.moduloalumno.entity;

import java.io.Serializable;

public class PerfilModuloPK implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idPerfil;
    
    private int idMod;

    public PerfilModuloPK() {
    }

    public PerfilModuloPK(int idPerfil, int idMod) {
        this.idPerfil = idPerfil;
        this.idMod = idMod;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
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
		PerfilModuloPK other = (PerfilModuloPK) obj;
		if (idMod != other.idMod)
			return false;
		if (idPerfil != other.idPerfil)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PerfilModuloPK [idPerfil=" + idPerfil + ", idMod=" + idMod + "]";
	}
  
}
