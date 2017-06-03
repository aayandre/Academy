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
public class Ex12 {

    public static void main(String[] args) {

        //Cria 2 arrays(tipos não especificados)
        double[] A = Lista5Arrays.arrayJustMakerDouble(9);
        double[] B = Lista5Arrays.arrayJustMakerDouble(9);

        //Soma e Média de cada um
        System.out.println("- - - Média A - - -");
        double mediaA = Lista5Arrays.arrayMediaDouble(A);//Já imprime a soma
        System.out.println("");

        System.out.println("- - - Média B - - -");
        double mediaB = Lista5Arrays.arrayMediaDouble(B);
        System.out.println("");

        double somaA = mediaA * A.length;//Usarei para ver qual é maior...
        double somaB = mediaB * B.length;

        //Saída
        if (somaA > somaB) {
            System.out.printf("A maior soma é de A: %.2f\n", somaA);
        } else {
            System.out.printf("A maior soma é de B: %.2f\n", somaB);
        }

        if (mediaA < mediaB) {
            System.out.printf("A menor média é de A: %.2f\n", mediaA);
        } else {
            System.out.printf("A menor média é de B: %.2f\n", mediaA);
        }

    }

}
