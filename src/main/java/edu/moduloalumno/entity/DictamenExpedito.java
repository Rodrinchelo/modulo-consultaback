package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;

public class DictamenExpedito implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int iddictamen;
    
    private Date fechaDictamen;
    
    private String nroDictamen;
    
    private Tesis idtesis;

    public DictamenExpedito() {
    }

    public DictamenExpedito(int iddictamen) {
        this.iddictamen = iddictamen;
    }

    public int getIddictamen() {
        return iddictamen;
    }

    public void setIddictamen(int iddictamen) {
        this.iddictamen = iddictamen;
    }

    public Date getFechaDictamen() {
        return fechaDictamen;
    }

    public void setFechaDictamen(Date fechaDictamen) {
        this.fechaDictamen = fechaDictamen;
    }

    public String getNroDictamen() {
        return nroDictamen;
    }

    public void setNroDictamen(String nroDictamen) {
        this.nroDictamen = nroDictamen;
    }

    public Tesis getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(Tesis idtesis) {
        this.idtesis = idtesis;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iddictamen;
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
		DictamenExpedito other = (DictamenExpedito) obj;
		if (iddictamen != other.iddictamen)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DictamenExpedito [iddictamen=" + iddictamen + ", fechaDictamen=" + fechaDictamen + ", nroDictamen="
				+ nroDictamen + ", idtesis=" + idtesis + "]";
	}

}
