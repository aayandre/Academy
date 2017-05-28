/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Exe1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Valor inicial: ");
        int num1 = ler.nextInt();

        System.out.print("Valor final: ");
        int num2 = ler.nextInt();

        //Processo
        int contagem, impares = 0, multiploSete = 0, divisiveisporTresQuatro = 0;

        if (num2 < num1) {//Checagem de valor final
            System.out.println("VALORE INVÁLIDOS");
        } else {

            contagem = num1;
            while (contagem <= num2) {

                if (contagem % 2 != 0) {//Impares
                    impares++;
                }

                if (contagem / 7 == 0) {//Multiplos de Sete
                    multiploSete++;
                }

                if ((contagem / 3 == 0) && (contagem / 4 == 0)) {//Divisiveis por 3 e 4
                    divisiveisporTresQuatro++;
                }
                contagem++;//Continuação da contagem
            }
            //Saída
            System.out.printf("Quantidade de números ímpares: %d\nQuantidade de números múltiplos de sete: %d\nQuantidade de números divisíveis por três e por quatro, ao mesmo tempo: %d\n", impares, multiploSete, divisiveisporTresQuatro);

        }
    }

}
