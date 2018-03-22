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
public class Ex07 {

    public static void main(String[] args) {

        //Array
        int[] vetor = Lista5Arrays.arrayMakerPrinterInt(9);

        //Pede um número para multiplicar cada elemento
        System.out.print("Multiplicador: ");
        int num = Lista5Arrays.entradaInt();

        //Multiplication on each one and print it
        Lista5Arrays.arrayMultiplicationOnEachElement(num, vetor);
    }

}
