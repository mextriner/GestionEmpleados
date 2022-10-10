/*
 * implementación de los métodos abstractos de IAccesoadatos
 */
package com.empresa.accesoadatos;

/**
 *
 * @author Alumno Mañana
 */
public class ImplMySql implements IAccesoadatos{

    @Override
    public void insertar() {
        System.out.println("insertar desde MySqul");
    }

    @Override
    public void leer() {
        System.out.println("leer desde MySqul");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde MySqul");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MySqul");
    }
    
}
