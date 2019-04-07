package edu.moduloalumno.entity;

import java.io.Serializable;

public class DocenteJuradoExaminadorPK implements Serializable {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int iddocente;
    
    private int iddesignacion;

    public DocenteJuradoExaminadorPK() {
    }

    public DocenteJuradoExaminadorPK(int iddocente, int iddesignacion) {
        this.iddocente = iddocente;
        this.iddesignacion = iddesignacion;
    }

    public int getIddocente() {
        return iddocente;
    }

    public void setIddocente(int iddocente) {
        this.iddocente = iddocente;
    }

    public int getIddesignacion() {
        return iddesignacion;
    }

    public void setIddesignacion(int iddesignacion) {
        this.iddesignacion = iddesignacion;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iddesignacion;
		result = prime * result + iddocente;
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
		DocenteJuradoExaminadorPK other = (DocenteJuradoExaminadorPK) obj;
		if (iddesignacion != other.iddesignacion)
			return false;
		if (iddocente != other.iddocente)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DocenteJuradoExaminadorPK [iddocente=" + iddocente + ", iddesignacion=" + iddesignacion + "]";
	}

}
