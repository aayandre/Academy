/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosfuncao;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex03 {

    public static void main(String[] args) {

        System.out.println("Potência????\n");

        //Entrada
        int numero = ExerciciosFuncao.lerInt("Digite um número");
        numero = validarNumero(numero);//Validação

        //Cálculo
        fazerPotenciaPorSomas(numero);
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

    static void fazerPotenciaPorSomas(int numero) {
        int quadrado = 0, impares = 1;

        for (int i = 0; i < numero; i++) {
            quadrado += impares;
            impares += 2;
        }

        System.out.println(quadrado);
    }

}
