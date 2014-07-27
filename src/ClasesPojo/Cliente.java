/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPojo;

/**
 *
 * @author User
 */
public class Cliente {
    
    private int codigoCliente;
    private int CodigoPersona;
    private int codigoSucursal;
    private String estadoCliente;

    public Cliente(int codigoCliente, int CodigoPersona, int codigoSucursal, String estadoCliente) {
        this.codigoCliente = codigoCliente;
        this.CodigoPersona = CodigoPersona;
        this.codigoSucursal = codigoSucursal;
        this.estadoCliente = estadoCliente;
    }

    

    /**
     * Get the value of estadoCliente
     *
     * @return the value of estadoCliente
     */
    public String getEstadoCliente() {
        return estadoCliente;
    }

    /**
     * Set the value of estadoCliente
     *
     * @param estadoCliente new value of estadoCliente
     */
    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }


    /**
     * Get the value of codigoSucursal
     *
     * @return the value of codigoSucursal
     */
    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * Set the value of codigoSucursal
     *
     * @param codigoSucursal new value of codigoSucursal
     */
    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }


    /**
     * Get the value of CodigoPersona
     *
     * @return the value of CodigoPersona
     */
    public int getCodigoPersona() {
        return CodigoPersona;
    }

    /**
     * Set the value of CodigoPersona
     *
     * @param CodigoPersona new value of CodigoPersona
     */
    public void setCodigoPersona(int CodigoPersona) {
        this.CodigoPersona = CodigoPersona;
    }


    /**
     * Get the value of codigoCliente
     *
     * @return the value of codigoCliente
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Set the value of codigoCliente
     *
     * @param codigoCliente new value of codigoCliente
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

}
