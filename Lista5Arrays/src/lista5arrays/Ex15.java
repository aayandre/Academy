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
public class Ex15 {

    public static void main(String[] args) {

        //Cria array
        int[] vetor = Lista5Arrays.arrayMakerPrinterInt(9);

        //Vetor coordenador
        boolean[] coordenador = new boolean[vetor.length];

        //Preenche o vetor
        for (int i = 0; i < coordenador.length; i++) {
            coordenador[i] = true;
        }

        //Imprime na ordem crescente
        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (menor > vetor[i]) {
                menor = vetor[i];
                if (coordenador[i]) {
                    
                }
            }
        }
    }

}
