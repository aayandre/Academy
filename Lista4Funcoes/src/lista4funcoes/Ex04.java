/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4funcoes;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex04 {

    public static void main(String[] args) {

        //Entrada
        System.out.print("Digite um número: ");
        int N = MinhasFunc.entradaInt();

        //Validando
        N = MinhasFunc.numeroPositivoValidacao(N);

        //Processo
        int produto = MinhasFunc.fatorial(N);//Fatorial

        int soma = MinhasFunc.somatoria(N);//Somatoria

        int divisao = produto / soma;

        //Saída
        System.out.println(divisao);
    }

}
