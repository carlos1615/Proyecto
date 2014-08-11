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
public class Empleado {
    
    private int codigoEmpelado;
    private String nombreEmpelado;
    private String ApellidoEmpleado;
    private String cedulaEmpleado;
    private int edadEmpleado;
    private String emailEmpleado;
    private String telefonoEmpleado;
    private String celularEmpleado;
    private String cargoEmpleado;
    private int codigoSucusal;
    private String direccionEmpleado;

    /**
     * Get the value of direccionEmpleado
     *
     * @return the value of direccionEmpleado
     */
    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    /**
     * Set the value of direccionEmpleado
     *
     * @param direccionEmpleado new value of direccionEmpleado
     */
    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    /**
     * Get the value of codigoSucusal
     *
     * @return the value of codigoSucusal
     */
    public int getCodigoSucusal() {
        return codigoSucusal;
    }

    /**
     * Set the value of codigoSucusal
     *
     * @param codigoSucusal new value of codigoSucusal
     */
    public void setCodigoSucusal(int codigoSucusal) {
        this.codigoSucusal = codigoSucusal;
    }

    private String estadoEmpleado;

    public Empleado(int codigoEmpelado, String nombreEmpelado, String ApellidoEmpleado, String cedulaEmpleado, int edadEmpleado, String emailEmpleado, String telefonoEmpleado, String celularEmpleado, String cargoEmpleado, int codigoSucusal, String estadoEmpleado) {
        this.codigoEmpelado = codigoEmpelado;
        this.nombreEmpelado = nombreEmpelado;
        this.ApellidoEmpleado = ApellidoEmpleado;
        this.cedulaEmpleado = cedulaEmpleado;
        this.edadEmpleado = edadEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.celularEmpleado = celularEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.codigoSucusal = codigoSucusal;
        this.estadoEmpleado = estadoEmpleado;
    }

    
    

    
    
    

    /**
     * Get the value of estadoEmpleado
     *
     * @return the value of estadoEmpleado
     */
    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    /**
     * Set the value of estadoEmpleado
     *
     * @param estadoEmpleado new value of estadoEmpleado
     */
    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }


    /**
     * Get the value of cargoEmpleado
     *
     * @return the value of cargoEmpleado
     */
    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    /**
     * Set the value of cargoEmpleado
     *
     * @param cargoEmpleado new value of cargoEmpleado
     */
    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }


    /**
     * Get the value of celularEmpleado
     *
     * @return the value of celularEmpleado
     */
    public String getCelularEmpleado() {
        return celularEmpleado;
    }

    /**
     * Set the value of celularEmpleado
     *
     * @param celularEmpleado new value of celularEmpleado
     */
    public void setCelularEmpleado(String celularEmpleado) {
        this.celularEmpleado = celularEmpleado;
    }


    /**
     * Get the value of telefonoEmpleado
     *
     * @return the value of telefonoEmpleado
     */
    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    /**
     * Set the value of telefonoEmpleado
     *
     * @param telefonoEmpleado new value of telefonoEmpleado
     */
    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }


    /**
     * Get the value of emailEmpleado
     *
     * @return the value of emailEmpleado
     */
    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    /**
     * Set the value of emailEmpleado
     *
     * @param emailEmpleado new value of emailEmpleado
     */
    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }


    /**
     * Get the value of edadEmpleado
     *
     * @return the value of edadEmpleado
     */
    public int getEdadEmpleado() {
        return edadEmpleado;
    }

    /**
     * Set the value of edadEmpleado
     *
     * @param edadEmpleado new value of edadEmpleado
     */
    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }


    /**
     * Get the value of cedulaEmpleado
     *
     * @return the value of cedulaEmpleado
     */
    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    /**
     * Set the value of cedulaEmpleado
     *
     * @param cedulaEmpleado new value of cedulaEmpleado
     */
    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }


    /**
     * Get the value of ApellidoEmpleado
     *
     * @return the value of ApellidoEmpleado
     */
    public String getApellidoEmpleado() {
        return ApellidoEmpleado;
    }

    /**
     * Set the value of ApellidoEmpleado
     *
     * @param ApellidoEmpleado new value of ApellidoEmpleado
     */
    public void setApellidoEmpleado(String ApellidoEmpleado) {
        this.ApellidoEmpleado = ApellidoEmpleado;
    }


    /**
     * Get the value of nombreEmpelado
     *
     * @return the value of nombreEmpelado
     */
    public String getNombreEmpelado() {
        return nombreEmpelado;
    }

    /**
     * Set the value of nombreEmpelado
     *
     * @param nombreEmpelado new value of nombreEmpelado
     */
    public void setNombreEmpelado(String nombreEmpelado) {
        this.nombreEmpelado = nombreEmpelado;
    }


    /**
     * Get the value of codigoEmpelado
     *
     * @return the value of codigoEmpelado
     */
    public int getCodigoEmpelado() {
        return codigoEmpelado;
    }

    /**
     * Set the value of codigoEmpelado
     *
     * @param codigoEmpelado new value of codigoEmpelado
     */
    public void setCodigoEmpelado(int codigoEmpelado) {
        this.codigoEmpelado = codigoEmpelado;
    }

}
