package edu.moduloalumno.entity;

import java.io.Serializable;

public class AdministadorSistemas implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idAdmSis;
    
    private String nombAdmSis;
    
    private String apeAdmSis;
    
    private String codigoAdmSis;
    
    private String dniAdmSis;
    
    private String emailAdmSis;
    
    private String telefonoAdmSis;
    
    private Usuario idUsuario;

    public AdministadorSistemas() {
    }

    public AdministadorSistemas(int idAdmSis) {
        this.idAdmSis = idAdmSis;
    }

    public AdministadorSistemas(int idAdmSis, String nombAdmSis, String apeAdmSis, String dniAdmSis, String emailAdmSis, String telefonoAdmSis) {
        this.idAdmSis = idAdmSis;
        this.nombAdmSis = nombAdmSis;
        this.apeAdmSis = apeAdmSis;
        this.dniAdmSis = dniAdmSis;
        this.emailAdmSis = emailAdmSis;
        this.telefonoAdmSis = telefonoAdmSis;
    }

    public int getIdAdmSis() {
        return idAdmSis;
    }

    public void setIdAdmSis(int idAdmSis) {
        this.idAdmSis = idAdmSis;
    }

    public String getNombAdmSis() {
        return nombAdmSis;
    }

    public void setNombAdmSis(String nombAdmSis) {
        this.nombAdmSis = nombAdmSis;
    }

    public String getApeAdmSis() {
        return apeAdmSis;
    }

    public void setApeAdmSis(String apeAdmSis) {
        this.apeAdmSis = apeAdmSis;
    }

    public String getCodigoAdmSis() {
        return codigoAdmSis;
    }

    public void setCodigoAdmSis(String codigoAdmSis) {
        this.codigoAdmSis = codigoAdmSis;
    }

    public String getDniAdmSis() {
        return dniAdmSis;
    }

    public void setDniAdmSis(String dniAdmSis) {
        this.dniAdmSis = dniAdmSis;
    }

    public String getEmailAdmSis() {
        return emailAdmSis;
    }

    public void setEmailAdmSis(String emailAdmSis) {
        this.emailAdmSis = emailAdmSis;
    }

    public String getTelefonoAdmSis() {
        return telefonoAdmSis;
    }

    public void setTelefonoAdmSis(String telefonoAdmSis) {
        this.telefonoAdmSis = telefonoAdmSis;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAdmSis;
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
		AdministadorSistemas other = (AdministadorSistemas) obj;
		if (idAdmSis != other.idAdmSis)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AdministadorSistemas [idAdmSis=" + idAdmSis + ", nombAdmSis=" + nombAdmSis + ", apeAdmSis=" + apeAdmSis
				+ ", codigoAdmSis=" + codigoAdmSis + ", dniAdmSis=" + dniAdmSis + ", emailAdmSis=" + emailAdmSis
				+ ", telefonoAdmSis=" + telefonoAdmSis + ", idUsuario=" + idUsuario + "]";
	}
   
}
