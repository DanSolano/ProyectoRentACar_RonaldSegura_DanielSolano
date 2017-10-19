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
public class Vehiculo {
    
    String VIN;
    String marca;
    int año;
    int numeroPersonas;
    float kilometrosRecorridos;
    String retornoVehiculo;
    int costoRentaPorDia;
    String urlFotografia;

    public Vehiculo() {
    }

    public Vehiculo(String VIN, String marca, int año, int numeroPersonas, float kilometrosRecorridos, String retornoVehiculo, int costoRentaPorDia, String urlFotografia) {
        this.VIN = VIN;
        this.marca = marca;
        this.año = año;
        this.numeroPersonas = numeroPersonas;
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.retornoVehiculo = retornoVehiculo;
        this.costoRentaPorDia = costoRentaPorDia;
        this.urlFotografia = urlFotografia;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public float getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(float kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public String getRetornoVehiculo() {
        return retornoVehiculo;
    }

    public void setRetornoVehiculo(String retornoVehiculo) {
        this.retornoVehiculo = retornoVehiculo;
    }

    public int getCostoRentaPorDia() {
        return costoRentaPorDia;
    }

    public void setCostoRentaPorDia(int costoRentaPorDia) {
        this.costoRentaPorDia = costoRentaPorDia;
    }

    public String getUrlFotografia() {
        return urlFotografia;
    }

    public void setUrlFotografia(String urlFotografia) {
        this.urlFotografia = urlFotografia;
    }
    
    
    
}//fin de la clase
