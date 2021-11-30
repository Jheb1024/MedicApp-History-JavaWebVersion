/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jhan_
 */
public class AdministrarPaciente extends Administrar{
    public AdministrarPaciente(){
        super();
    }

    @Override
    public void actualizarPaciente() {
        super.actualizarPaciente(); //To change body of generated methods, choose Tools | Templates.
    }
    public void actualizarHistorial(){
    
    }
    
    public void crearConsultaPaciente(int idPaciente, String enfermedad, String sintomas,
    String fechaLlegada, String medicacion, String nombrePaciente, String presionArterial,
    float temperatura, float coste) throws ClassNotFoundException, SQLException{
        
        Conexion conexion = new Conexion();
        Connection conection = conexion.getConexion();
        
        String sql = "INSERT INTO consulta(id_paciente, enfermedad, sintomas, fechaLlegada, medicacion, "
                + "nombre_paciente, presion_arterial, temperatura, coste)values(?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps = null;
        
        ps = conection.prepareStatement(sql);
        ps.setInt(1, idPaciente);
        ps.setString(2, enfermedad);
        ps.setString(3, sintomas);
        ps.setString(4, fechaLlegada);
        ps.setString(5, medicacion);
        ps.setString(6, nombrePaciente);
        ps.setString(7, presionArterial);
        ps.setFloat(8, temperatura);
        ps.setFloat(9, coste);
        ps.execute();
        
        System.out.println("Consulta registrada");
    }
    
   
}
