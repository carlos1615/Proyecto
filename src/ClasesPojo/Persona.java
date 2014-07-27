/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPojo;

/**
 *
 * @author PROFESORES
 */
public class Persona {

    public Persona(int Codigo, String Nombre, String Apellido, String Cedula, int Edad, String Email, String Telefono, String Celular, String Tipo) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Edad = Edad;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Tipo = Tipo;
        
    }
    
    
        private int Codigo;

    public Persona(int i, String string, String string0, String string1, int i0, String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Get the value of Id
     *
     * @return the value of Id
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * Set the value of Id
     *
     * @param Codigo new value of Id
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    private String Nombre;

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    private String Apellido;

    /**
     * Get the value of Apellido
     *
     * @return the value of Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * Set the value of Apellido
     *
     * @param Apellido new value of Apellido
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    private String Cedula;

    /**
     * Get the value of Cedula
     *
     * @return the value of Cedula
     */
    public String getCedula() {
        return Cedula;
    }

    /**
     * Set the value of Cedula
     *
     * @param Cedula new value of Cedula
     */
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
    private int Edad;

    /**
     * Get the value of Edad
     *
     * @return the value of Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * Set the value of Edad
     *
     * @param Edad new value of Edad
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    private String Email;

    /**
     * Get the value of Email
     *
     * @return the value of Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Set the value of Email
     *
     * @param Email new value of Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    private String Telefono;

    /**
     * Get the value of Telefono
     *
     * @return the value of Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * Set the value of Telefono
     *
     * @param Telefono new value of Telefono
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    private String Celular;

    /**
     * Get the value of Celular
     *
     * @return the value of Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * Set the value of Celular
     *
     * @param Celular new value of Celular
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    private String Tipo;

    /**
     * Get the value of Tipo
     *
     * @return the value of Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * Set the value of Tipo
     *
     * @param Tipo new value of Tipo
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

}
