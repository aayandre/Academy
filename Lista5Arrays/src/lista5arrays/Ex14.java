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
public class Ex14 {

    public static void main(String[] args) {

        //Cria 2 arrays
        int[] A = Lista5Arrays.arrayMakerPrinterInt(9);
        System.out.println("");
        int[] B = Lista5Arrays.arrayMakerPrinterInt(9);
        System.out.println("");

        //Une alternadamente
        int[] C = Lista5Arrays.arrayUnionAlternated(A, B);

        //Saída
        for (int i = 0; i < C.length; i++) {
            System.out.printf("Vetor[%d] = %d", i, C[i]);
            if (i % 2 == 0) {
                System.out.println("  <---- Vetor A\n");
            } else {
                System.out.println("  <---- Vetor B\n");
            }

        }
    }

}
