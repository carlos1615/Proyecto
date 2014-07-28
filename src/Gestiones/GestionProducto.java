/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexionbd;
import CapaInterfaz.InterfazProducto;
import ClasesPojo.Persona;
import ClasesPojo.Producto;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos
 */
public class GestionProducto implements IGestion {
    private Producto producto;
    
    public GestionProducto() {
        
        producto=new Producto(0,"","",0,0,0);
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;database=PizzeriaB");
    }
     /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Set the value of usuario
     *
     * @param producto new value of usuario
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
    @Override
    public void Nuevo() {
        producto.setCodigoProducto(0);
        producto.setNombreProducto(null);
        producto.setDescripcionProducto(null);
        producto.setCodigoMarca(0);
        producto.setCodigoCategoria(0);
        producto.setStockProducto(0);
        
    }

    @Override
    public void Insertar() throws SQLException {
       
        
    }

    @Override
    public void Consultar() throws SQLException {
    try
        {
         Conexionbd.getInstancia().conectar();
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT codigo_pro,nombre_pro,descripcion_pro,codigo_mar,codigo_cat,stock_pro FROM Producto WHERE codigo_pro = '"+producto.getCodigoProducto()+"';");
           while(rs.next()){
               producto.setCodigoProducto(rs.getInt(1));
               producto.setNombreProducto(rs.getString(2));
               producto.setDescripcionProducto(rs.getString(3));
               producto.setCodigoMarca(rs.getInt(4));
               producto.setCodigoCategoria(rs.getInt(5));
               producto.setStockProducto(rs.getInt(6));
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
            Conexionbd.getInstancia().ejecutar("UPDATE Producto SET nombre_pro = '"+producto.getNombreProducto()+"', descripcion_pro = '"+producto.getDescripcionProducto()+"', codigo_mar = '"+producto.getCodigoMarca()+"', codigo_cat = '"+producto.getCodigoCategoria()+"', stock_pro = '"+producto.getStockProducto()+"' WHERE codigo_per = "+producto.getCodigoProducto());
             
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
            Conexionbd.getInstancia().ejecutar("DELETE FROM Producto WHERE Codigo_pro = "+producto.getCodigoProducto());
               
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
