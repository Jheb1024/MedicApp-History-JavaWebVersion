/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.event.AbortProcessingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Conexion;

/**
 *
 * @author jhan_
 */
@WebServlet(name = "ControladorInicio", urlPatterns = {"/ControladorInicio"})
public class ControladorInicio extends HttpServlet {
    private String username;
    private String password;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        if (username.equalsIgnoreCase("")) {
            throw new AbortProcessingException("Usuario invalido");
        }else{
            Conexion conexion = new Conexion();
        Connection conection = null;
            try {
                conection = conexion.getConexion();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        String outcome = "none";
        String id_medico="";
        String sql = "SELECT id_medico, password FROM medico WHERE id_medico ="+username;
        
        PreparedStatement ps = null;
            try {
                ps = conection.prepareStatement(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        ResultSet rs = null;
            try {
                rs = ps.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            try {
                while (rs.next()) {
                    id_medico = rs.getString(1);
                }   } catch (SQLException ex) {
                Logger.getLogger(ControladorInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        if (username.equals(id_medico)) {
            outcome = "success";
            response.sendRedirect(request.getContextPath() + "/home.xhtml");
        } else {
            String message = "El usuario o la contraseña son incorrectos";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/adminHome.jsp").forward(request, response);

        }
        }
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
