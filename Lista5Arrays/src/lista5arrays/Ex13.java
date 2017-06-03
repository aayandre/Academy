/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista5arrays;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex13 {

    public static void main(String[] args) {

        //Cria 2 vetores
        int[] A = Lista5Arrays.arrayJustMakerInt(9);
        int[] B = Lista5Arrays.arrayJustMakerInt(9);

        //Une vetor
        int[] C = Lista5Arrays.arrayUnion(A, B);

        //Imprime
        for (int i = 0; i < C.length; i++) {
            System.out.printf("Vetor[%d] = %d\n", i, C[i]);
        }
    }

}
