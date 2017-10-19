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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ronald
 */
public class ServletUsuario extends HttpServlet {

    private Usuario usuario;

    Connection cn = null;
    Statement stm;
    ResultSet rs = null;

    @Override
    public void init() throws ServletException {
        usuario = new Usuario();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            usuario.setCedula(request.getParameter("idUser"));
            usuario.setNombre(request.getParameter("nombreUser"));
            usuario.setApellidos(request.getParameter("apellidosUser"));
            usuario.setProvincia(request.getParameter("provinciaUser"));
            usuario.setCanton(request.getParameter("cantonUser"));
            usuario.setDistrito(request.getParameter("distritoUser"));
            usuario.setCorreoElectronico(request.getParameter("emailUser"));
            usuario.setFechaRegistro(request.getParameter("fechaRegistroUser"));
            
            int revisa = 0;
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://163.178.173.148:1433;databaseName=ProyectoII_B16213_B16322", "lenguajes", "lenguajes");

            //Se crea el string que va a realizar la accion  en la base de datos
            //Para efectos de este proyecto, una insercion en la base de datos
            String stringInsert = "insert into Usuario values('" + usuario.getCedula() + "','"
                    + usuario.getNombre() + "','"
                    + usuario.getApellidos() + "','"
                    + usuario.getProvincia() + "','"
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
            
            request.setAttribute("usuarioRecibido", this.usuario);
            request.getRequestDispatcher("/usuarioInsertado.jsp").forward(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
}//fin de la clase
