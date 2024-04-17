/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Scanner sc = new Scanner(System.in);

        Calculadora Calc1 = new Calculadora("Casio", "Dpcs1", "SN56654");
        Calculadora Calc2 = new Calculadora();

        Calc1.suma(3, 6);
        Calc1.suma(3.0, 6.0);

        Calc2.resta(800, 300);
        
        Calc1.resta(100, 50);
    }

}
