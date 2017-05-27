/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package adivinha2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Adivinha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random srt = new Random();

        //Variáveis
        int sorteado, adivinha, x;

        sorteado = srt.nextInt(10) + 1;

        //Entrada
        System.out.print("Adivinhe um número de 1 a 10: ");
        adivinha = ler.nextInt();

        //Processamento
        if (sorteado == adivinha) {
            System.out.println("Você acertou!!!");
        } else {

            do {

                System.out.println("Você errou...\nTente novamente!");
                x = ler.nextInt();

                boolean certo = (sorteado == x);

                if (certo) {
                    System.out.println("Você acertou!!!");
                    break;
                }

            } while (sorteado != adivinha);
        }
    }//main
}//class
