/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2pi;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex06 {

    public static void main(String[] args) {

        printTabelaCompleta();

    }

    public static void printTabelaCompleta() {
        for (int i = 0; i < 10; i++) {

            printFirstColuna(i);

            for (int j = 1; j < 10; j++) {

                printLines(i, j);

            }

        }
    }

    public static void printLines(int i, int j) {
        if (i == 0) {
            //Primeira linha----------------------
            if (j == 9) {
                System.out.printf("%d\t\n", j);
                System.out.println("--------------------------------------------------------------------------");
            } else {
                System.out.printf("%d\t", j);
            }
        } else if (j == 9) {
            //Ultimo dígito da linha--------------
            System.out.printf("%d\t\n", j * i);

        } else {
            //Padrão normal-----------------------
            System.out.printf("%d\t", j * i);
        }
    }

    public static void printFirstColuna(int i) {
        //Primeiros dígitos da primeira coluna
        if (i == 0) {
            System.out.print(" * |\t");
        } else {
            System.out.printf(" %d |\t", i);
        }
    }

}
