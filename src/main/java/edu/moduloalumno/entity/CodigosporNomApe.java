/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moduloalumno.entity;

/**
 *
 * @author Jonathan
 */
public class CodigosporNomApe {
    
    private String cod_alumno;
    private String nombre_alumno;
    private String nombre_programa;
    
    public CodigosporNomApe() {
        super();
    }
    
    public CodigosporNomApe(String cod_alumno, String nombre_alumno, String nombre_programa) {
        super();
        this.cod_alumno = cod_alumno;
        this.nombre_alumno = nombre_alumno;
        this.nombre_programa = nombre_programa;
    }
    

    public String getCod_alumno() {
        return cod_alumno;
    }

    public void setCod_alumno(String cod_alumno) {
        this.cod_alumno = cod_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public String getNombre_programa() {
        return nombre_programa;
    }

    public void setNombre_programa(String nombre_programa) {
        this.nombre_programa = nombre_programa;
    }

    
}
