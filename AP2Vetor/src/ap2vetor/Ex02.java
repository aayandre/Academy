/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2vetor;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex02 {

    public static void main(String[] args) {

        //Criar vetor 
        int[] vetor = ArrayTools.arrayMaded();

        //Mostra vetor
        ArrayTools.arrayPrinter(vetor);

        //Encontra e mostra menor número do array
        findMinimunValueArray(vetor);

    }

    static void findMinimunValueArray(int[] vetor) {
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] < menor) {
                menor = vetor[i];
            }

        }

        System.out.println("\nO menor número é: " + menor);

    }
}
