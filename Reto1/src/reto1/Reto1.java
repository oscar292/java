/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author Tobar
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  jugador = 0;
        int level = 0;
        Scanner entrada = new Scanner(System.in);

     
        System.out.println("==BIENVENIDO A LA CARRERA NUMERICA==");
;
        

        do{
            System.out.print("Ingrese la cantidad de jugadores (2-4 jugadores): ");
            jugador = entrada.nextInt();
            if(jugador<=1 || jugador>4){
                System.out.println("===================================");
            System.out.println("Error solo se puede (2-4) jugadores\n");
                System.out.println("===================================");
            }
            
            
        }while(jugador<=1 || jugador >4);
        

        System.out.println("Numero de jugadores en la partida: " + jugador);
        System.out.println("===========================================");

        System.out.println("====Nivel de juego====\n"+"1. Nivel básico (Tablero de 20 posiciones)\n"+
                "2. Nivel intermedio (Tablero de 30 posiciones)\n"+"3. Nivel avanzado (Tablero de 50 posiciones)\n"); 
        System.out.println("===========================================");
        System.out.print("Ingrese el nivel del juego: ");
        level = entrada.nextInt();

       
        
        while (level < 1 || level > 3) {
            System.out.println("---Nivel incorrecto---");
            System.out.print("Ingrese el nivel de juego: ");
            level = entrada.nextInt();
        }

        lanzamiento p = new lanzamiento();

        switch (level) {
            case 1:
                p.proceso(20, jugador);
                System.out.println("====================");
                break;
            case 2:
                p.proceso(30, jugador);
                System.out.println("====================");
                break;
            default:
                p.proceso(50, jugador);
        }
    }
}
