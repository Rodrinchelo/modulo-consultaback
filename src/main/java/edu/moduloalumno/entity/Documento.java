package edu.moduloalumno.entity;


import java.io.Serializable;
import java.util.Date;


public class Documento implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int id;
    
    private int idAlumno;
    
    private int numero;
    
    private int concepto;
    
    private String descripcion;
    
    private Date fecha;
    
    private int importe;
    
    private String estadoRegistro;
    
    private String estadoRecibo;

    public Documento() {
    }

    public Documento(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getConcepto() {
        return concepto;
    }

    public void setConcepto(int concepto) {
        this.concepto = concepto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    public String getEstadoRecibo() {
        return estadoRecibo;
    }

    public void setEstadoRecibo(String estadoRecibo) {
        this.estadoRecibo = estadoRecibo;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Documento other = (Documento) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Documento [id=" + id + ", idAlumno=" + idAlumno + ", numero=" + numero + ", concepto=" + concepto
				+ ", descripcion=" + descripcion + ", fecha=" + fecha + ", importe=" + importe + ", estadoRegistro="
				+ estadoRegistro + ", estadoRecibo=" + estadoRecibo + "]";
	}

  
    
}
