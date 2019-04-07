package edu.moduloalumno.entity;

import java.io.Serializable;

public class Preferencia implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idPreferencia;
    
    private Ciclo idCiclo;
    
    private Curso idCurso;
    
    private Docente idDocente;

    public Preferencia() {
    }

    public Preferencia(int idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public int getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(int idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public Ciclo getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(Ciclo idCiclo) {
        this.idCiclo = idCiclo;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    public Docente getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Docente idDocente) {
        this.idDocente = idDocente;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPreferencia;
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
		Preferencia other = (Preferencia) obj;
		if (idPreferencia != other.idPreferencia)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Preferencia [idPreferencia=" + idPreferencia + ", idCiclo=" + idCiclo + ", idCurso=" + idCurso
				+ ", idDocente=" + idDocente + "]";
	}

    
}
