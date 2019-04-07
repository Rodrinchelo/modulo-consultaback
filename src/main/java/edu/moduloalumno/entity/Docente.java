/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Docente implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int id;
    
    private String nombres;
    
    private String apellPat;
    
    private String apellMat;
    
    private String pais;
    
    private String tipoDocument;
    
    private String nroDocument;
    
    private String codigo;
    
    private String telefono;
    
    private String celular;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    
    private String email;
    
    private String linkedInId;
    
    private String genero;
    
    private String pagWeb;
    
    private String foto;
    
    private Date fechaNac;
    
    private String direccion;
    
    private String mayorGrado;
    
    private String mencGrado;
    
    private String universidad;
    
    private String paisGrado;
    
    private String cv;
    
    private String fechIngreso;
    
    private String suneduLey;
    
    private String nivelPrograma;
    
    private String categoria;
    
    private String regimenDedicacion;
    
    private String horasSemanales;
    
    private String investigador;
    
    private String dina;
    
    private String perAcademico;
    
    private String observacion;
    
    private Date resetPasswordExpires;
    
    private String resetPasswordToken;
    
    private Date createdAt;
    
    private Date updatedAt;
    
    private int logins;
    
    private Object profile;
   
    private Object tokens;
    
    private List<DesignacionJuradoInformante> designacionJuradoInformanteList;
    
    private List<DatosAcademicos> datosAcademicosList;
    
    private List<Tesis> tesisList;
    
    private List<DocenteJuradoExaminador> docenteJuradoExaminadorList;
    
    private Usuario idUsuario;
    
    private List<Disponibilidad> disponibilidadList;
    
    private List<Preferencia> preferenciaList;

    public Docente() {
    }

    public Docente(int id) {
        this.id = id;
    }

    public Docente(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellPat() {
        return apellPat;
    }

    public void setApellPat(String apellPat) {
        this.apellPat = apellPat;
    }

    public String getApellMat() {
        return apellMat;
    }

    public void setApellMat(String apellMat) {
        this.apellMat = apellMat;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoDocument() {
        return tipoDocument;
    }

    public void setTipoDocument(String tipoDocument) {
        this.tipoDocument = tipoDocument;
    }

    public String getNroDocument() {
        return nroDocument;
    }

    public void setNroDocument(String nroDocument) {
        this.nroDocument = nroDocument;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedInId() {
        return linkedInId;
    }

    public void setLinkedInId(String linkedInId) {
        this.linkedInId = linkedInId;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMayorGrado() {
        return mayorGrado;
    }

    public void setMayorGrado(String mayorGrado) {
        this.mayorGrado = mayorGrado;
    }

    public String getMencGrado() {
        return mencGrado;
    }

    public void setMencGrado(String mencGrado) {
        this.mencGrado = mencGrado;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getPaisGrado() {
        return paisGrado;
    }

    public void setPaisGrado(String paisGrado) {
        this.paisGrado = paisGrado;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getFechIngreso() {
        return fechIngreso;
    }

    public void setFechIngreso(String fechIngreso) {
        this.fechIngreso = fechIngreso;
    }

    public String getSuneduLey() {
        return suneduLey;
    }

    public void setSuneduLey(String suneduLey) {
        this.suneduLey = suneduLey;
    }

    public String getNivelPrograma() {
        return nivelPrograma;
    }

    public void setNivelPrograma(String nivelPrograma) {
        this.nivelPrograma = nivelPrograma;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRegimenDedicacion() {
        return regimenDedicacion;
    }

    public void setRegimenDedicacion(String regimenDedicacion) {
        this.regimenDedicacion = regimenDedicacion;
    }

    public String getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(String horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public String getInvestigador() {
        return investigador;
    }

    public void setInvestigador(String investigador) {
        this.investigador = investigador;
    }

    public String getDina() {
        return dina;
    }

    public void setDina(String dina) {
        this.dina = dina;
    }

    public String getPerAcademico() {
        return perAcademico;
    }

    public void setPerAcademico(String perAcademico) {
        this.perAcademico = perAcademico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getResetPasswordExpires() {
        return resetPasswordExpires;
    }

    public void setResetPasswordExpires(Date resetPasswordExpires) {
        this.resetPasswordExpires = resetPasswordExpires;
    }

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getLogins() {
        return logins;
    }

    public void setLogins(int logins) {
        this.logins = logins;
    }

    public Object getProfile() {
        return profile;
    }

    public void setProfile(Object profile) {
        this.profile = profile;
    }

    public Object getTokens() {
        return tokens;
    }

    public void setTokens(Object tokens) {
        this.tokens = tokens;
    }

    public List<DesignacionJuradoInformante> getDesignacionJuradoInformanteList() {
        return designacionJuradoInformanteList;
    }

    public void setDesignacionJuradoInformanteList(List<DesignacionJuradoInformante> designacionJuradoInformanteList) {
        this.designacionJuradoInformanteList = designacionJuradoInformanteList;
    }

    public List<DatosAcademicos> getDatosAcademicosList() {
        return datosAcademicosList;
    }

    public void setDatosAcademicosList(List<DatosAcademicos> datosAcademicosList) {
        this.datosAcademicosList = datosAcademicosList;
    }

    public List<Tesis> getTesisList() {
        return tesisList;
    }

    public void setTesisList(List<Tesis> tesisList) {
        this.tesisList = tesisList;
    }

    public List<DocenteJuradoExaminador> getDocenteJuradoExaminadorList() {
        return docenteJuradoExaminadorList;
    }

    public void setDocenteJuradoExaminadorList(List<DocenteJuradoExaminador> docenteJuradoExaminadorList) {
        this.docenteJuradoExaminadorList = docenteJuradoExaminadorList;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Disponibilidad> getDisponibilidadList() {
        return disponibilidadList;
    }

    public void setDisponibilidadList(List<Disponibilidad> disponibilidadList) {
        this.disponibilidadList = disponibilidadList;
    }

    public List<Preferencia> getPreferenciaList() {
        return preferenciaList;
    }

    public void setPreferenciaList(List<Preferencia> preferenciaList) {
        this.preferenciaList = preferenciaList;
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
		Docente other = (Docente) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Docente [id=" + id + ", nombres=" + nombres + ", apellPat=" + apellPat + ", apellMat=" + apellMat
				+ ", pais=" + pais + ", tipoDocument=" + tipoDocument + ", nroDocument=" + nroDocument + ", codigo="
				+ codigo + ", telefono=" + telefono + ", celular=" + celular + ", email=" + email + ", linkedInId="
				+ linkedInId + ", genero=" + genero + ", pagWeb=" + pagWeb + ", foto=" + foto + ", fechaNac=" + fechaNac
				+ ", direccion=" + direccion + ", mayorGrado=" + mayorGrado + ", mencGrado=" + mencGrado
				+ ", universidad=" + universidad + ", paisGrado=" + paisGrado + ", cv=" + cv + ", fechIngreso="
				+ fechIngreso + ", suneduLey=" + suneduLey + ", nivelPrograma=" + nivelPrograma + ", categoria="
				+ categoria + ", regimenDedicacion=" + regimenDedicacion + ", horasSemanales=" + horasSemanales
				+ ", investigador=" + investigador + ", dina=" + dina + ", perAcademico=" + perAcademico
				+ ", observacion=" + observacion + ", resetPasswordExpires=" + resetPasswordExpires
				+ ", resetPasswordToken=" + resetPasswordToken + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", logins=" + logins + ", profile=" + profile + ", tokens=" + tokens
				+ ", designacionJuradoInformanteList=" + designacionJuradoInformanteList + ", datosAcademicosList="
				+ datosAcademicosList + ", tesisList=" + tesisList + ", docenteJuradoExaminadorList="
				+ docenteJuradoExaminadorList + ", idUsuario=" + idUsuario + ", disponibilidadList="
				+ disponibilidadList + ", preferenciaList=" + preferenciaList + "]";
	}

    
}
