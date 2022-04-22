/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio0103;

/**
 *
 * @author juansinmiedo
 */
public class AutoMatriculaPropietario {
        public static void main(String [] args){
            var matricula = new Matricula();
            matricula.setCodigo(101020);
            matricula.setFechaExpedicion(2021);

            var propietario = new Propietario();
            propietario.setNombre("Juan Guaman");
            propietario.setCedula(0105206);
            propietario.setCiudad("Cuenca");
            propietario.setFechaNacimiento(1997);
                      
            var auto = new Auto();
            auto.setColor("Amarillo");
            auto.setModelo("Chevrolet");
            auto.setMatricula(matricula);
            auto.setPlaca("LBP0235");
            auto.setPropietario(propietario);
            auto.setYearFabricacion(2005);
            auto.setPrecio(3000);
            
            System.out.println(auto);
            

            System.out.println("El propietario tiene: "+propietario.calcularEdad(2022)+" de edad");
            System.out.println("El auto tiene: " + auto.obtenerAntiguedad(2022) + " de antiguedad");
            System.out.println("El auto debe pagar: "+auto.obtenerImpuestos()+ " de tasa solidaria");            
            System.out.println("El auto es taxi?: " + auto.esTaxi());
            System.out.println("Tiene matricula vencida?: " + matricula.estadoVencimiento());

            
            
            
            
            
            
      

    }
}
