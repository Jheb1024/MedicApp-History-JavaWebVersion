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
public class ModeloPaciente {

    /**
     *
     */
    private int id_paciente;
    private String nombre;
    private String app;
    private String apm;
    private float altura;
    private int edad;
    private String fechaNacimiento;
    private float peso;
    private int id_historial;
    private String seguro_social;
    
    public ModeloPaciente() {
    }

    public ModeloPaciente(int id_paciente, String nombre, String app, String apm, float altura, int edad, String fechaNacimiento, float peso, int id_historial, String seguro_social) {
        this.id_paciente = id_paciente;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.altura = altura;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.id_historial = id_historial;
        this.seguro_social = seguro_social;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public String getSeguro_social() {
        return seguro_social;
    }

    public void setSeguro_social(String seguro_social) {
        this.seguro_social = seguro_social;
    }
    
    
}
