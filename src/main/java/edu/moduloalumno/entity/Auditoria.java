package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;

public class Auditoria implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected AuditoriaPK auditoriaPK;
    
    private Date fecha;
    
    private Administrativo administrativo;
    
    private Recaudaciones recaudaciones;

    public Auditoria() {
    }

    public Auditoria(AuditoriaPK auditoriaPK) {
        this.auditoriaPK = auditoriaPK;
    }

    public Auditoria(AuditoriaPK auditoriaPK, Date fecha) {
        this.auditoriaPK = auditoriaPK;
        this.fecha = fecha;
    }

    public Auditoria(int idAdmin, int idRec) {
        this.auditoriaPK = new AuditoriaPK(idAdmin, idRec);
    }

    public AuditoriaPK getAuditoriaPK() {
        return auditoriaPK;
    }

    public void setAuditoriaPK(AuditoriaPK auditoriaPK) {
        this.auditoriaPK = auditoriaPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Administrativo getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }

    public Recaudaciones getRecaudaciones() {
        return recaudaciones;
    }

    public void setRecaudaciones(Recaudaciones recaudaciones) {
        this.recaudaciones = recaudaciones;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auditoriaPK == null) ? 0 : auditoriaPK.hashCode());
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
		Auditoria other = (Auditoria) obj;
		if (auditoriaPK == null) {
			if (other.auditoriaPK != null)
				return false;
		} else if (!auditoriaPK.equals(other.auditoriaPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Auditoria [auditoriaPK=" + auditoriaPK + ", fecha=" + fecha + ", administrativo=" + administrativo
				+ ", recaudaciones=" + recaudaciones + "]";
	}

}
