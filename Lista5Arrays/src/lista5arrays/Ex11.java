/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package lista5arrays;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex11 {

    public static void main(String[] args) {

        //Array
        double[] vetor = Lista5Arrays.arrayMakerPrinterDouble(9);

        //Tira média
        double media = Lista5Arrays.arrayMediaDouble(vetor);
        System.out.printf("\nMédia = %.2f\n\n", media);

        //Saída
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0 & vetor[i] > media) {//Maiores que a média e em posições pares
                System.out.printf("Vetor[%d] = %.2f\n", i, vetor[i]);
            }
        }

    }

}
