/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Stephannie
 */
public class Automovil {
    
    private String numeroCodigo;
    private String nombreDueño;
    private String cedula;
    private String placa;

    public Automovil(String numeroCodigo, String nombreDueño, String cedula, String placa) {
        this.numeroCodigo = numeroCodigo;
        this.nombreDueño = nombreDueño;
        this.cedula = cedula;
        this.placa = placa;
    }

    /**
     * @return the numeroCodigo
     */
    public String getNumeroCodigo() {
        return numeroCodigo;
    }

    /**
     * @param numeroCodigo the numeroCodigo to set
     */
    public void setNumeroCodigo(String numeroCodigo) {
        this.numeroCodigo = numeroCodigo;
    }

    /**
     * @return the nombreDueño
     */
    public String getNombreDueño() {
        return nombreDueño;
    }

    /**
     * @param nombreDueño the nombreDueño to set
     */
    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getInfo(){
        return "Número Código:"+getNumeroCodigo()+"\nNombre Dueño:"+getNombreDueño()+"\nCédula: "+getCedula()+"Número de placa: "+getPlaca();
    }
    
}
