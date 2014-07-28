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
public class Usuarios {
    
    private int codigoUsuario;
    private int codigoEmpleado; 
    
    private String nombreUsuario;
    private String pwdUsuario;
    private String permisoUsuario;

    public String getPermisoUsuario() {
        return permisoUsuario;
    }

    public void setPermisoUsuario(String permisoUsuario) {
        this.permisoUsuario = permisoUsuario;
    }

    public Usuarios(int codigoUsuario, int codigoEmpleado, String nombreUsuario, String pwdUsuario) {
        this.codigoUsuario = codigoUsuario;
        this.codigoEmpleado = codigoEmpleado;
        this.nombreUsuario = nombreUsuario;
        this.pwdUsuario = pwdUsuario;
    }

    public Usuarios(int i, int i0, String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of pwdUsuario
     *
     * @return the value of pwdUsuario
     */
    public String getPwdUsuario() {
        return pwdUsuario;
    }

    /**
     * Set the value of pwdUsuario
     *
     * @param pwdUsuario new value of pwdUsuario
     */
    public void setPwdUsuario(String pwdUsuario) {
        this.pwdUsuario = pwdUsuario;
    }


    /**
     * Get the value of nombreUsuario
     *
     * @return the value of nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Set the value of nombreUsuario
     *
     * @param nombreUsuario new value of nombreUsuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    

    /**
     * Get the value of codigoEmpleado
     *
     * @return the value of codigoEmpleado
     */
    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Set the value of codigoEmpleado
     *
     * @param codigoEmpleado new value of codigoEmpleado
     */
    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }


    /**
     * Get the value of codigoUsuario
     *
     * @return the value of codigoUsuario
     */
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Set the value of codigoUsuario
     *
     * @param codigoUsuario new value of codigoUsuario
     */
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

}
