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
public class Ex16 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Digite quantos números você usará: ");
        int quantidade = ler.nextInt();

        System.out.println("Agora digite esses números: ");

        //Processo        
        do {
            int num = ler.nextInt();
            String parchek;
            String positivochek;

            boolean par = (num % 2 == 0);//testando os boolean, pra aprender
            if (par) {
                parchek = "Par";
            } else {
                parchek = "Impar";
            }

            boolean positivo = (num > 0);
            if (positivo) {
                positivochek = "Positivo";
            } else {
                positivochek = "Negativo";
            }

        //Saída
            boolean zero = (num == 0);
            if (zero) {
                System.out.println("NULO");
            } else {
                System.out.printf("O %d é %s e %s.\n", num, parchek, positivochek);
            }
            quantidade--;

        } while (quantidade > 0);

    }

}
