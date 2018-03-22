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
public class Ex18 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        //Processo
        int n1 = 0, n2 = 1;
        int resultado = (n1 + n2);

        if (num < 46) {
            for (int i = 0; i < num; i++) {
                System.out.print(n1+" ");//Saída
                n1 = n2;
                n2 = resultado;
                resultado = n1 + n2;
            }
            System.out.print("...\n");
        } else {
            System.out.println("Número maior que 46.");
        }
    }

}
