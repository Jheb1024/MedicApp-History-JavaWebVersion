/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServlet;
import modelo.Conexion;

@RequestScoped
@Named("Login")
public class Login{

    private String username;
    private String password;
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    

    public void onLogin(ActionEvent e) {
        if (username.equalsIgnoreCase("")) {
            throw new AbortProcessingException("Usuario invalido");
        }
        // password=null;
    }

    public String submit() throws ClassNotFoundException, SQLException {
        
        Conexion conexion = new Conexion();
        Connection conection = conexion.getConexion();
        String outcome = "none";
        String id_medico="";
        String sql = "SELECT id_medico, password FROM medico WHERE id_medico ="+username;
        
        PreparedStatement ps = null;
        ps = conection.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {            
            id_medico = rs.getString(1);
        }
        if (username.equals(id_medico)) {
            outcome = "success";
            return "home?faces-redirect=true";
        } else {
           mensaje = "Usuario invalido";
        }

        System.out.println(outcome);
        return outcome;
    }
    
    public void enviarMensaje() {
        
    }
    
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
