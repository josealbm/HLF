/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundirflota;

/**
 *
 * @author josea
 */
public class Tablero {
    private int tamaño;
    private String[][] casillas;

    public Tablero() {
    }

    public Tablero(String[][] casillas) {
        this.casillas = new String[tamaño][tamaño];
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[0].length; j++) {
                casillas[i][j] = " ";
            }
        }
    }

    public int getTamaño() {
       
        return tamaño;
    }

    public void setTamaño(int tamaño) {
         if (tamaño<5){
            System.out.println("El tablero debe tener los lados de mínimo"
                    + "cinco casillas, por favor, repite");
        }
        this.tamaño = tamaño;
    }

    public String[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(String[][] casillas) {
        this.casillas = casillas;
    }
    
    public static void imprimirTablero(String[][] casillas) {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas.length; j++) {
                casillas[i][j] = "[]";
                System.out.print(casillas[i][j]);

            }
            System.out.println();
        }
    }
    
}
