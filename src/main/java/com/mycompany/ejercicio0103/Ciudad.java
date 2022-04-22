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
public class Ciudad
{
    private String NombreCiudad;
    private int Cantones;
    private String Gobernador;
    private Canton canton;

    public String getNombreCiudad() {
        return NombreCiudad;
    }

    public void setNombreCiudad(String NombreCiudad) {
        this.NombreCiudad = NombreCiudad;
    }

    public int getCantones() {
        return Cantones;
    }

    public void setCantones(int Cantones) {
        this.Cantones = Cantones;
    }

    public String getGobernador() {
        return Gobernador;
    }

    public void setGobernador(String Gobernador) {
        this.Gobernador = Gobernador;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public Ciudad(String NombreCiudad, int Cantones, String Gobernador, Canton canton) {
        this.NombreCiudad = NombreCiudad;
        this.Cantones = Cantones;
        this.Gobernador = Gobernador;
        this.canton = canton;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "Nombre de la Ciudad=" + NombreCiudad + ", Cantones=" + Cantones + ", Gobernador=" + Gobernador + ", " + canton + '}';
    }
    
    public String gobernadorMayusculas()
    {
        return this.Gobernador.toUpperCase();
    }

   
}
