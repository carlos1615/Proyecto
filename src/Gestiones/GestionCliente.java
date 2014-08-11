/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;
import ClasesPojo.Cliente;
import CapaDatos.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos
 */
public class GestionCliente implements IGestion {
     private Cliente cliente;
    private DefaultTableModel tablaCliente;
    
     public GestionCliente() {
        
        cliente=new Cliente(0,0,"","","","","","","");
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;database=PizzeriaDB");
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
        cliente.setCodigoSucursal(0);
        cliente.setNombreCliente("SD");
        cliente.setApellidoCliente("SD");
        cliente.setCedulaCliente("SD");
        cliente.setEmailCliente("SD");
        cliente.setTelefonoCliente("SD");
        cliente.setCelularCliente("SD");
        cliente.setDireccionCliente("SD");
    }

    @Override
    public void Insertar() throws SQLException {
      try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Cliente (codigo_suc,Nombre_Cli,Apellido_Cli,Cedula_Cli,email_cli,telefono_cli,celular_cli,direccion_cli values ("+cliente.getCodigoSucursal()+",'"+cliente.getNombreCliente()+"',"+cliente.getApellidoCliente()+"','"+cliente.getCedulaCliente()+"','"+cliente.getEmailCliente()+"','"+cliente.getTelefonoCliente()+"','"+cliente.getCedulaCliente()+"','"+cliente.getDireccionCliente()+"')");
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
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT codigo_cli,codigo_suc,nombre_cli,apellido_cli,cedula_cli,email_cli,telefono_cli,celular_cli,direccion_cli FROM Cliente WHERE codigo_cli = '"+cliente.getCodigoCliente()+"';");
           while(rs.next()){
               cliente.setCodigoCliente(rs.getInt(1));
               cliente.setCodigoSucursal(rs.getInt(2));
               cliente.setNombreCliente(rs.getString(3));
               cliente.setApellidoCliente(rs.getString(4));
               cliente.setCedulaCliente(rs.getString(5));
               cliente.setEmailCliente(rs.getString(6));
               cliente.setTelefonoCliente(rs.getString(7));
               cliente.setCelularCliente(rs.getString(8));
               cliente.setDireccionCliente(rs.getString(9));
               
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
            Conexionbd.getInstancia().ejecutar("UPDATE Cliente SET codigo_suc = "+cliente.getCodigoSucursal()+", nombre_cli = '"+cliente.getNombreCliente()+"', apellido_cli = '"+cliente.getApellidoCliente()+"', cedula_cli = '"+cliente.getCedulaCliente()+"',email_cli='"+cliente.getEmailCliente()+"telefono_cli='"+cliente.getTelefonoCliente()+"celular_cli='"+cliente.getCelularCliente()+"direccion_cli='"+cliente.getDireccionCliente()+"' WHERE codigo_cli = "+cliente.getCodigoCliente());
             
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

     @Override
    public DefaultTableModel cargarTabla() throws SQLException {
     
        String[] columnas = {"Codigo_cli", "Codigo_Suc","Nombre_Cli","Apellido_Cli","Cedula_Cli","email_cli","telefono_cli","celular_cli","direccion_cli"};
        String[] registro = new String[9];
        this.tablaCliente=new DefaultTableModel((Object[][])null,columnas);
        
        try
        {
             Conexionbd.getInstancia().conectar();
            
            ResultSet rs = Conexionbd.getInstancia().ejecutarbusquedatotal("select * from cliente");
            while (rs.next()) {
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);
                registro[5]=rs.getString(6);
                registro[6]=rs.getString(7);
                registro[7]=rs.getString(8);
                registro[8]=rs.getString(9);
                this.tablaCliente.addRow(registro);                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
        return tablaCliente;
    }    

     

}
