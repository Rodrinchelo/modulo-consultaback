package edu.moduloalumno.entity;

public class AlumnoProgramaJOINProgramaJOINAlumno {
	
	private int idAlumno;
	
	private String apeNom;
	
	private String codAlumno;
	
	private int idPrograma;
	
	private String nomPrograma;
	
	private String siglaPrograma;

	public AlumnoProgramaJOINProgramaJOINAlumno() {
		super();
	}

	public AlumnoProgramaJOINProgramaJOINAlumno(int idAlumno, String apeNom, String codAlumno, int idPrograma,
			String nomPrograma, String siglaPrograma) {
		super();
		this.idAlumno = idAlumno;
		this.apeNom = apeNom;
		this.codAlumno = codAlumno;
		this.idPrograma = idPrograma;
		this.nomPrograma = nomPrograma;
		this.siglaPrograma = siglaPrograma;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getApeNom() {
		return apeNom;
	}

	public void setApeNom(String apeNom) {
		this.apeNom = apeNom;
	}

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public int getIdPrograma() {
		return idPrograma;
	}

	public void setIdPrograma(int idPrograma) {
		this.idPrograma = idPrograma;
	}

	public String getNomPrograma() {
		return nomPrograma;
	}

	public void setNomPrograma(String nomPrograma) {
		this.nomPrograma = nomPrograma;
	}

	public String getSiglaPrograma() {
		return siglaPrograma;
	}

	public void setSiglaPrograma(String siglaPrograma) {
		this.siglaPrograma = siglaPrograma;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAlumno == null) ? 0 : codAlumno.hashCode());
		result = prime * result + idAlumno;
		result = prime * result + idPrograma;
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
		AlumnoProgramaJOINProgramaJOINAlumno other = (AlumnoProgramaJOINProgramaJOINAlumno) obj;
		if (codAlumno == null) {
			if (other.codAlumno != null)
				return false;
		} else if (!codAlumno.equals(other.codAlumno))
			return false;
		if (idAlumno != other.idAlumno)
			return false;
		if (idPrograma != other.idPrograma)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AlumnoProgramaJOINProgramaJOINAlumno [idAlumno=" + idAlumno + ", apeNom=" + apeNom + ", codAlumno="
				+ codAlumno + ", idPrograma=" + idPrograma + ", nomPrograma=" + nomPrograma + ", siglaPrograma="
				+ siglaPrograma + "]";
	}
	
	
	
	
	

}
