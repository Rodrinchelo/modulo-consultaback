package edu.moduloalumno.entity;

import java.io.Serializable;

public class DocenteJuradoExaminador implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected DocenteJuradoExaminadorPK docenteJuradoExaminadorPK;
    
    private String tipo;
    
    private DesignacionJuradoExaminador designacionJuradoExaminador;
    
    private Docente docente;

    public DocenteJuradoExaminador() {
    }

    public DocenteJuradoExaminador(DocenteJuradoExaminadorPK docenteJuradoExaminadorPK) {
        this.docenteJuradoExaminadorPK = docenteJuradoExaminadorPK;
    }

    public DocenteJuradoExaminador(int iddocente, int iddesignacion) {
        this.docenteJuradoExaminadorPK = new DocenteJuradoExaminadorPK(iddocente, iddesignacion);
    }

    public DocenteJuradoExaminadorPK getDocenteJuradoExaminadorPK() {
        return docenteJuradoExaminadorPK;
    }

    public void setDocenteJuradoExaminadorPK(DocenteJuradoExaminadorPK docenteJuradoExaminadorPK) {
        this.docenteJuradoExaminadorPK = docenteJuradoExaminadorPK;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DesignacionJuradoExaminador getDesignacionJuradoExaminador() {
        return designacionJuradoExaminador;
    }

    public void setDesignacionJuradoExaminador(DesignacionJuradoExaminador designacionJuradoExaminador) {
        this.designacionJuradoExaminador = designacionJuradoExaminador;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((docenteJuradoExaminadorPK == null) ? 0 : docenteJuradoExaminadorPK.hashCode());
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
		DocenteJuradoExaminador other = (DocenteJuradoExaminador) obj;
		if (docenteJuradoExaminadorPK == null) {
			if (other.docenteJuradoExaminadorPK != null)
				return false;
		} else if (!docenteJuradoExaminadorPK.equals(other.docenteJuradoExaminadorPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DocenteJuradoExaminador [docenteJuradoExaminadorPK=" + docenteJuradoExaminadorPK + ", tipo=" + tipo
				+ ", designacionJuradoExaminador=" + designacionJuradoExaminador + ", docente=" + docente + "]";
	}

}
