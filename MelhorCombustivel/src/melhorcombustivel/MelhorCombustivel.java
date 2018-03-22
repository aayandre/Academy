/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package melhorcombustivel;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class MelhorCombustivel {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Variáveis
        double gasoKmL, alcoKmL, gasoP, alcoP, kmL;

        //Entrada
        System.out.println("----Melhor Combustível----");

        System.out.println("\nQuantos Km/L(quilômetros por litro) o seu carro faz com Gasolina?");
        gasoKmL = ler.nextDouble();

        System.out.println("\nE com Álcool?");
        alcoKmL = ler.nextDouble();

        System.out.println("Qual é o preço da Gasolina?");
        gasoP = ler.nextDouble();

        System.out.println("Qual é o preço do Álcool?");
        alcoP = ler.nextDouble();

        //Processos
        double gasoT = (gasoKmL / gasoP);

        double alcoT = (alcoKmL / alcoP);

        if (gasoT < alcoT) {
            System.out.printf("\nUtilize Álcool para abastecer seu carro.\nPois a cada R$1,00 o seu carro anda:\n\nÁlcool: %.2fkm\nGasolina: %.2fkm\n", alcoT, gasoT);
        } else if (gasoT > alcoT) {
            System.out.printf("\nUtilize Gasolina para abastecer seu carro.\nPois a cada R$1,00 o seu carro anda:\n\nÁlcool: %.2fkm\nGasolina: %.2fkm\n", alcoT, gasoT);
        } else {
            System.out.println("Os preços são iguais. Utilize qualquer combustível.");
        }

    }

}
