/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package lista4funcoes;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex01 {

    public static void main(String[] args) {

        //Entrada
        System.out.println("Escreva três números: ");

        //Processo
        System.out.print("1º número: ");
        int menor = MinhasFunc.entradaInt();

        for (int i = 2; i < 4; i++) {
            System.out.printf("%dº número: ", i);
            menor = MinhasFunc.retornaMenor(menor);
        }

        //Saída  
        System.out.printf("O menor número é: %d\n", menor);
    }

}
