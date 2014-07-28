/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexionbd;
import CapaInterfaz.InterfazPersonas;
import ClasesPojo.Persona;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROFESORES
 */
public class GestionPersona implements IGestion {
     private Object[][] dtPersona;
     DefaultTableModel tablaPersona;
    String consulta;
    
        private Persona persona;

    public GestionPersona() {
        
        persona=new Persona(0,"","","",0,"","","","");
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;database=PizzeriaB");
    }
        
        

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Set the value of usuario
     *
     * @param persona new value of usuario
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void Nuevo() {
        persona.setCodigo(0);
        persona.setNombre(null);
        persona.setApellido(null);
        persona.setCedula(null);
        persona.setEdad(0);
        persona.setEmail(null);
        persona.setTelefono(null);
        persona.setCelular(null);
        persona.setTipo(null);
        
    }

    @Override
    public void Insertar() throws SQLException {
        
        try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Persona (codigo_per,nombre_per,apellido_per,cedula_per,edad_per,email_per,telefono_per,celular_per, tipo_per) values ("+persona.getCodigo()+",'"+persona.getNombre()+"','"+persona.getApellido()+"','"+persona.getCedula()+"','"+persona.getEdad()+"','"+persona.getEmail()+"','"+persona.getTelefono()+"','"+persona.getCelular()+"','"+persona.getTipo()+"')");
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
        
    }

    @Override
    public void Consultar() throws SQLException {
        try
        {
         Conexionbd.getInstancia().conectar();
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT codigo_per,nombre_per,apellido_per,cedula_per,edad_per,email_per,telefono_per,celular_per, tipo_per FROM Persona WHERE codigo_per = '"+persona.getCodigo()+"';");
           while(rs.next()){
               persona.setCodigo(rs.getInt(1));
               persona.setNombre(rs.getString(2));
               persona.setApellido(rs.getString(3));
               persona.setCedula(rs.getString(4));
               persona.setEdad(rs.getInt(5));
               persona.setEmail(rs.getString(6));
               persona.setTelefono(rs.getString(7));
               persona.setCelular(rs.getString(8));
               persona.setTipo(rs.getString(9));
        }
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }
    @Override
    public void ConsultaTotal()throws SQLException{

}
    
     
    @Override
    public void Modificar() throws SQLException {        
        try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("UPDATE Persona SET nombre_per = '"+persona.getNombre()+"', apellido_per = '"+persona.getApellido()+"', cedula_per = '"+persona.getCedula()+"', edad_per = '"+persona.getEdad()+"', email_per = '"+persona.getEmail()+"', telefono_per = '"+persona.getTelefono()+"', celular_per = '"+persona.getCelular()+"', tipo_per = '"+persona.getTipo()+"' WHERE codigo_per = "+persona.getCodigo());
             
        }
       catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }

    @Override
    public void Eliminar() throws SQLException {
         try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("DELETE FROM Persona WHERE Codigo_per = "+persona.getCodigo());
               
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }
    
     @Override
     public DefaultTableModel cargarTabla()throws SQLException{;
     {
        String[] columnas = {"Codigo","Nombre", "Apellido", "Cedula","Email","Telefono","Celular","Tipo" };
        String[] registro = new String[9];
        this.tablaPersona=new DefaultTableModel((Object[][])null,columnas);
       
        try
        {
             Conexionbd.getInstancia().conectar();
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT codigo_per,nombre_per,apellido_per,cedula_per,edad_per,email_per,telefono_per,celular_per, tipo_per FROM Persona ");
               while (rs.next()) {
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);
                registro[5]=rs.getString(6);
                registro[6]=rs.getString(7);
                registro[7]=rs.getString(8);
                this.tablaPersona.addRow(registro);                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
        return tablaPersona;
    }
}
}
    

