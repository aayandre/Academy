/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String tipo;
        double temperatura;

        System.out.print("Tipo: ");
        tipo = ler.next();
        System.out.print("Temperatura: ");
        temperatura = ler.nextDouble();

        boolean podetransportar = false;

        switch (tipo.toUpperCase()) {
            case "A":
                if (temperatura >= 10 && temperatura <= 17) {
                    podetransportar = true;
                } else {
                    podetransportar = false;
                }
                break;
            case "B":
                if (temperatura >= 11 && temperatura <= 16) {
                    podetransportar = true;
                } else {
                    podetransportar = false;
                }
                break;
            case "C":
                if (temperatura >= 12 && temperatura <= 15) {
                    podetransportar = true;
                } else {
                    podetransportar = false;
                }
                break;
            case "D":
                if (temperatura >= 13 && temperatura <= 14) {
                    podetransportar = true;
                } else {
                    podetransportar = false;
                }
                break;
            default:
                System.out.println("Informação inválida.");              

        }
        if (podetransportar) {
            System.out.println("Transporte em boas condições.");
        } else {
            System.out.println("Não transporte.");
        }
    }

}
