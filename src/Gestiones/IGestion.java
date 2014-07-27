/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import ClasesPojo.Persona;
import ClasesPojo.Cliente;
import ClasesPojo.Categoria;
import ClasesPojo.Producto;
import ClasesPojo.Empleado;
import java.awt.List;
import java.sql.SQLException;
import javax.swing.JTable;


/**
 *
 * @author PROFESORES
 */
public interface IGestion {
    
    public void Nuevo();
    public void Insertar()throws SQLException;
    public void Consultar()throws SQLException;
    public void Modificar()throws SQLException;
    public void Eliminar()throws SQLException;
    public void ConsultaTotal()throws SQLException;
    
    
}
