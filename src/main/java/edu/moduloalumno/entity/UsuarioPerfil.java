package edu.moduloalumno.entity;

import java.io.Serializable;

public class UsuarioPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    
    protected UsuarioPerfilPK usuarioPerfilPK;
    
    private boolean estadoUp;
    
    private Perfil perfil;
    
    private Usuario usuario;

    public UsuarioPerfil() {
    }

    public UsuarioPerfil(UsuarioPerfilPK usuarioPerfilPK) {
        this.usuarioPerfilPK = usuarioPerfilPK;
    }

    public UsuarioPerfil(UsuarioPerfilPK usuarioPerfilPK, boolean estadoUp) {
        this.usuarioPerfilPK = usuarioPerfilPK;
        this.estadoUp = estadoUp;
    }

    public UsuarioPerfil(int idUsuario, int idPerfil) {
        this.usuarioPerfilPK = new UsuarioPerfilPK(idUsuario, idPerfil);
    }

    public UsuarioPerfilPK getUsuarioPerfilPK() {
        return usuarioPerfilPK;
    }

    public void setUsuarioPerfilPK(UsuarioPerfilPK usuarioPerfilPK) {
        this.usuarioPerfilPK = usuarioPerfilPK;
    }

    public boolean getEstadoUp() {
        return estadoUp;
    }

    public void setEstadoUp(boolean estadoUp) {
        this.estadoUp = estadoUp;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
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
		result = prime * result + ((usuarioPerfilPK == null) ? 0 : usuarioPerfilPK.hashCode());
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
		UsuarioPerfil other = (UsuarioPerfil) obj;
		if (usuarioPerfilPK == null) {
			if (other.usuarioPerfilPK != null)
				return false;
		} else if (!usuarioPerfilPK.equals(other.usuarioPerfilPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioPerfil [usuarioPerfilPK=" + usuarioPerfilPK + ", estadoUp=" + estadoUp + ", perfil=" + perfil
				+ ", usuario=" + usuario + "]";
	}
   
}
