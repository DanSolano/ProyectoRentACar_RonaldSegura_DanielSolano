/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ronald
 */
public class Login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String _username=request.getParameter("user");
            String _password=request.getParameter("password");
            
            try{
                if(_username!=null && _password!=null){
                    if(_username.equalsIgnoreCase("admin")&&_password.equalsIgnoreCase("admin")){
                        response.sendRedirect("menuPrincipal.jsp");
                    }else{
                        out.println("Credenciales invalidos, por favor intente de nuevo");
                    }
                }
            }catch(Exception e){
                out.println(e.getMessage());
            }
            
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
