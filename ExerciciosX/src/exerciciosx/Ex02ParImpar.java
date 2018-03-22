/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package exerciciosx;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex02ParImpar {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        //Processo
        int par = 1, impar = 1;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                par = par * i;
            } else {
                impar = impar * i;
            }
        }
        //Saída
        System.out.printf("\nPar: %d\nImpar: %d\n", par, impar);
    }
}
