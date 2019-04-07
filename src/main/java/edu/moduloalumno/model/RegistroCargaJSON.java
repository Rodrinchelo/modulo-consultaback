package edu.moduloalumno.model;

import java.io.Serializable;
import java.util.Date;

public class RegistroCargaJSON implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idRegistro;

    private String nombreEquipo;

    private String ip;

    private String ruta;

    private Date fechaCarga;

    public RegistroCargaJSON() {
    }

    public RegistroCargaJSON(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Integer getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRegistro == null) ? 0 : idRegistro.hashCode());
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
		RegistroCargaJSON other = (RegistroCargaJSON) obj;
		if (idRegistro == null) {
			if (other.idRegistro != null)
				return false;
		} else if (!idRegistro.equals(other.idRegistro))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegistroCarga [idRegistro=" + idRegistro + ", nombreEquipo=" + nombreEquipo + ", ip=" + ip + ", ruta="
				+ ruta + ", fechaCarga=" + fechaCarga + "]";
	}

}
