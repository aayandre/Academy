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
public class Ex17 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        //Processo
        for (int i = 1; i <= num; i++) {
            boolean divisao = (num % i == 0);
            if (divisao) {
        //Saída
                System.out.print(i+" ");
            }
        }
    }

}
