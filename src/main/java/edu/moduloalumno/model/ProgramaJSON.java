package edu.moduloalumno.model;

import java.io.Serializable;

public class ProgramaJSON implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idPrograma;

    private String nomPrograma;

    private String siglaPrograma;

    private boolean vigenciaPrograma;

    private TipoGradoJSON tipoGrado;

    public ProgramaJSON() {
    }

    public ProgramaJSON(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }

    public ProgramaJSON(Integer idPrograma, String nomPrograma, String siglaPrograma, boolean vigenciaPrograma) {
        this.idPrograma = idPrograma;
        this.nomPrograma = nomPrograma;
        this.siglaPrograma = siglaPrograma;
        this.vigenciaPrograma = vigenciaPrograma;
    }

    public Integer getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Integer idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNomPrograma() {
        return nomPrograma;
    }

    public void setNomPrograma(String nomPrograma) {
        this.nomPrograma = nomPrograma;
    }

    public String getSiglaPrograma() {
        return siglaPrograma;
    }

    public void setSiglaPrograma(String siglaPrograma) {
        this.siglaPrograma = siglaPrograma;
    }

    public boolean getVigenciaPrograma() {
        return vigenciaPrograma;
    }

    public void setVigenciaPrograma(boolean vigenciaPrograma) {
        this.vigenciaPrograma = vigenciaPrograma;
    }

    public TipoGradoJSON getTipoGrado() {
        return tipoGrado;
    }

    public void setTipoGrado(TipoGradoJSON tipoGrado) {
        this.tipoGrado = tipoGrado;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		ProgramaJSON other = (ProgramaJSON) obj;
		if (idPrograma == null) {
			if (other.idPrograma != null)
				return false;
		} else if (!idPrograma.equals(other.idPrograma))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Programa [idPrograma=" + idPrograma + ", nomPrograma=" + nomPrograma + ", siglaPrograma="
				+ siglaPrograma + ", vigenciaPrograma=" + vigenciaPrograma + ", tipoGrado=" + tipoGrado + "]";
	}
    
}
