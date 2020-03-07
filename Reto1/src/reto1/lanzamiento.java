/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

/**
 *
 * @author Tobar
 */
class lanzamiento {

    int acum = 0, acum1 = 0, acum2 = 0, acum3 = 0, acum4 = 0;
    int i = 0;
    int j = 0;
    int g = 0;
    int dado1 = (int) Math.floor(Math.random() * 6 + 1);
    int dado2 = (int) Math.floor(Math.random() * 6 + 1);
    int basic;
    int pocisiones = 0;

    public void proceso(int l, int q) {

        do {
              j = i + 1;
            dado1 = (int) Math.floor(Math.random() * 6 + 1);
            dado2 = (int) Math.floor(Math.random() * 6 + 1);
           
            pocisiones = dado1 + dado2;
            System.out.println("Jugador " + (i + 1) + " sus numero son: " + dado1 + " ," + dado2 + " avanza " + pocisiones + " pocisiones");
            acum = acum + (dado1 + dado2);

            while (dado1 == dado2) {

                g = g + 1;
                
                if (g == 3) {
                    System.out.println("¡¡¡Felicidades el jugador " + (i + 1) + " ganó al sacar tres pares seguidos!!!");
                    System.exit(0);
                }
                
                dado1 = (int) Math.floor(Math.random() * 6 + 1);
                dado2 = (int) Math.floor(Math.random() * 6 + 1);
                pocisiones = dado1 + dado2;
                System.out.println("Jugador " + (i + 1) + " sus numero son: " + dado1 + " ," + dado2+" avanza "+pocisiones+"pocisiones");
                acum = acum + (dado1 + dado2);

            }

            g = 0;

            if (j == 1) {

                acum1 = acum1 + acum;
                basic = acum1;
            } else if (j == 2) {

                acum2 = acum2 + acum;
                basic = acum2;
            } else if (j == 3) {

                acum3 = acum3 + acum;
                basic = acum3;

            } else if (j == 4) {

                acum4 = acum4 + acum;
                basic = acum4;
            }

            i = i + 1;
            acum = 0;

            if (i == q) {
                i = 0;

            }
            System.out.println("\n-------Siguiente jugador-----");
        }
          while (basic < l);

        if (acum1 > l) {

            System.out.println("El ganador es el jugador 1");
        } else if (acum2 > l) {
            System.out.println("El ganador es el jugador 2");
        } else if (acum3 > l) {
            
            System.out.println("El ganador es el jugador 3");
        } else {
            System.out.println("El ganador es el jugador 4");
        }
        }     
}

