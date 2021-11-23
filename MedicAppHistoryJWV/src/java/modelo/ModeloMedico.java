/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.ejb.Stateless;

/**
 *
 * @author jhan_
 */
@Stateless
public class ModeloMedico {

    private int id_medico;
    private String nombre;
    private String app;
    private String apm;
    private int edad;
    private String cedula;
    private String password;

    public ModeloMedico(int id_medico, String nombre, String app, String apm, int edad, String cedula, String password) {
        this.id_medico = id_medico;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.edad = edad;
        this.cedula = cedula;
        this.password = password;
    }
    
    public ModeloMedico(){
        
    }

    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
