/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Dominio.Persona;
import java.lang.reflect.Array;

/**
 *
 * @author Alumno Mañana
 * 
 * SubClaseE empleado con :
 * num Seg Soc
 * y se va a modificar la clse persona para que sea final
 */

public class GestionEmpleados {
    
     public static int alea(int li, int ls){//función de JAVA
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }

     
   
        
    
      
    public static int contador=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Instanciación de empleados
      
      Integer tbBid[][] = new Integer[2][2];
        for(int i = 0 ; i < 2 ; i++){
            System.out.println("");
            for(int j = 0 ; j < 2 ; j++){
                tbBid[i][j]=alea(0,10);
                System.out.print(tbBid[i][j]+" ");
            }
        }
        System.out.println("\n\n");
      
      Persona p1 = new Persona("Helena","Jimenez");
      
      Persona p2 = new Persona("Augusto","Sanchez");
      Persona p3 = new Persona("Angustias","Sanabria");
      Persona p4 = new Persona("Laura","Saavedra");
      
      
        System.out.println(p1);
        System.out.println(p2);
        
        Persona tbPers[] = new Persona[3];
        
        tbPers[0]= p1;
        tbPers[1]= p2;
        
        
        
        
        Persona Bid [][] = {{p1,p2},{p3,p4}};
        
       imprMatriz(Bid);
       
       imprMatriz(tbBid);
    }
    
    //funcion que imprima tanto una matriz enteros como personas
    
    public static void imprMatriz(Object Mat[][]){
         for(int i = 0 ; i < Mat.length ; i++){
            System.out.println("");
            for(int j = 0 ; j < Mat[0].length ; j++){
                System.out.print(Mat[i][j]+" || ");
            }
        }
    }
    
}
