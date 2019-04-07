package edu.moduloalumno.entity;


import java.io.Serializable;

/**
 *
 * @author LaboratorioFISI
 */

public class RecaudacionesRaw implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    
    private int idRaw;
    
    private String moneda;
    
    private String dependencia;
    
    private String concep;
   
    private String concepA;
    
    private String concepB;
    
    private String numero;
    
    private String codigo;
    
    private String nombre;
    
    private int importe;
    
    private String carnet;
    
    private String autoseguro;
    
    private String ave;
    
    private String devolTran;
    
    private String observacion;
    
    private String fecha;

    public RecaudacionesRaw() {
    }

    public RecaudacionesRaw(int idRaw) {
        this.idRaw = idRaw;
    }

    public int getIdRaw() {
        return idRaw;
    }

    public void setIdRaw(int idRaw) {
        this.idRaw = idRaw;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getConcep() {
        return concep;
    }

    public void setConcep(String concep) {
        this.concep = concep;
    }

    public String getConcepA() {
        return concepA;
    }

    public void setConcepA(String concepA) {
        this.concepA = concepA;
    }

    public String getConcepB() {
        return concepB;
    }

    public void setConcepB(String concepB) {
        this.concepB = concepB;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRaw;
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
		RecaudacionesRaw other = (RecaudacionesRaw) obj;
		if (idRaw != other.idRaw)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecaudacionesRaw [idRaw=" + idRaw + ", moneda=" + moneda + ", dependencia=" + dependencia + ", concep="
				+ concep + ", concepA=" + concepA + ", concepB=" + concepB + ", numero=" + numero + ", codigo=" + codigo
				+ ", nombre=" + nombre + ", importe=" + importe + ", carnet=" + carnet + ", autoseguro=" + autoseguro
				+ ", ave=" + ave + ", devolTran=" + devolTran + ", observacion=" + observacion + ", fecha=" + fecha
				+ "]";
	}


}
