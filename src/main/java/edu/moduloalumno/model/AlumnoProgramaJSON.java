package edu.moduloalumno.model;

import java.io.Serializable;

import edu.moduloalumno.entity.Programa;

public class AlumnoProgramaJSON implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String codAlumno;

    private String apePaterno;

    private String apeMaterno;

    private String nomAlumno;

    private String codEspecialidad;

    private String codTipIngreso;

    private String codSitu;

    private String codPerm;

    private String anioIngreso;

    private String dniM;

    private Programa programa;

    public AlumnoProgramaJSON() {
    }

    public AlumnoProgramaJSON(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public AlumnoProgramaJSON(String codAlumno, String apePaterno, String nomAlumno) {
        this.codAlumno = codAlumno;
        this.apePaterno = apePaterno;
        this.nomAlumno = nomAlumno;
    }

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}

	public String getNomAlumno() {
		return nomAlumno;
	}

	public void setNomAlumno(String nomAlumno) {
		this.nomAlumno = nomAlumno;
	}

	public String getCodEspecialidad() {
		return codEspecialidad;
	}

	public void setCodEspecialidad(String codEspecialidad) {
		this.codEspecialidad = codEspecialidad;
	}

	public String getCodTipIngreso() {
		return codTipIngreso;
	}

	public void setCodTipIngreso(String codTipIngreso) {
		this.codTipIngreso = codTipIngreso;
	}

	public String getCodSitu() {
		return codSitu;
	}

	public void setCodSitu(String codSitu) {
		this.codSitu = codSitu;
	}

	public String getCodPerm() {
		return codPerm;
	}

	public void setCodPerm(String codPerm) {
		this.codPerm = codPerm;
	}

	public String getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(String anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public String getDniM() {
		return dniM;
	}

	public void setDniM(String dniM) {
		this.dniM = dniM;
	}

	public Programa getPrograma() {
		return programa;
	}

	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAlumno == null) ? 0 : codAlumno.hashCode());
		result = prime * result + ((programa == null) ? 0 : programa.hashCode());
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
		AlumnoProgramaJSON other = (AlumnoProgramaJSON) obj;
		if (codAlumno == null) {
			if (other.codAlumno != null)
				return false;
		} else if (!codAlumno.equals(other.codAlumno))
			return false;
		if (programa == null) {
			if (other.programa != null)
				return false;
		} else if (!programa.equals(other.programa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AlumnoProgramaJSON [codAlumno=" + codAlumno + ", apePaterno=" + apePaterno + ", apeMaterno="
				+ apeMaterno + ", nomAlumno=" + nomAlumno + ", codEspecialidad=" + codEspecialidad + ", codTipIngreso="
				+ codTipIngreso + ", codSitu=" + codSitu + ", codPerm=" + codPerm + ", anioIngreso=" + anioIngreso
				+ ", dniM=" + dniM + ", programa=" + programa + "]";
	}

    
}
