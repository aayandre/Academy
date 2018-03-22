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

    //M é menor que N
    public static void main(String[] args) {

        System.out.println("Soma entre M e N e intervalos\n");

        //Entradas
        int m = ExerciciosFuncao.lerInt("Digite o valor de M");

        m = validarNumero(m);//Verifica se é maior que 0

        int n = ExerciciosFuncao.lerInt("Digite o valor de N");

        n = validarNumero(n);//Verifica se é maior que 0

        //Soma entre todos
        somaEntreTodos(m, n);
    }

    static int validarNumero(int numero) {

        int numFinal = numero;

        if (numFinal <= 0) {
            do {
                numFinal = ExerciciosFuncao.lerInt("Digite um número > que 0: ");
            } while (numFinal <= 0);
        }

        return numFinal;

    }

    static void somaEntreTodos(int m, int n) {
        int resultado = m;

        for (int i = m; i < n; i++) {
            resultado += (i + 1);
        }

        System.out.println(resultado);

    }

}
