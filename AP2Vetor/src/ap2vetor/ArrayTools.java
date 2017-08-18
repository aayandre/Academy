/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2vetor;

import java.util.Random;

/**
 *
 * @author andre.ayamamoto
 */
public class ArrayTools {

    static Random aleatorio = new Random();

    static int[] arrayMaded() {

        int[] vetor = {5, 8, 9, 1, -3, 2, 7};

        return vetor;

    }

    static int[] arrayMaker(int tamanho) {

        int[] vetor = new int[tamanho];

        return vetor;
    }

    static int[] arrayInsert(int[] vetor, int limite) {

        for (int i = 0; i < vetor.length; i++) {

            //Roda o vetor e insere valores na posição [i]
            vetor[i] = aleatorio.nextInt(limite) + 1;

        }

        return vetor;

    }

    static void arrayPrinter(int[] vetor) {

        System.out.print("{");
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf(" %d", vetor[i]);
            if (i == vetor.length - 1) {
                //Não coloca vírgula
            } else {
                System.out.print(",\t");
            }
        }
        System.out.print(" }\n");
    }
    
    

}
