/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.accesoadatos;

/**
 *
 * @author Alumno Mañana
 */
public class ImplMongo implements IAccesoadatos{
     @Override
    public void insertar() {
        System.out.println("insertar desde Mongo");
    }

    @Override
    public void leer() {
        System.out.println("leer desde Mongo");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde Mongo");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde Mongo");
    }
    
}
