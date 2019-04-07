package edu.moduloalumno.model;

import java.io.Serializable;
import java.util.Date;

import edu.moduloalumno.entity.Alumno;
import edu.moduloalumno.entity.AlumnoPrograma;
import edu.moduloalumno.entity.Concepto;
import edu.moduloalumno.entity.RegistroCarga;
import edu.moduloalumno.entity.Tipo;
import edu.moduloalumno.entity.Ubicacion;

public class RecaudacionesJSON implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idRec;

    private String moneda;

    private String numero;

    private Double importe;

    private String carnet;

    private String autoseguro;

    private String ave;

    private String devolTran;

    private String observacion;

    private Date fecha;

    private String codAlum;

    private Integer idProg;    

    private Boolean validado;

    private Alumno alumno;

    private AlumnoPrograma alumnoPrograma;

    private Concepto concepto;

    private RegistroCarga registroCarga;

    private Tipo tipo;

    private Ubicacion ubicacion;

    public RecaudacionesJSON() {
    }

    public RecaudacionesJSON(Integer idRec) {
        this.idRec = idRec;
    }

    public Integer getIdRec() {
        return idRec;
    }

    public void setIdRec(Integer idRec) {
        this.idRec = idRec;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getAutoseguro() {
        return autoseguro;
    }

    public void setAutoseguro(String autoseguro) {
        this.autoseguro = autoseguro;
    }

    public String getAve() {
        return ave;
    }

    public void setAve(String ave) {
        this.ave = ave;
    }

    public String getDevolTran() {
        return devolTran;
    }

    public void setDevolTran(String devolTran) {
        this.devolTran = devolTran;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodAlum() {
        return codAlum;
    }

    public void setCodAlum(String codAlum) {
        this.codAlum = codAlum;
    }
   
    public Integer getIdProg() {
        return idProg;
    }

    public void setIdProg(Integer idProg) {
        this.idProg = idProg;
    }    

    public Boolean getValidado() {
        return validado;
    }

    public void setValidado(Boolean validado) {
        this.validado = validado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public AlumnoPrograma getAlumnoPrograma() {
        return alumnoPrograma;
    }

    public void setAlumnoPrograma(AlumnoPrograma alumnoPrograma) {
        this.alumnoPrograma = alumnoPrograma;
    }

    public Concepto getConcepto() {
        return concepto;
    }

    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }

    public RegistroCarga getRegistroCarga() {
        return registroCarga;
    }

    public void setRegistroCarga(RegistroCarga registroCarga) {
        this.registroCarga = registroCarga;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRec == null) ? 0 : idRec.hashCode());
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
		RecaudacionesJSON other = (RecaudacionesJSON) obj;
		if (idRec == null) {
			if (other.idRec != null)
				return false;
		} else if (!idRec.equals(other.idRec))
			return false;
		return true;
	}

	@Override
	/*public String toString() {
		return "Recaudaciones [idRec=" + idRec + ", moneda=" + moneda + ", numero=" + numero + ", importe=" + importe
				+ ", carnet=" + carnet + ", autoseguro=" + autoseguro + ", ave=" + ave + ", devolTran=" + devolTran
				+ ", observacion=" + observacion + ", fecha=" + fecha + ", validado=" + validado + ", alumno=" + alumno
				+ ", alumnoPrograma=" + alumnoPrograma + ", concepto=" + concepto + ", registroCarga=" + registroCarga
				+ ", tipo=" + tipo + ", ubicacion=" + ubicacion + "]";
	}*/

    public String toString() {
        return "Recaudaciones [idRec=" + idRec + ", moneda=" + moneda + ", numero=" + numero + ", importe=" + importe
                + ", carnet=" + carnet + ", autoseguro=" + autoseguro + ", ave=" + ave + ", devolTran=" + devolTran
                + ", observacion=" + observacion + ", fecha=" + fecha + ", codAlum=" + codAlum + ", idProg=" + idProg + ", validado=" + validado + ", alumno=" + alumno
                + ", alumnoPrograma=" + alumnoPrograma + ", concepto=" + concepto + ", registroCarga=" + registroCarga
                + ", tipo=" + tipo + ", ubicacion=" + ubicacion + "]";
    }


}
