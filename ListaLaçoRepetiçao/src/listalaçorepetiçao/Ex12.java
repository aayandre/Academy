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
        int num = ler.nextInt();

        //Processo
        double soma = 0;
        for (double i = 0; i < num; i++) {
            double numerador = (i + 1);
            double denominador = (num - i);
            
            soma += (numerador / denominador);
        }
        
        //Saída
        System.out.println(soma);
    }

}
