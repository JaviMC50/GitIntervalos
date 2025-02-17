/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intervalos;

/**
 *
 * @author javi
 */
public class Intervalos {
    
    //Obtiene el intervalo
    // return cadena indicando el intervalo

    public static void main(String[] args) {
        int a = 10;
        System.out.println("El intervalo es " + ObtenerIntervalo(a));
    }
    public static String ObtenerIntervalo (double k) {
        if (k <-4) {
            final String A = "Intervalo A";
            return A;
        }
        if ( k>= -4 && k <6) {
            return "Intervalo B";
        } else {
            return "Intervalo C";
        }
    }
    
}
