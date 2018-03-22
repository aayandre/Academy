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
public class Ex04 {

    public static void main(String[] args) {

        //Array
        double[] vetor = Lista5Arrays.arrayMakerPrinterDouble(9);

        //Procura o menor
        double menor = Lista5Arrays.arrayFindLittlestDouble(vetor);

        //Saída
        System.out.printf("O menor é: %.2f\n", menor);
    }

}
