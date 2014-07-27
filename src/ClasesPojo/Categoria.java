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
public class Categoria {
  
    private int codigoCategoria;
    private String nombreCategoria;
    private String descripcionCategoria;

    

    public Categoria(int codigoCategoria, String nombreCategoria, String descripcionCategoria) {
        this.codigoCategoria = codigoCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

    /**
     * Get the value of descripcionCategoria
     *
     * @return the value of descripcionCategoria
     */
    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    /**
     * Set the value of descripcionCategoria
     *
     * @param descripcionCategoria new value of descripcionCategoria
     */
    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }


    /**
     * Get the value of nombreCategoria
     *
     * @return the value of nombreCategoria
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    /**
     * Set the value of nombreCategoria
     *
     * @param nombreCategoria new value of nombreCategoria
     */
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
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
  
}
