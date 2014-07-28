/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;
import ClasesPojo.Cliente;
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
 * @author Carlos
 */
public class GestionCliente implements IGestion {
     private Cliente cliente;
    
     public GestionCliente() {
        
        cliente=new Cliente(0,0,0,"");
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;database=PizzeriaB");
    }

 /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Cliente getCliente() {
        return cliente;
    }
   /**
     * Set the value of usuario
     *
     * @param cliente new value of usuario
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void Nuevo() {
    cliente.setCodigoCliente(0);
        cliente.setCodigoPersona(0);
        cliente.setCodigoSucursal(0);
        cliente.setEstadoCliente(null);
        
    }

    @Override
    public void Insertar() throws SQLException {
      try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Cliente (codigo_cli,codigo_per,codigo_suc,estado_cli) values ("+cliente.getCodigoCliente()+",'"+cliente.getCodigoPersona()+"','"+cliente.getCodigoSucursal()+"','"+cliente.getEstadoCliente()+"')");
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
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT codigo_cli,codigo_per,codigo_suc,estado_cli FROM Cliente WHERE codigo_cli = '"+cliente.getCodigoCliente()+"';");
           while(rs.next()){
               cliente.setCodigoCliente(rs.getInt(1));
               cliente.setCodigoPersona(rs.getInt(2));
               cliente.setCodigoSucursal(rs.getInt(3));
               cliente.setEstadoCliente(rs.getString(4));
               
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
            Conexionbd.getInstancia().ejecutar("UPDATE Cliente SET codigo_per = '"+cliente.getCodigoPersona()+"', codigo_suc = '"+cliente.getCodigoSucursal()+"', estado_cli = '"+cliente.getEstadoCliente()+"' WHERE codigo_cli = "+cliente.getCodigoCliente());
             
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
            Conexionbd.getInstancia().ejecutar("DELETE FROM Cliente WHERE Codigo_cli = "+cliente.getCodigoCliente());
               
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
