package edu.moduloalumno.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class RegistroCarga implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idRegistro;
    
    private String nombreEquipo;
    
    private String ip;
    
    private String ruta;
    
    private Date fechaCarga;
    
    private List<Recaudaciones> recaudacionesList;
    
    private List<RecaudacionesFallidas> recaudacionesFallidasList;

    public RegistroCarga() {
    }

    public RegistroCarga(Integer idRegistro) {
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
    
    public List<Recaudaciones> getRecaudacionesList() {
        return recaudacionesList;
    }

    public void setRecaudacionesList(List<Recaudaciones> recaudacionesList) {
        this.recaudacionesList = recaudacionesList;
    }

    public List<RecaudacionesFallidas> getRecaudacionesFallidasList() {
        return recaudacionesFallidasList;
    }

    public void setRecaudacionesFallidasList(List<RecaudacionesFallidas> recaudacionesFallidasList) {
        this.recaudacionesFallidasList = recaudacionesFallidasList;
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
		RegistroCarga other = (RegistroCarga) obj;
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
				+ ruta + ", fechaCarga=" + fechaCarga + ", recaudacionesList=" + recaudacionesList
				+ ", recaudacionesFallidasList=" + recaudacionesFallidasList + "]";
	}
 
}
