/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;
import ClasesPojo.Usuarios;
import CapaDatos.Conexionbd;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class Gestion_Usuario implements IGestion{
private Usuarios usuario;
    public Gestion_Usuario() {
        usuario=new Usuarios(0,0,"","","","");
        Conexionbd.setPersona("DBA");
        Conexionbd.setClave("sql");
        Conexionbd.setCadenaConexion("jdbc:sqlanywhere:uid=DBA;pwd=sql;database=PizzeriaB");
    }
    

    @Override
    public void Nuevo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Insertar() throws SQLException {
        try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Usuario (cod_usu,codigo_emp,uid_usu,pwd_usu,permiso_usu) values ("+usuario.getCodigoUsuario()+",'"+usuario.getCodigoEmpleado()+"','"+usuario.getNombreUsuario()+"','"+usuario.getPwdUsuario()+"','"+usuario.getPermisoUsuario()+"')");
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Modificar() throws SQLException {
try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("UPDATE Usuarios SET nombre_usu = '"+usuario.getPermisoUsuario()+"', uid_usu = '"+usuario.getPwdUsuario()+"', permiso_per = '"+usuario.getPermisoUsuario()+"' WHERE codigo_per = "+usuario.getCodigoUsuario());
             
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ConsultaTotal() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel cargarTabla() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
