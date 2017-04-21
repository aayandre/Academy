/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package listalaçorepetiçao;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex12 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("(1 / N) + (2 / (N - 1)) + (3 / (N - 2)) + ... + ((N - 1) / 2) + (N / 1) \nDigite N: ");
        int num = ler.nextInt();//--3--

        //Processo
        int soma = 0;
        for (int i = 0; i < num; i++) {
            int numerador = num - (num - (i + 1));
            int denominador = (num - i);
            
            soma = soma + (numerador / denominador);
        }
        
        //Saída
        System.out.println(soma);
    }

}
