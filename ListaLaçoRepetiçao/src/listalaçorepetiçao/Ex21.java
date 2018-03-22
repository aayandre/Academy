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
public class Ex21 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o número perfeito... ou não: ");
        int num = ler.nextInt();

        //Processo
        int soma = 0;
        for (int i = 1; i < num; i++) {
            boolean divisor = (num % i == 0);
            if (divisor) {
                soma = soma + i;
            }

        }

        //Saída
        if (soma == num) {
            System.out.printf("Perfeito!\nA soma dos divisores inteiros(excluindo ele mesmo) é: %d\nQue é igual ao número digitado: %d\n", soma, num);
        } else {
            System.out.printf("Não é perfeito!\nA soma dos divisores inteiros(excluindo ele mesmo) é: %d\nQue é diferente do número digitado: %d\n", soma, num);
        }
    }

}
