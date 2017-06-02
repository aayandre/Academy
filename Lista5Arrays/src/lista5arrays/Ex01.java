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
public class Ex01 {

    public static void main(String[] args) {

        int[] vetor = new int[9];
        for (int i = 0; i < 9; i++) {
            vetor[i] = i + 1;
            System.out.printf("Vetor[%d] = %d\n", i, vetor[i]);
        }
    }

}
