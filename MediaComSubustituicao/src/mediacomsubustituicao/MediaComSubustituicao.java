/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package mediacomsubustituicao;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class MediaComSubustituicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, media;
        int frequencM, frequenc;

        System.out.println("----Média----");

        //Entrada
        System.out.print("Quantidade de aulas(TOTAL): ");
        frequencM = ler.nextInt();
        System.out.print("Aulas participadas: ");
        frequenc = ler.nextInt();

        frequenc = (frequenc * 100) / frequencM;

        if (frequenc < 75) {
            System.out.println("Reprovado por faltas...\n");
        } else {
            
            System.out.print("Nota 1: ");
            nota1 = ler.nextDouble();
            System.out.print("Nota 2: ");
            nota2 = ler.nextDouble();

            //Processos
            media = (nota1 + nota2) / 2;

            if (media >= 6.0) {
                System.out.printf("\nPassou!!!\nMédia: %.1f\n", media);
            } else {
                //Média a partir da nota 3
                System.out.print("Nota 3: ");
                nota3 = ler.nextDouble();
                //Substituição da menor nota pela nota 3
                if (nota1 > nota2 && nota3 > nota2) {
                    nota2 = nota3;
                    media = (nota1 + nota2) / 2;
                } else if (nota2 > nota1 && nota3 > nota1) {
                    nota1 = nota3;
                    media = (nota1 + nota2) / 2;
                } else if (nota3 <= nota1 && nota3 <= nota2) {
                    System.out.printf("\nReprovado...\nMédia: %.1f\n", media);
                }

                if (media >= 6.0) {
                    System.out.println("Passou!!!\nMas sua média máxima obtida apartir da Prova3\nsó pode ser 6,0.\n");
                } else {
                    System.out.printf("\nReprovado...\nMédia: %.1f\n", media);
                }
            }
        }
    }
}
