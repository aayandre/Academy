/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package listaswitchcase;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex3 {

    public static void main(String[] args) {
        //Variáveis e Entrada
        Scanner ler = new Scanner(System.in);

        double valorUser;
        int valorInteiro, n100 = 0, n50 = 0, n10 = 0, n5 = 0, n1 = 0, proces = 0,
                resto100 = 0, resto50 = 0, resto10 = 0, resto5 = 0, resto1 = 0;

        System.out.println("----Dinheiro----");

        System.out.print("Digite um valor: ");
        valorUser = ler.nextDouble();
        valorInteiro = (int) valorUser;//transforma double em int.

        //Checa se o valor é maior, menor ou igual as notas e cria um processo para utlizar o switch
        if (valorInteiro >= 100) {
            proces = 100;
        } else if (valorInteiro >= 50 && valorInteiro < 100) {
            proces = 50;
        } else if (valorInteiro >= 10 && valorInteiro < 50) {
            proces = 10;
        } else if (valorInteiro >= 5 && valorInteiro < 10) {
            proces = 5;
        } else if (valorInteiro >= 1 && valorInteiro < 5) {
            proces = 1;
        } else {
            System.out.println("Inválido.");
        }
//Switch usando o processo obtido anteriormente
        switch (proces) {
            case 100:
                resto100 = valorInteiro % 100;
                n100 = valorInteiro / 100;
                resto50 = resto100 % 50;
                n50 = resto100 / 50;
                resto10 = resto50 % 10;
                n10 = resto50 / 10;
                resto5 = resto10 % 5;
                n5 = resto10 / 5;
                resto1 = resto5 % 1;
                n1 = resto5 / 1;
                break;
            case 50:
                resto50 = valorInteiro % 50;
                n50 = valorInteiro / 50;
                resto10 = resto50 % 10;
                n10 = resto50 / 10;
                resto5 = resto10 % 5;
                n5 = resto10 / 5;
                resto1 = resto5 % 1;
                n1 = resto5 / 1;
                break;
            case 10:
                resto10 = valorInteiro % 10;
                n10 = valorInteiro / 10;
                resto5 = resto10 % 5;
                n5 = resto10 / 5;
                resto1 = resto5 % 1;
                n1 = resto5 / 1;
                break;
            case 5:
                resto5 = valorInteiro % 5;
                n5 = valorInteiro / 5;
                resto1 = resto5 % 1;
                n1 = resto5 / 1;
                break;
            case 1:
                resto1 = valorInteiro % 1;
                n1 = valorInteiro / 1;
                break;
            default:
                break;

        }
//Saída, mostrando apenas as notas que forem usadas, nenhuma vai sair como ZERO        
        if (n100 != 0) {
            System.out.printf("%d nota(s) de R$100\n", n100);
            if (n50 != 0) {
                System.out.printf("%d nota(s) de R$50\n", n50);
            }
            if (n10 != 0) {
                System.out.printf("%d nota(s) de R$10\n", n10);
            }
            if (n5 != 0) {
                System.out.printf("%d nota(s) de R$5\n", n5);
            }
            if (n1 != 0) {
                System.out.printf("%d nota(s) de R$1\n", n1);
            }
        } else if (n50 != 0) {
            System.out.printf("%d nota(s) de R$50\n", n50);
            if (n10 != 0) {
                System.out.printf("%d nota(s) de R$10\n", n10);
            }
            if (n5 != 0) {
                System.out.printf("%d nota(s) de R$5\n", n5);
            }
            if (n1 != 0) {
                System.out.printf("%d nota(s) de R$1\n", n1);
            }
        } else if (n10 != 0) {
            System.out.printf("%d nota(s) de R$10\n", n10);
            if (n5 != 0) {
                System.out.printf("%d nota(s) de R$5\n", n5);
            }
            if (n1 != 0) {
                System.out.printf("%d nota(s) de R$1\n", n1);
            }
        } else if (n5 != 0) {
            System.out.printf("%d nota(s) de R$5\n", n5);
            if (n1 != 0) {
                System.out.printf("%d nota(s) de R$1\n", n1);
            }
        } else if (n1 != 0) {
            System.out.printf("%d nota(s) de R$1\n", n1);
        } else {
            System.out.println("Inválido.\n");
        }

    }

}
