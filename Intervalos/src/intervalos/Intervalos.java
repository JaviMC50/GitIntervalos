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

    public static void main(String[] args) {
        int a = 10;
        System.out.println("El intervalo es " + ObtenerCategoria(a));
    }
    public static String ObtenerCategoria (int a) {
        if (a <-4) {
            final String A = "Intervalo A";
            return A;
        }
        if ( a>= -4 && a <6) {
            return "Intervalo B";
        } else {
            return "Intervalo C";
        }
    }
    
}
