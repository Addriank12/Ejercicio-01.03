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
public class Auto {
    private String color;
    private int yearFabricacion;
    private  String modelo;
    private Propietario propietario;
    private int precio;
    private String placa;
    private Matricula matricula;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(int yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Auto{" + "El auto es de color " + color + ", fabricado en " + yearFabricacion + ", modelo " + modelo + ", pertenece a: " + propietario + ", tiene un costo de " + precio + ", de placa " + placa + ", " + matricula + '}';
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    public boolean esTaxi(){
        var retorno = false;
        
        if(this.color=="amarillo"){
            retorno=true;
        }
        
        return retorno;
        
    }
    public int obtenerImpuestos(){
        var retorno= 1000000;
        if(this.precio> 0 && this.precio< 1000){
            retorno= 0;
            
        }else{
            if(this.precio>=1001 && this.precio <=10000){
                retorno= 100;
            }else{
                    if(this.precio >= 10001 && this.precio <= 25000 ){
                        retorno= 250;
                    }else{
                        retorno= 370;
                    }
            }
        }
        return retorno;
    }
    public int obtenerAntiguedad(int currentYear){
        var retorno=1000;
        retorno=currentYear-this.yearFabricacion;
        return retorno;
    }
}
