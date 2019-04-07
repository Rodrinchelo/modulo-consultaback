package edu.moduloalumno.entity;

import java.io.Serializable;

public class Directiva implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idDirec;
    
    private String nombres;
    
    private String apellidos;
    
    private String codigo;
    
    private String dni;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    
    private String email;
    
    private String telefono;
    
    private Usuario idUsuario;

    public Directiva() {
    }

    public Directiva(int idDirec) {
        this.idDirec = idDirec;
    }

    public Directiva(int idDirec, String nombres, String apellidos, String codigo, String dni, String email, String telefono) {
        this.idDirec = idDirec;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
    }

    public int getIdDirec() {
        return idDirec;
    }

    public void setIdDirec(int idDirec) {
        this.idDirec = idDirec;
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
		result = prime * result + idDirec;
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
		Directiva other = (Directiva) obj;
		if (idDirec != other.idDirec)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directiva [idDirec=" + idDirec + ", nombres=" + nombres + ", apellidos=" + apellidos + ", codigo="
				+ codigo + ", dni=" + dni + ", email=" + email + ", telefono=" + telefono + ", idUsuario=" + idUsuario
				+ "]";
	}
    
}
