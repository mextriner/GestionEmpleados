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
public interface IAccesoadatos {
    int MAX_REGISTRO = 10;
    
    void insertar();
    void leer();
    void actualizar();
    void eliminar();
    
}
