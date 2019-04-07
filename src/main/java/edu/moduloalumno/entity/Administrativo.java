package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.List;

public class Administrativo implements Serializable {

    private static final long serialVersionUID = 1L;
   
    private int idAdmin;
    
    private String nombres;
    
    private String apellidos;
    
    private String codigo;
   
    private String dni;
    
    private String email;
    
    private String telefono;
    
    private List<Auditoria> auditoriaList;
    
    private Usuario idUsuario;

    public Administrativo() {
    }

    public Administrativo(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Administrativo(int idAdmin, String nombres, String apellidos, String codigo, String dni, String email, String telefono) {
        this.idAdmin = idAdmin;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Auditoria> getAuditoriaList() {
        return auditoriaList;
    }

    public void setAuditoriaList(List<Auditoria> auditoriaList) {
        this.auditoriaList = auditoriaList;
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
		result = prime * result + idAdmin;
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
		Administrativo other = (Administrativo) obj;
		if (idAdmin != other.idAdmin)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Administrativo [idAdmin=" + idAdmin + ", nombres=" + nombres + ", apellidos=" + apellidos + ", codigo="
				+ codigo + ", dni=" + dni + ", email=" + email + ", telefono=" + telefono + ", auditoriaList="
				+ auditoriaList + ", idUsuario=" + idUsuario + "]";
	}

}
