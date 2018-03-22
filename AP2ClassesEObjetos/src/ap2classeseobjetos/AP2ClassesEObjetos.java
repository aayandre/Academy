/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2classeseobjetos;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class AP2ClassesEObjetos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String entrada = "";

        while (!entrada.equalsIgnoreCase("sai")) {

            System.out.println("- - - Lampada - - -");
            System.out.println("Escolha apagar, acender ou mostrar.");
            entrada = ler.nextLine();

            Lampada lamp = new Lampada();

            if (entrada.equalsIgnoreCase("apagar")) {
                lamp.desligar();
            } else if (entrada.equalsIgnoreCase("acender")) {
                lamp.ligar();
            } else if (entrada.equalsIgnoreCase("mostrar")) {
                lamp.mostrarEstado();
            }

        }

    }

}
