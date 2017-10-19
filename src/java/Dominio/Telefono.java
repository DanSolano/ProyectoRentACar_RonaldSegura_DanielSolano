/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Ronald
 */
public class Telefono {
    
    String id;
    String telefono;
    String telefonoAntiguo;

    public Telefono() {
    
    }

    public Telefono(String id, String telefono) {
        this.id = id;
        this.telefono = telefono;
    }
    
    public Telefono(String id, String telefono, String telefonoAntiguo) {
        this.id = id;
        this.telefono = telefono;
        this.telefonoAntiguo = telefonoAntiguo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoAntiguo() {
        return telefonoAntiguo;
    }

    public void setTelefonoAntiguo(String telefonoAntiguo) {
        this.telefonoAntiguo = telefonoAntiguo;
    }
    
}//fin de la clase
