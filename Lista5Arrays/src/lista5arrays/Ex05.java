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
public class Ex05 {

    public static void main(String[] args) {

        //Array
        int[] vetor = Lista5Arrays.arrayMakerPrinterInt(9);

        //Média
        int media = Lista5Arrays.arrayMediaInt(vetor);

        //Saída
        System.out.printf("A média é: %d\n", media);
    }

}
