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
public class Ex03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Variáveis
        int num, maior = 0;

        //Entrada
        System.out.print("Digite 10 números: ");

        //Processo
        for (int i = 0; i < 10; i++) {
            num = ler.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        //Saída
        System.out.println(maior);
    }

}
