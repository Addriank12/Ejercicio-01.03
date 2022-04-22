/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio0103;

import java.time.LocalDate;
import java.util.Date;
import static java.util.concurrent.TimeUnit.DAYS;

/**
 *
 * @author Adrian
 */
public class Pais
{
    private String NombrePais;
    private String Continente;
    private LocalDate Fundacion;
    private Ciudad ciudad;

    public String getNombrePais() {
        return NombrePais;
    }

    public void setNombrePais(String NombrePais) {
        this.NombrePais = NombrePais;
    }

    public String getContinente() {
        return Continente;
    }

    public void setContinente(String Continente) {
        this.Continente = Continente;
    }

    public LocalDate getFundacion() {
        return Fundacion;
    }

    public void setFundacion(LocalDate Fundacion) {
        this.Fundacion = Fundacion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Pais(String NombrePais, String Continente, LocalDate Fundacion, Ciudad ciudad) {
        this.NombrePais = NombrePais;
        this.Continente = Continente;
        this.Fundacion = Fundacion;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Pais{" + "Nombre del Pais=" + NombrePais + ", Continente=" + Continente + ", Fecha de fundacion=" + Fundacion + ", " + ciudad + '}';
    }

    public int fundacionPais()
    {    
      return  LocalDate.now().getYear() - this.Fundacion.getYear();    
    }


    
    
}
