/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jhan_
 */
@WebServlet(name = "ControladorAgregarPaciente", urlPatterns = {"/ControladorAgregarPaciente"})
public class ControladorAgregarPaciente extends HttpServlet {

    
    String add="agregar_paciente.xhtml";
    ModeloPaciente p = new ModeloPaciente();
    administrarPaciente ad = new administrarPaciente();


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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorAgregarPaciente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorAgregarPaciente at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
String acceso="";
String action= request.getParameter("accion");

    if(action.equalsIgnoreCase("agregar_paciente"))
    {
        acceso = add;
        
    }else if(action.equalsIgnoreCase("Guardar"))
    {
        String nm= request.getParameter("nombre");
        String ap = request.getParameter("app");
        String apm = request.getParameter("apm");
       float al = Integer.parseInt(request.getParameter("altura"));
        int ed = Integer.parseInt(request.getParameter("edad"));
        String fecha = request.getParameter("fecha");
        float peso = Integer.parseInt(request.getParameter("peso"));
        String no = request.getParameter("no_seguro");
        p.setNombre(nm);
        p.setApp(ap);
        p.setApm(apm);
        p.setAltura(al);
        p.setEdad(ed);
        p.setFechaNacimiento(fecha);
        p.setPeso(peso);
        p.setSeguro_social(no);
        
        ad.ingresar(p);
    }
    RequestDispatcher vista = request.getRequestDispatcher(acceso);
    vista.forward(request, response);
}// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

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
