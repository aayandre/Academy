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
public class Ex10 {

    public static void main(String[] args) {

        //Criar 2 arrays
        double[] A = Lista5Arrays.arrayJustMakerDouble(9);
        double[] B = Lista5Arrays.arrayJustMakerDouble(9);

        //Multiplicar os elementos
        double[] C = Lista5Arrays.arrayMultiplierByElementOnlyInOddDouble(A, B);

        //Saída
        for (int i = 0; i < C.length; i++) {
            System.out.printf("Vetor A[%d] = %.2f\nVetor B[%d] = %.2f\n\n***Vetor C[%d] = %.2f\n\n", i, A[i], i, B[i], i, C[i]);
        }
    }
}
