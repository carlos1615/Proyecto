/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import ClasesPojo.Categoria;
import CapaDatos.Conexionbd;
import java.sql.SQLException;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 * @author Carlos
 */
public class GestionCategoria implements IGestion {
    private Categoria categoria;
    
     public GestionCategoria() {
        
        categoria=new Categoria(0,"","");
       Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;database=PizzeriaB");
    }

 /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Categoria getCategoria() {
        return categoria;
    }
   /**
     * Set the value of usuario
     *
     * @param categoria new value of usuario
     */
    public void setPCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
     @Override
    public void Nuevo() {
    categoria.setCodigoCategoria(0);
    categoria.setNombreCategoria(null);
    categoria.setDescripcionCategoria(null);
    }

    @Override
    public void Insertar() throws SQLException {
    try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Categoria (codigo_cat,nombre_cat,descripcion_cat) values ("+categoria.getCodigoCategoria()+",'"+categoria.getNombreCategoria()+"','"+categoria.getDescripcionCategoria()+"')");
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
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT codigo_cat,nombre_cat,descripcion_cat FROM Categoria WHERE codigo_cat = '"+categoria.getCodigoCategoria()+"';");
           while(rs.next()){
               categoria.setCodigoCategoria(rs.getInt(1));
               categoria.setNombreCategoria(rs.getString(2));
               categoria.setDescripcionCategoria(rs.getString(3));
               
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
    public void Modificar() throws SQLException {
    try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("UPDATE Categoria SET nombre_cat = '"+categoria.getNombreCategoria()+"', descripcion_cat = '"+categoria.getDescripcionCategoria()+"' WHERE codigo_per = "+categoria.getCodigoCategoria());
             
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
            Conexionbd.getInstancia().ejecutar("DELETE FROM Categoria WHERE Codigo_cat = "+categoria.getCodigoCategoria());
               
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
    public void ConsultaTotal() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
