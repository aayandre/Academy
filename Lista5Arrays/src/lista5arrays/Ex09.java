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
public class Ex09 {

    public static void main(String[] args) {

        //Criar 2 arrays
        int[] A = Lista5Arrays.arrayJustMakerInt(9);
        int[] B = Lista5Arrays.arrayJustMakerInt(9);

        //Multiplicar os elementos
        int[] C = Lista5Arrays.arrayMultiplierByElementInt(A, B);

        //Saída
        for (int i = 0; i < C.length; i++) {
            System.out.printf("Vetor A[%d] = %d   ***   Vetor B[%d] = %d  ===  Vetor C[%d] = %d\n", i, A[i], i, B[i], i, C[i]);
        }
    }

}
