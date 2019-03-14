/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirflota;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class HundirFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Jugador> listaJugadores = new ArrayList<>();
       boolean salir = false;
        int opcion;
        while (!salir){
            System.out.println("Bienvenido al juego de Hundir la Flota");
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Definir los jugadores");
            System.out.println("2. Definir el tablero y colocar los barcos");
            System.out.println("3. Hundir barcos");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case(1):{
                    crearJugador();
                }
            }
    }
    
}
