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
public class Matricula {
    private int codigo;
    private int fechaExpedicion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Matricula{" + "codigo=" + codigo + ", fechaExpedicion=" + fechaExpedicion + ", fechaFabricacion=" + fechaFabricacion + '}';
    }





    public int getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(int fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    


    private int fechaFabricacion;
    
        public boolean estadoVencimiento(){
        var retorno=false;
        if(fechaExpedicion<=2022){
            retorno=true;
        }else{
            retorno=false;
        }

        return retorno;
    }
}
