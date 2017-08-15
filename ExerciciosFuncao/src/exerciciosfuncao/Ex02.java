/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosfuncao;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex02 {

    public static void main(String[] args) {

    }

    static Scanner ler = new Scanner(System.in);

    static int validarNumero(int numero) {

        int numFinal = numero;

        if (numFinal <= 0) {
            do {
                System.out.println("Digite um número > que 0: ");
                numFinal = ler.nextInt();

            } while (numFinal <= 0);
        }

        return numFinal;

    }

    static int somaEntreTodos(int m, int n) {
        
        
    }

}
