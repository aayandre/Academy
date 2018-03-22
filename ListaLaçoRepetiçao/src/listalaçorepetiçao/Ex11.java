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
public class Ex11 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("S = 1 - 1/2 + 1/3 - 1/4 + 1/5 - ... + 1/N \n\nDigite um número para substituir N: ");
        int num = ler.nextInt();

        //Processo
        double resultado = 1;
        for (double i = 1; i < num; i++) {
            if (i % 2 == 0) {
                resultado = resultado + (1 / (i + 1));
            } else {
                resultado = resultado - (1 / (i + 1));
            }
        }
        
        //Saída
        System.out.println(resultado);

    }

}
