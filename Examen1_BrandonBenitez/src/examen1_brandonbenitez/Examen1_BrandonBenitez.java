/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_brandonbenitez;

import java.util.Scanner;

/**
 *
 * @author brhb2
 */
public class Examen1_BrandonBenitez {

    static Scanner rd = new Scanner(System.in);
    static Scanner rd1 = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean menu = true;

        do {

            System.out.print("""
                               == MENU ==
                               1. Ejercicio de palabras
                               2. Salir
                               Ingrese una opcion:  """);
            int opcion = rd.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese la primer palabra: ");
                    String cad1 = rd1.next();
                    System.out.print("Ingrese la segunda palabra: ");
                    String cad2 = rd1.next();
                    
                    System.out.println(miMetodo(cad1, cad2));

                    break;

                case 2:

                    menu = false;

                    break;

                default:
                    System.out.println("Opcion Invalida!!!");

            }

        } while (menu);

    }

    public static String miMetodo(String cad1, String cad2) {

        String temp = "";       

        if (cad1.equalsIgnoreCase(cad2)) {// If que valida que ambas cadenas sean igual ignorando las mayusculas
            
            temp = cad1;
            
            for (int i = cad2.length()-1; i >= 0; i--) {// For que invierte mi cadena
                
                char x = cad2.charAt(i);// Capturo los caracteres de la cadena desde el final de la cadena
                
                temp += x;
                
            }

        } else if(cad1 != cad2 && cad1.length() == cad2.length()){// If que valida que las cadenas sean diferentes en caracteres pero de igual tamaño
            
            for (int i = 0; i < cad1.length(); i++) {// For de la primer cadena
                
                char a = cad1.charAt(i); // Capturo el primer caracter de la primer cadena
 
                for (int j = i; j == i; j++) { // For de la segunda cadena
                    
                    char b = cad2.charAt(j); // Capturo el primer caracter de la segunda cadena
                    
                    temp += "" + a + b;
                    
                }
                
            }
            
        } else if(cad1 != cad2 && cad1.length() != cad2.length()){ // If que valida que las cadenas sean diferentes en caracteres y tamaños
            
            temp += cad1 + cad2;
            
        }

        return temp;
    }

}
