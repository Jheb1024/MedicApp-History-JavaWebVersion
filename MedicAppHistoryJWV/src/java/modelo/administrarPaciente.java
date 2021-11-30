/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Conexion;



/**
 *
 * @author Ileana-sama
 */
public class administrarPaciente {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    PreparedStatement ps1;
    PreparedStatement ps2;
    PreparedStatement ps3;


    
 public boolean ingresar (ModeloPaciente nuevo )
    {
        String sql = "insert into paciente (nombre, app, apm, altura, edad, FechaNacimiento, peso, no_seguro_social) values ('"+nuevo.getNombre()+"','"+nuevo.getApp()+"','"+nuevo.getApm()+"','"+nuevo.getAltura()+"','"+nuevo.getEdad()+"','"+nuevo.getFechaNacimiento()+"','"+nuevo.getPeso()+"','"+nuevo.getSeguro_social()+"')";
        String sql2 = "insert into historialmedico (nombre_paciente) values ('"+nuevo.getNombre()+"')";
        String sql3 = "update historialmedico set id_paciente = id where nombre_paciente = '"+nuevo.getNombre()+"'";
        String sql4 = "update paciente set id_historial = id_paciente where nombre = '"+nuevo.getNombre()+"'";
        
        try {
            con = cn.getConexion();
            
            
            
            ps = con.prepareStatement(sql);
             ps1 = con.prepareStatement(sql2);
              ps2 = con.prepareStatement(sql3);
              ps3 = con.prepareStatement(sql4);
            
            
            ps.executeUpdate();
            
           
            ps1.executeUpdate();
            
           
            ps2.executeUpdate();
            
            
            ps3.executeUpdate();
           
            
        }catch (Exception e)
        {
              System.out.println(e);
        }
        
        
       
       /* administrarPaciente nuevo = new administrarPaciente();
        
        ps = con.prepareStatement("{insert into paciente (nombre, app, apm, altura, edad, FechaNacimiento, peso, no_seguro_social) values (?,?,?,?,?,?,?,?)}");
        
        return null; */
        return false;
}
}
