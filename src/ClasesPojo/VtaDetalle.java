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
public class VtaDetalle {
    
    private int codigoDVta;
    private int codigoProducto;
    private int numeroVenta;
    private double precioUniVta;
    
    private double cantidadVendida;

    /**
     * Get the value of cantidadVendida
     *
     * @return the value of cantidadVendida
     */
    public double getCantidadVendida() {
        return cantidadVendida;
    }

    /**
     * Set the value of cantidadVendida
     *
     * @param cantidadVendida new value of cantidadVendida
     */
    public void setCantidadVendida(double cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }


    /**
     * Get the value of precioUniVta
     *
     * @return the value of precioUniVta
     */
    public double getPrecioUniVta() {
        return precioUniVta;
    }

    /**
     * Set the value of precioUniVta
     *
     * @param precioUniVta new value of precioUniVta
     */
    public void setPrecioUniVta(double precioUniVta) {
        this.precioUniVta = precioUniVta;
    }


    /**
     * Get the value of numeroVenta
     *
     * @return the value of numeroVenta
     */
    public int getNumeroVenta() {
        return numeroVenta;
    }

    /**
     * Set the value of numeroVenta
     *
     * @param numeroVenta new value of numeroVenta
     */
    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }


    /**
     * Get the value of codigoProducto
     *
     * @return the value of codigoProducto
     */
    public int getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Set the value of codigoProducto
     *
     * @param codigoProducto new value of codigoProducto
     */
    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }


    /**
     * Get the value of codigoDVta
     *
     * @return the value of codigoDVta
     */
    public int getCodigoDVta() {
        return codigoDVta;
    }

    /**
     * Set the value of codigoDVta
     *
     * @param codigoDVta new value of codigoDVta
     */
    public void setCodigoDVta(int codigoDVta) {
        this.codigoDVta = codigoDVta;
    }

}
