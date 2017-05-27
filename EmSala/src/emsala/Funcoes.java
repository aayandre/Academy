/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsala;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Funcoes {

    public static Scanner ler = new Scanner(System.in);

    public static int entradaInt() {

        int x = ler.nextInt();
        return x;
    }

    public static double entradaDouble() {
        double x = ler.nextDouble();
        return x;
    }

    public static int tamanhoDoVetor() {

        System.out.print("Tamanho do vetor: ");
        int tamanho = entradaInt();
        return tamanho;
    }

    public static int[] criaVetor(int tamanho) {

        int vetor[] = new int[tamanho];
        return vetor;
    }

    public static int[] preencheVetor(int tamanho) {

        int vetor[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%dº número: ", i + 1);
            vetor[i] = entradaInt();
        }

        return vetor;
    }

    public static void imprimeVetor(int vetor[]) {

        int soma = 0;
        int menor = vetor[0];
        int maior = vetor[0];
        //Procura o maior e o menor e soma
        for (int i = 0; i < vetor.length; i++) {

            soma += vetor[i];

            if (vetor[i] > maior) {
                maior = vetor[i];
            } else if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        //Imprime o vetor
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Vetor[%d]: %d", i, vetor[i]);

            if (vetor[i] == menor) {
                System.out.print("  <--- Menor");
            } else if (vetor[i] == maior) {
                System.out.print("  <--- Maior");
            }
            //Pula linha
            System.out.println("");
        }

        System.out.printf("Soma: %d\n", soma);
    }

    public static int[] copiaVetor(int vetor[]) {

        int[] vetorCopia = new int[vetor.length];

        //Existe uma função do netbeans para copiar um array
        //System.arraycopy(vetor, 0, vetorCopia, 0, vetor.length);        
        for (int i = 0; i < vetor.length; i++) {
            vetorCopia[i] = vetor[i];
        }

        return vetorCopia;
    }

    public static int[] somaVetor(int vetor[], int vetor2[]) {

        int vetor3[] = new int[vetor.length];

        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor[i] + vetor2[i];
        }
        return vetor3;
    }

    public static int[] uneVetor(int vetor[], int vetor3[]) {

        int vetor4[] = new int[vetor.length + vetor3.length];

        for (int i = 0; i < vetor4.length; i++) {
            if (i < vetor.length) {
                vetor4[i] = vetor[i];
            } else if (i >= vetor.length) {
                vetor4[i] = vetor3[i - vetor.length];
            }

        }
        return vetor4;
    }

}
