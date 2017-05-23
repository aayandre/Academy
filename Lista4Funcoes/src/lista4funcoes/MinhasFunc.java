/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4funcoes;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class MinhasFunc {

    public static Scanner ler = new Scanner(System.in);

    public static int entradaInt() {

        System.out.print("Digite:");
        int x = ler.nextInt();
        return x;

    }

    public static double entradaDb() {

        System.out.print("Digite:");
        double x = ler.nextDouble();
        return x;

    }

    public static int somatoria(int N) {

        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        return soma;
    }

    public static int fatorial(int n) {

        int multiplica = 1;
        for (int i = 1; i <= n; i++) {
            multiplica *= i;
        }
        return multiplica;
    }

    public static int numeroPositivoValidacao(int num, Scanner ler) {

        while (num < 0) {
            System.out.print("Digite um número maior que 0: ");
            num = ler.nextInt();
        }
        return num;
    }

    public static double bhaskara(double a, double b, double c) {

        double primeiraParte, segundaParte, raiz1, raiz2;

        primeiraParte = (Math.pow(-b, 2)) - (4 * a * c);
        segundaParte = Math.sqrt(primeiraParte);
        if (primeiraParte < 0) {
            return -1;
        } else {
            raiz1 = (-b + (segundaParte)) / (2 * a);
            raiz2 = (-b - (segundaParte)) / (2 * a);
            if (raiz1 > raiz2) {
                return raiz1;
            } else {
                return raiz2;
            }
        }

    }

    public static double bhaskaraComEscolha(double a, double b, double c, int escolha) {

        double primeiraParte, segundaParte, raiz1, raiz2;

        primeiraParte = (Math.pow(-b, 2)) - (4 * a * c);
        segundaParte = Math.sqrt(primeiraParte);
        raiz1 = (-b + (segundaParte)) / (2 * a);
        raiz2 = (-b - (segundaParte)) / (2 * a);

        if (primeiraParte < 0) {
            System.out.println("\n\nO Delta deu negativo.");
            return -1;
        } else {
            switch (escolha) {
                case 1:
                    if (raiz1 > raiz2) {
                        return raiz1;
                    } else {
                        return raiz2;
                    }
                case 2:
                    if (raiz1 < raiz2) {
                        return raiz1;
                    } else {
                        return raiz2;
                    }
                default:
                    return 0;
            }//Fim do switch
        }
    }

    public static double volumePorRaio(double raio) {

        double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        return volume;

    }

    public static boolean primo(int num) {

        int testeprimo = 0;
        boolean ehprimo;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                testeprimo++;
            }
        }
        ehprimo = (testeprimo == 2);
        return ehprimo;

    }

    public static int idadeEmDias(int anoAtual, int anos, int meses, int dias) {

        for (int i = 0; i < anos; i++) {
            int anoValidacao = anoAtual - i;
            if (bissexto(anoValidacao)) {
                dias += 366;
            } else {
                dias += 365;
            }
        }

        dias += meses * 31;

        //Complexidade não foi o caminho, mas daria pra usar
//        for (int i = 0; i < meses; i++) {
//            int mesValidacao = meses - i;
//            switch (mesValidacao) {
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12:
//                    dias += 31;
//                    break;
//                case 4: case 6: case 9: case 11:
//                    dias += 30;
//                    break;
//                case 2:
//                    if (bissexto(anoAtual)) {
//                        dias += 29;
//                        break;
//                    } else {
//                        dias += 28;
//                        break;
//                    }
//            }
//        }
        return dias;

    }

    public static boolean bissexto(int ano) {
        boolean isBissexto = ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)));
        return isBissexto;
    }

    public static String categoriaNadador(int idade) {

        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18) {
            return "Adulto";
        } else {
            return "Abaixo de 5 anos.";
        }
    }

}
