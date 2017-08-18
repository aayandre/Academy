/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2vetor;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex01 {

    public static void main(String[] args) {

        //Cria vetor
        int[] vetor = ArrayTools.arrayMaker(10);

        //Insere dados no vetor
        vetor = ArrayTools.arrayInsert(vetor, 60);

        //Mostra o vetor
        ArrayTools.arrayPrinter(vetor);

        //Substitui os números pares por 0 e impares por 1
        vetor = substituiParEImpares(vetor);

        //Mostra o vetor com as substituições
        ArrayTools.arrayPrinter(vetor);
    }

    static int[] substituiParEImpares(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {
                vetor[i] = 0;
            } else {
                vetor[i] = 1;
            }

        }

        return vetor;

    }

}
