package edu.moduloalumno.model;

import java.io.Serializable;

public class TipoGradoJSON implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idTipGrado;

    private String nomTipGrado;

    public TipoGradoJSON() {
    }

    public TipoGradoJSON(String idTipGrado) {
        this.idTipGrado = idTipGrado;
    }

    public String getIdTipGrado() {
        return idTipGrado;
    }

    public void setIdTipGrado(String idTipGrado) {
        this.idTipGrado = idTipGrado;
    }

    public String getNomTipGrado() {
        return nomTipGrado;
    }

    public void setNomTipGrado(String nomTipGrado) {
        this.nomTipGrado = nomTipGrado;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTipGrado == null) ? 0 : idTipGrado.hashCode());
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
		TipoGradoJSON other = (TipoGradoJSON) obj;
		if (idTipGrado == null) {
			if (other.idTipGrado != null)
				return false;
		} else if (!idTipGrado.equals(other.idTipGrado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TipoGrado [idTipGrado=" + idTipGrado + ", nomTipGrado=" + nomTipGrado + "]";
	}

    
}
