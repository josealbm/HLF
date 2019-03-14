/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirflota;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Jugador {
    private String nombre;
    private Tablero tablero;
    private Tablero tablero_rival;

    public Jugador() {
    }

    public Jugador(String nombre, Tablero tablero, Tablero tablero_rival) {
        this.nombre = nombre;
        this.tablero = tablero;
        this.tablero_rival = tablero_rival;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Tablero getTablero_rival() {
        return tablero_rival;
    }

    public void setTablero_rival(Tablero tablero_rival) {
        this.tablero_rival = tablero_rival;
    }
    
    public Jugador crearJugador(){
        Scanner sc = new Scanner(System.in);
        Jugador jug = new Jugador();
        System.out.println("Dime tu nombre");
        setNombre(sc.nextLine());
        return jug;
        }
    
}
