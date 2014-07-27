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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROFESORES
 */
public class GestionPersona implements IGestion {
     private Object[][] dtPersona;
     DefaultTableModel dta;
    String consulta;
    
        private Persona persona;

    public GestionPersona() {
        
        persona=new Persona(0,"","","",0,"","","");
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
        
    }

    @Override
    public void Insertar() throws SQLException {
        
        try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Persona (codigo_per,nombre_per,apellido_per,cedula_per,edad_per,email_per,telefono_per,celular_per) values ("+persona.getCodigo()+",'"+persona.getNombre()+"','"+persona.getApellido()+"','"+persona.getCedula()+"','"+persona.getEdad()+"','"+persona.getEmail()+"','"+persona.getTelefono()+"','"+persona.getCelular()+"')");
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
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT codigo_per,nombre_per,apellido_per,cedula_per,edad_per,email_per,telefono_per,celular_per FROM Persona WHERE codigo_per = '"+persona.getCodigo()+"';");
           while(rs.next()){
               persona.setCodigo(rs.getInt(1));
               persona.setNombre(rs.getString(2));
               persona.setApellido(rs.getString(3));
               persona.setCedula(rs.getString(4));
               persona.setEdad(rs.getInt(5));
               persona.setEmail(rs.getString(6));
               persona.setTelefono(rs.getString(7));
               persona.setCelular(rs.getString(8));
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
//        
//    Conexionbd.getInstancia().conectar();
////        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT Id,Nombre,Apellido,Cedula FROM usuario ");
////        while(rs.next()){
////            usuario.setId(rs.getInt(1));
////               usuario.setNombre(rs.getString(2));
////               usuario.setApellido(rs.getString(3));
////               usuario.setCedula(rs.getString(4));
//////            ResultSetMetaData res=rs.getMetaData();
//////        int NumeroColumnas=res.getColumnCount();
//////        DefaultTableModel modelo=new DefaultTableModel();
////        }
//        ResultSet sen = Conexionbd.getInstancia().ejecutarbusqueda("SELECT * FROM usuario");
//        ResultSetMetaData res=sen.getMetaData();
////        int NumeroColumnas=res.getColumnCount();
////        DefaultTableModel modelo=new DefaultTableModel();
////        Tabla_datos.setModel(modelo);
////            for (int i = 1; i <= NumeroColumnas; i++) {
////                modelo.addColumn(res.getColumnLabel(i));
////            }
////            while (sen.next()){
////                Object [] fila = new Object[NumeroColumnas];
////                for (int j = 0; j < NumeroColumnas; j++) {
////                    
////                    fila[j]=sen.getObject(j+1);
////                }
////                modelo.addRow(fila);
////                
////            }
//        ArrayList<Object[]> data=new ArrayList<>();
//         while (sen.next()){
//                Object [] fila = new Object[res.getColumnCount()];
//                 for (int j = 0; j < fila.length; j++) {
////                    
//                    fila[j]=sen.getObject(j+1);}
//                 data.add(fila);
//                 dta=(DefaultTableModel)this.Tabla_datos.getModel();
//            for (int i = 0; i < data.size(); i++) {
//                dta.addRow(data.get(i));
//            }
//                 
//                 
//         }
//        
}
    
     
    @Override
    public void Modificar() throws SQLException {        
        try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("UPDATE Persona SET nombre_per = '"+persona.getNombre()+"', apellido_per = '"+persona.getApellido()+"', cedula_per = '"+persona.getCedula()+"', edad_per = '"+persona.getEdad()+"', email_per = '"+persona.getEmail()+"', telefono_per = '"+persona.getTelefono()+"', celular_per = '"+persona.getCelular()+"' WHERE codigo_per = "+persona.getCodigo());
             
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
    
    
}
    

