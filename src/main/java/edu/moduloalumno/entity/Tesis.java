package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Tesis implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int idtesis;
   
    private String idalumno;
    
    private Date fechaInscripcion;
    
    private String titulo;
    
    private String nroInscripcion;
    
    private int calificacion;
    
    private Date fechaSustentacion;
    
    private Date horaSustentacion;
    
    private List<DictamenExpedito> dictamenExpeditoList;
    
    private List<DesignacionJuradoExaminador> designacionJuradoExaminadorList;
    
    private List<DesignacionJuradoInformante> designacionJuradoInformanteList;
    
    private Docente iddocente;

    public Tesis() {
    }

    public Tesis(int idtesis) {
        this.idtesis = idtesis;
    }

    public int getIdtesis() {
        return idtesis;
    }

    public void setIdtesis(int idtesis) {
        this.idtesis = idtesis;
    }

    public String getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(String idalumno) {
        this.idalumno = idalumno;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNroInscripcion() {
        return nroInscripcion;
    }

    public void setNroInscripcion(String nroInscripcion) {
        this.nroInscripcion = nroInscripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFechaSustentacion() {
        return fechaSustentacion;
    }

    public void setFechaSustentacion(Date fechaSustentacion) {
        this.fechaSustentacion = fechaSustentacion;
    }

    public Date getHoraSustentacion() {
        return horaSustentacion;
    }

    public void setHoraSustentacion(Date horaSustentacion) {
        this.horaSustentacion = horaSustentacion;
    }

    public List<DictamenExpedito> getDictamenExpeditoList() {
        return dictamenExpeditoList;
    }

    public void setDictamenExpeditoList(List<DictamenExpedito> dictamenExpeditoList) {
        this.dictamenExpeditoList = dictamenExpeditoList;
    }

    public List<DesignacionJuradoExaminador> getDesignacionJuradoExaminadorList() {
        return designacionJuradoExaminadorList;
    }

    public void setDesignacionJuradoExaminadorList(List<DesignacionJuradoExaminador> designacionJuradoExaminadorList) {
        this.designacionJuradoExaminadorList = designacionJuradoExaminadorList;
    }

    public List<DesignacionJuradoInformante> getDesignacionJuradoInformanteList() {
        return designacionJuradoInformanteList;
    }

    public void setDesignacionJuradoInformanteList(List<DesignacionJuradoInformante> designacionJuradoInformanteList) {
        this.designacionJuradoInformanteList = designacionJuradoInformanteList;
    }

    public Docente getIddocente() {
        return iddocente;
    }

    public void setIddocente(Docente iddocente) {
        this.iddocente = iddocente;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idtesis;
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
		Tesis other = (Tesis) obj;
		if (idtesis != other.idtesis)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tesis [idtesis=" + idtesis + ", idalumno=" + idalumno + ", fechaInscripcion=" + fechaInscripcion
				+ ", titulo=" + titulo + ", nroInscripcion=" + nroInscripcion + ", calificacion=" + calificacion
				+ ", fechaSustentacion=" + fechaSustentacion + ", horaSustentacion=" + horaSustentacion
				+ ", dictamenExpeditoList=" + dictamenExpeditoList + ", designacionJuradoExaminadorList="
				+ designacionJuradoExaminadorList + ", designacionJuradoInformanteList="
				+ designacionJuradoInformanteList + ", iddocente=" + iddocente + "]";
	}

        
}
