package edu.moduloalumno.entity;

import java.io.Serializable;

public class RecaudacionesFallidas implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idFallidas;
    
    private String nombreArchivo;
    
    private String descripcionError;
    
    private RegistroCarga idRegistro;

    public RecaudacionesFallidas() {
    }

    public RecaudacionesFallidas(int idFallidas) {
        this.idFallidas = idFallidas;
    }

    public int getIdFallidas() {
        return idFallidas;
    }

    public void setIdFallidas(int idFallidas) {
        this.idFallidas = idFallidas;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public RegistroCarga getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(RegistroCarga idRegistro) {
        this.idRegistro = idRegistro;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFallidas;
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
		RecaudacionesFallidas other = (RecaudacionesFallidas) obj;
		if (idFallidas != other.idFallidas)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecaudacionesFallidas [idFallidas=" + idFallidas + ", nombreArchivo=" + nombreArchivo
				+ ", descripcionError=" + descripcionError + ", idRegistro=" + idRegistro + "]";
	}

}
