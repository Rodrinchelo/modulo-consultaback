package edu.moduloalumno.entity;

import java.io.Serializable;

public class UsuarioModulo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected UsuarioModuloPK usuarioModuloPK;
   
    private boolean estadoUm;
    
    private Modulo modulo;
    
    private Usuario usuario;

    public UsuarioModulo() {
    }

    public UsuarioModulo(UsuarioModuloPK usuarioModuloPK) {
        this.usuarioModuloPK = usuarioModuloPK;
    }

    public UsuarioModulo(UsuarioModuloPK usuarioModuloPK, boolean estadoUm) {
        this.usuarioModuloPK = usuarioModuloPK;
        this.estadoUm = estadoUm;
    }

    public UsuarioModulo(int idUsuario, short idMod) {
        this.usuarioModuloPK = new UsuarioModuloPK(idUsuario, idMod);
    }

    public UsuarioModuloPK getUsuarioModuloPK() {
        return usuarioModuloPK;
    }

    public void setUsuarioModuloPK(UsuarioModuloPK usuarioModuloPK) {
        this.usuarioModuloPK = usuarioModuloPK;
    }

    public boolean getEstadoUm() {
        return estadoUm;
    }

    public void setEstadoUm(boolean estadoUm) {
        this.estadoUm = estadoUm;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuarioModuloPK == null) ? 0 : usuarioModuloPK.hashCode());
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
		UsuarioModulo other = (UsuarioModulo) obj;
		if (usuarioModuloPK == null) {
			if (other.usuarioModuloPK != null)
				return false;
		} else if (!usuarioModuloPK.equals(other.usuarioModuloPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioModulo [usuarioModuloPK=" + usuarioModuloPK + ", estadoUm=" + estadoUm + ", modulo=" + modulo
				+ ", usuario=" + usuario + "]";
	}
  
}
