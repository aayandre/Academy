/*
 * 
 * 
 * 
 */
package exerciciosfuncao;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex01 {

    public static void main(String[] args) {

        System.out.println("Par ou Impar?");

        //Entrada
        int numero = ExerciciosFuncao.lerInt("Digite um número");

        //Verifica se o número é par ou impar
        boolean parOuImpar = testarSeParOuImpar(numero);

        //Imprime na tela o resultado
        mostrarParOuImpar(parOuImpar);

    }

    static boolean testarSeParOuImpar(int numero) {

        boolean parOuImpar = false;

        if (numero % 2 == 0) {
            parOuImpar = true;
        }

        return parOuImpar;
    }

    static void mostrarParOuImpar(boolean resultadoFinal) {
        if (resultadoFinal) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

}
