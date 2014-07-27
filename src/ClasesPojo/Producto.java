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
public class Producto {

    public Producto(int codigoProducto, String nombreProducto, String descripcionProducto, int codigoMarca, int codigoCategoria, int stockProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.codigoMarca = codigoMarca;
        this.codigoCategoria = codigoCategoria;
        this.stockProducto = stockProducto;
    }
    
    
    private int codigoProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private int codigoMarca;
    private int codigoCategoria;
    private int stockProducto;

    
    

    /**
     * Get the value of stockProducto
     *
     * @return the value of stockProducto
     */
    public int getStockProducto() {
        return stockProducto;
    }

    /**
     * Set the value of stockProducto
     *
     * @param stockProducto new value of stockProducto
     */
    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }


    /**
     * Get the value of codigoCategoria
     *
     * @return the value of codigoCategoria
     */
    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    /**
     * Set the value of codigoCategoria
     *
     * @param codigoCategoria new value of codigoCategoria
     */
    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }


    /**
     * Get the value of codigoMarca
     *
     * @return the value of codigoMarca
     */
    public int getCodigoMarca() {
        return codigoMarca;
    }

    /**
     * Set the value of codigoMarca
     *
     * @param codigoMarca new value of codigoMarca
     */
    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }


    /**
     * Get the value of descripcionProducto
     *
     * @return the value of descripcionProducto
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Set the value of descripcionProducto
     *
     * @param descripcionProducto new value of descripcionProducto
     */
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }


    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
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

}
