/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio0103;

import java.util.Date;

/**
 *
 * @author juansinmiedo
 */
public class Propietario {
    private String nombre;

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", cedula=" + cedula + ", ciudad=" + ciudad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    private int cedula;
    private String ciudad;
    private int fechaNacimiento;
    
    
    
        public int calcularEdad(int yearActual){
        return yearActual - this.fechaNacimiento;
    }
    
    
    
    

}
