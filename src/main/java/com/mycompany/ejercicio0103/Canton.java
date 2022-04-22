/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio0103;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Adrian
 */
public class Canton
{
    private String NombreCanton;
    private int Poblacion;
    private double Tamano;

    public String getNombreCanton() {
        return NombreCanton;
    }

    public void setNombreCanton(String NombreCanton) {
        this.NombreCanton = NombreCanton;
    }

    public int getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(int Poblacion) {
        this.Poblacion = Poblacion;
    }

    public double getTamano() {
        return Tamano;
    }

    public void setTamano(double Tamano) {
        this.Tamano = Tamano;
    }

    public Canton(String NombreCanton, int Poblacion, double Tamano) {
        this.NombreCanton = NombreCanton;
        this.Poblacion = Poblacion;
        this.Tamano = Tamano;
    }

    @Override
    public String toString() {
        return "Canton{" + "NombreCanton=" + NombreCanton + ", Poblacion=" + Poblacion + ", Tamano=" + Tamano + '}';
    }

   public double densidadPoblacion()
   {
       return this.Poblacion / this.Tamano;
   }
   
    
}
