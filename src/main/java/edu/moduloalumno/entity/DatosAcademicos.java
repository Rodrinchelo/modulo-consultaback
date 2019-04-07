package edu.moduloalumno.entity;

import java.io.Serializable;

public class DatosAcademicos implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idDatAcademicos;
    
    private String mencionGrado;
    
    private String centroEstudios;
    
    private String paisEstudios;
    
    private Docente idDocente;
    
    private TipoGrado idTipGrado;

    public DatosAcademicos() {
    }

    public DatosAcademicos(int idDatAcademicos) {
        this.idDatAcademicos = idDatAcademicos;
    }

    public DatosAcademicos(int idDatAcademicos, String mencionGrado, String centroEstudios, String paisEstudios) {
        this.idDatAcademicos = idDatAcademicos;
        this.mencionGrado = mencionGrado;
        this.centroEstudios = centroEstudios;
        this.paisEstudios = paisEstudios;
    }

    public int getIdDatAcademicos() {
        return idDatAcademicos;
    }

    public void setIdDatAcademicos(int idDatAcademicos) {
        this.idDatAcademicos = idDatAcademicos;
    }

    public String getMencionGrado() {
        return mencionGrado;
    }

    public void setMencionGrado(String mencionGrado) {
        this.mencionGrado = mencionGrado;
    }

    public String getCentroEstudios() {
        return centroEstudios;
    }

    public void setCentroEstudios(String centroEstudios) {
        this.centroEstudios = centroEstudios;
    }

    public String getPaisEstudios() {
        return paisEstudios;
    }

    public void setPaisEstudios(String paisEstudios) {
        this.paisEstudios = paisEstudios;
    }

    public Docente getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docente idDocente) {
        this.idDocente = idDocente;
    }

    public TipoGrado getIdTipGrado() {
        return idTipGrado;
    }

    public void setIdTipGrado(TipoGrado idTipGrado) {
        this.idTipGrado = idTipGrado;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDatAcademicos;
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
		DatosAcademicos other = (DatosAcademicos) obj;
		if (idDatAcademicos != other.idDatAcademicos)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DatosAcademicos [idDatAcademicos=" + idDatAcademicos + ", mencionGrado=" + mencionGrado
				+ ", centroEstudios=" + centroEstudios + ", paisEstudios=" + paisEstudios + ", idDocente=" + idDocente
				+ ", idTipGrado=" + idTipGrado + "]";
	}
     
}
