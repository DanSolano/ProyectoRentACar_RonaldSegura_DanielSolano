/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Dominio.Telefono;
import Dominio.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ronald
 */
public class ServletUsuario extends HttpServlet {
    
    
    
    Connection cn = null;
    Statement stm;
    ResultSet rs = null;

    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String _accion = request.getParameter("accion");

            String _idUser = request.getParameter("idUser");
            String _nombreUser = request.getParameter("nombreUser");
            String _apellidosUser = request.getParameter("apellidosUser");
            String _provinciaUser = request.getParameter("provinciaUser");
            String _cantonUser = request.getParameter("cantonUser");
            String _distritoUser = request.getParameter("distritoUser");
            String _correoUser = request.getParameter("emailUser");
            String _fechaUser = request.getParameter("fechaRegistroUser");
            String _telefonoUser = request.getParameter("telefonoUser");

            try {
                if (_accion.equalsIgnoreCase("ingresar")) {
                    Dominio.Usuario usuario = new Usuario(_idUser, _nombreUser, _apellidosUser, _provinciaUser, _cantonUser, _distritoUser, _correoUser, _fechaUser);
                    insertUsuario(usuario);
                    
                    if(_telefonoUser!=null){
                        Dominio.Telefono telefono = new Telefono(_idUser, _telefonoUser);
                        insertTelefono(telefono);
                    }
                    
                    response.sendRedirect("ingresarUsuario.jsp");
                }
            } catch (Exception e) {
                out.println(e.getMessage());
            }

        }
        
    }

    public boolean insertUsuario(Usuario usuario) {
        
        int revisa = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://163.178.173.148:1433;databaseName=ProyectoII_B16213_B16322", "lenguajes", "lenguajes");

            //Se crea el string que va a realizar la accion  en la base de datos
                //Para efectos de este proyecto, una insercion en la base de datos
                String stringInsert = "insert into Usuario values('" + usuario.getCedula() + "','"
                        + usuario.getNombre() + "','"
                        + usuario.getApellidos() + "',"
                        + usuario.getProvincia() + ",'"
                        + usuario.getCanton() + "','"
                        + usuario.getDistrito() + "','"
                        + usuario.getCorreoElectronico() + "','"
                        + usuario.getFechaRegistro() + "')";
                //se prepara la conexion con el servidor
                PreparedStatement ps = cn.prepareStatement(stringInsert);
                //Se ejecuta la conexion y la accion de esta
                revisa = ps.executeUpdate();
                //se cierra la conexion
                ps.close();
            
        } catch (Exception e) {
            //Manejo de excepciones
            System.err.println("Error:\n " + e);
            return false;
        }
        return true;
    }
    
    public boolean insertTelefono(Telefono telefono) {
        int revisa = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://163.178.173.148:1433;databaseName=ProyectoII_B16213_B16322", "lenguajes", "lenguajes");

            //Se crea el string que va a realizar la accion  en la base de datos
                //Para efectos de este proyecto, una insercion en la base de datos
                String stringInsert = "insert into Telefono values('" + telefono.getId() + "','"
                        + telefono.getTelefono() + "')";
                //se prepara la conexion con el servidor
                PreparedStatement ps = cn.prepareStatement(stringInsert);
                //Se ejecuta la conexion y la accion de esta
                revisa = ps.executeUpdate();
                //se cierra la conexion
                ps.close();
            
        } catch (Exception e) {
            //Manejo de excepciones
            System.err.println("Error:\n " + e);
            return false;
        }
        return true;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}