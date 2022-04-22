/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio0103;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Adrian
 */

public class CiudadCantonPais
{
   public static void main(String[] args)
   {
       Canton canton = new Canton("Cuenca", 603269, 70.59);       
       Ciudad ciudad = new Ciudad("Azuay", 15, "Xavier Enderica", canton);       
       Pais pais = new Pais("Ecuador", "Ameica Latina",LocalDate.of(1822, 5, 24), ciudad);        
       System.out.println(pais);

       System.out.println("La densidad poblacional del canton " + canton.getNombreCanton() + " es: " + canton.densidadPoblacion() + " poblacion/km^2");
       System.out.println("El gobernador es: " + ciudad.gobernadorMayusculas());
       System.out.println(pais.getNombrePais() + " se fundo hace " + pais.fundacionPais() + " años");
       
   }
    
}
