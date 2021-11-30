/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AdministrarPaciente;

/**
 *
 * @author jhan_
 */
@WebServlet(name = "ControladorConsulta", urlPatterns = {"/ControladorConsulta"})
public class ControladorConsulta extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorConsulta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorConsulta at " + request.getContextPath() + "</h1>");
            out.println("<h2>"+request.getParameter("sintomas")+"</h2>");
            out.println("</body>");
            out.println("</html>");*/
        }
        String sintomas = request.getParameter("sintomas");
            String enfermedad = request.getParameter("enfermedad");
            String fechaLlegada = LocalDate.now().toString();
            String medicacion = request.getParameter("medicacion");
            String nombrePaciente = "Juanito1"; 
            String presionArterial = request.getParameter("presion");
            float temperatura = Float.parseFloat(request.getParameter("temperatura"));
           float costo = Float.parseFloat(request.getParameter("costo"));
            AdministrarPaciente administrarPaciente = new AdministrarPaciente();
            administrarPaciente.crearConsultaPaciente(1, enfermedad, sintomas, fechaLlegada, medicacion, nombrePaciente, presionArterial, temperatura, costo);
            notificarConsultaGuardada();
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorConsulta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConsulta.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorConsulta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void notificarConsultaGuardada() {
        
        
    }

}
