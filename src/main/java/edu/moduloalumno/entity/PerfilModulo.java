package edu.moduloalumno.entity;

import java.io.Serializable;

public class PerfilModulo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected PerfilModuloPK perfilModuloPK;
    
    private boolean estadoPm;
    
    private Modulo modulo;
    
    private Perfil perfil;

    public PerfilModulo() {
    }

    public PerfilModulo(PerfilModuloPK perfilModuloPK) {
        this.perfilModuloPK = perfilModuloPK;
    }

    public PerfilModulo(PerfilModuloPK perfilModuloPK, boolean estadoPm) {
        this.perfilModuloPK = perfilModuloPK;
        this.estadoPm = estadoPm;
    }

    public PerfilModulo(short idPerfil, short idMod) {
        this.perfilModuloPK = new PerfilModuloPK(idPerfil, idMod);
    }

    public PerfilModuloPK getPerfilModuloPK() {
        return perfilModuloPK;
    }

    public void setPerfilModuloPK(PerfilModuloPK perfilModuloPK) {
        this.perfilModuloPK = perfilModuloPK;
    }

    public boolean getEstadoPm() {
        return estadoPm;
    }

    public void setEstadoPm(boolean estadoPm) {
        this.estadoPm = estadoPm;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((perfilModuloPK == null) ? 0 : perfilModuloPK.hashCode());
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
		PerfilModulo other = (PerfilModulo) obj;
		if (perfilModuloPK == null) {
			if (other.perfilModuloPK != null)
				return false;
		} else if (!perfilModuloPK.equals(other.perfilModuloPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PerfilModulo [perfilModuloPK=" + perfilModuloPK + ", estadoPm=" + estadoPm + ", modulo=" + modulo
				+ ", perfil=" + perfil + "]";
	}

    
}
