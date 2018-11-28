/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccalle.controlador;

import java.util.Scanner;

/**
 *
 * @author LAB4-PC7
 */
public class Coordinador {
    public static void showMenu(){
        int exit=0;
        do {        
            System.out.println("Bienvenidos a Netflix Viewed");
            System.out.println("Selecciona una Opcion: "
                + "1.-Books\n" 
                + "2.-Magazine\n" 
                + "3.-Movies\n"
                + "4.-Series\n"
                + "--------------"    
                + "5.-Report\n" 
                + "6.-Report Today\n" 
                + "0.-Exit");
            //leer la respuesta del usuario
            Scanner input = new Scanner(System.in);
            int response = input.nextInt();
            switch(response){
                case 0: 
                    //salir
                    break;
                case 1:
                    showBooks();
                    break;
                case 2:
                    showMagazine();
                    break;
                case 3:
                    showMovies();
                    break;   
                case 4:
                    showSeries();
                    break;
                case 5:
                    break;
                case 6:
                    break;    
                default:
                    System.out.println("");
                    System.out.println("Selecciona una Opcion: ");
                    System.out.println("");
            }
            
            
        } while (exit !=0);
    } 
    
    private static void showMovies (){
        int exit =0;
        do {    
            System.out.println("");
            System.out.println("--MOVIES--");
            System.out.println("");
        } while (exit !=0);
    }
    
    private static void showSeries (){
        int exit =0;
        do {    
            System.out.println("");
            System.out.println("--SERIES--");
            System.out.println("");
        } while (exit !=0);
    }
    
    private static void showChapter (){
        int exit =0;
        do {    
            System.out.println("");
            System.out.println("--CHAPTERS--");
            System.out.println("");
        } while (exit !=0);
    }
    private static void showBooks (){
        int exit =0;
        do {    
            System.out.println("");
            System.out.println("--BOOKS--");
            System.out.println("");
        } while (exit !=0);
    }
    
    private static void showMagazine (){
        int exit =0;
        do {    
            System.out.println("");
            System.out.println("--MAGAZINES--");
            System.out.println("");
        } while (exit !=0);
    }
    
    
}
