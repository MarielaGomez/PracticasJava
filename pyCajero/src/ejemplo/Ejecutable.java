/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author Maru Gomez
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // definir variables 
        int billetes1000, billetes500, billetes200, billetes100, dinero;
        int resto1000, resto500;
        // inicalizar si hace falta 
        //billetes1000 = billetes500 = billetes200 = billetes100 = 0;

        // entrada
        System.out.println("ingrese una cantidad de dinero multiplo de 100");
        dinero = entrada.nextInt();

        //proceso
        billetes1000 = dinero / 1000;
        resto1000 = dinero % 1000;

        billetes500 = resto1000 / 500;
        resto500 = resto1000 & 500;

        billetes200 = resto500 / 200;
        billetes100 = (resto500 % 200) / 100;
        //salida 
        System.out.println("Total de billetes de 1000" + billetes1000);
        System.out.println("Total de billetes de 500" + billetes500);
        System.out.println("Total de billetes de 200" + billetes200);
        System.out.println("Total de billetes de 100" + billetes100);

    }

}
