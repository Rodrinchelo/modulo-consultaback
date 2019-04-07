package edu.moduloalumno.model;

import java.io.Serializable;

public class UsuarioJSON implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idUsuario;

    private String userName;

    private String pass;
    

    public UsuarioJSON() {
    }

    public UsuarioJSON(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UsuarioJSON(Integer idUsuario, String userName, String pass) {
        this.idUsuario = idUsuario;
        this.userName = userName;
        this.pass = pass;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idUsuario == null) ? 0 : idUsuario.hashCode());
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
		UsuarioJSON other = (UsuarioJSON) obj;
		if (idUsuario == null) {
			if (other.idUsuario != null)
				return false;
		} else if (!idUsuario.equals(other.idUsuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", userName=" + userName + ", pass=" + pass + "]";
	}
    
}
