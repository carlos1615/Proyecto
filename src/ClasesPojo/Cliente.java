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
    private int codigoSucursal;
    private String nombreCliente;
     private String ApellidoCliente;
     private String cedulaCliente; 
     private String emailCliente;
    private String telefonoCliente;
    private String celularCliente;
     private String direccionCliente;

    public Cliente(int codigoCliente, int codigoSucursal, String nombreCliente, String ApellidoCliente, String cedulaCliente, String emailCliente, String telefonoCliente, String celularCliente, String direccionCliente) {
        this.codigoCliente = codigoCliente;
        this.codigoSucursal = codigoSucursal;
        this.nombreCliente = nombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.cedulaCliente = cedulaCliente;
        this.emailCliente = emailCliente;
        this.telefonoCliente = telefonoCliente;
        this.celularCliente = celularCliente;
        this.direccionCliente = direccionCliente;
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

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

   
}
