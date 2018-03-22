/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Letras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String letra = "";

        System.out.print("Digite uma letra: ");
        letra = ler.next();

        boolean vogOUcons = false;

        switch (letra.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                vogOUcons = true;
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "x":
            case "w":
            case "y":
            case "z":
                vogOUcons = false;
                break;
            default:
                System.out.println("Inválido.");
                break;
        }
        if (vogOUcons) {
            System.out.println("Vogal.");
        } else {
            System.out.println("Consoante.");
        }
    }

}
