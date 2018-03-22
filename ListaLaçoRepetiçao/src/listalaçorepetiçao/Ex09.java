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
public class Ex09 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Quantidade de alunos: ");
        int alunos = ler.nextInt();

        //Processo
        int denominador = 0, posi = 1;
        double nota, media, soma = 0;

        while (alunos > 0) {
            System.out.printf("%dº nota: ", posi);
            nota = ler.nextDouble();

            soma = nota + soma;
            denominador++;
            posi++;
            alunos--;
        }
        media = soma / denominador;

        //Saída        
        System.out.printf("\nMédia: %.2f\n", media);

    }

}
