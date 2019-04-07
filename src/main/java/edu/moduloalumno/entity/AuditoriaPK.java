package edu.moduloalumno.entity;

import java.io.Serializable;

public class AuditoriaPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idAdmin;
    
    private int idRec;

    public AuditoriaPK() {
    }

    public AuditoriaPK(int idAdmin, int idRec) {
        this.idAdmin = idAdmin;
        this.idRec = idRec;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getIdRec() {
        return idRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAdmin;
		result = prime * result + idRec;
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
		AuditoriaPK other = (AuditoriaPK) obj;
		if (idAdmin != other.idAdmin)
			return false;
		if (idRec != other.idRec)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AuditoriaPK [idAdmin=" + idAdmin + ", idRec=" + idRec + "]";
	}

}
