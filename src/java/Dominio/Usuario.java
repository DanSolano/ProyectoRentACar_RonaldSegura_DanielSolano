/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.time.LocalDate;

/**
 *
 * @author Ronald
 */
public class Usuario {

    String cedula;
    String nombre;
    String apellidos;
    String provincia;
    String canton;
    String distrito;
    String correoElectronico;
    String fechaRegistro;
    
    public Usuario() {
        
    }//fin del constructor

    public Usuario(String cedula, String nombre, String apellidos, String provincia, String canton, String distrito, String correoElectronico, String fechaRegistro) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.correoElectronico = correoElectronico;
        this.fechaRegistro = fechaRegistro;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}//fin de la clase
