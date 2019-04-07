package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idCurso;
    
    private String nomCurso;
    
    private String numciclo;
    
    private String numcreditaje;
    
    private char tipocurso;
    
    private String planestudios;
    
    private Programa idPrograma;
    
    private List<Preferencia> preferenciaList;

    public Curso() {
    }

    public Curso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Curso(int idCurso, String nomCurso, String numciclo, String numcreditaje, char tipocurso, String planestudios) {
        this.idCurso = idCurso;
        this.nomCurso = nomCurso;
        this.numciclo = numciclo;
        this.numcreditaje = numcreditaje;
        this.tipocurso = tipocurso;
        this.planestudios = planestudios;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomCurso() {
        return nomCurso;
    }

    public void setNomCurso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    public String getNumciclo() {
        return numciclo;
    }

    public void setNumciclo(String numciclo) {
        this.numciclo = numciclo;
    }

    public String getNumcreditaje() {
        return numcreditaje;
    }

    public void setNumcreditaje(String numcreditaje) {
        this.numcreditaje = numcreditaje;
    }

    public char getTipocurso() {
        return tipocurso;
    }

    public void setTipocurso(char tipocurso) {
        this.tipocurso = tipocurso;
    }

    public String getPlanestudios() {
        return planestudios;
    }

    public void setPlanestudios(String planestudios) {
        this.planestudios = planestudios;
    }

    public Programa getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Programa idPrograma) {
        this.idPrograma = idPrograma;
    }

    public List<Preferencia> getPreferenciaList() {
        return preferenciaList;
    }

    public void setPreferenciaList(List<Preferencia> preferenciaList) {
        this.preferenciaList = preferenciaList;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCurso;
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
		Curso other = (Curso) obj;
		if (idCurso != other.idCurso)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nomCurso=" + nomCurso + ", numciclo=" + numciclo + ", numcreditaje="
				+ numcreditaje + ", tipocurso=" + tipocurso + ", planestudios=" + planestudios + ", idPrograma="
				+ idPrograma + ", preferenciaList=" + preferenciaList + "]";
	}
   
}
