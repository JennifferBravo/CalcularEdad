/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.practica5;

import java.util.Scanner;

public class Practica5 {

    public static void main(String[] args) {
        
        Scanner e=new Scanner (System.in);
                
        System.out.println("Ingrese la edad:");
        
        int edad = e.nextInt();
        
        if (edad >= 0 && edad < 120){
            
            //categoriza a la persona
            
            if (edad >=0 && edad<=12){
                System.out.println("Eres un niño");
            }else if (edad>=13 && edad<=35){
                System.out.println("Eres joven");
            }else {
                System.out.println("Eres adulto.");
                    }
        }else {
                            System.out.println("Error");
                            }
        
    }
}
