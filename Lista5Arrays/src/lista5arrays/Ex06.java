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
public class Ex06 {

    public static void main(String[] args) {

        //Array
        int[] vetor = Lista5Arrays.arrayMakerPrinterInt(2);

        //Produto dos elementos
        int produto = Lista5Arrays.arrayProdutoInt(vetor);

        //Saída
        System.out.printf("O produto é: %d\n", produto);
    }

}
