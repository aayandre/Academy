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
public class Ex5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int mes;

        //Entradas
        System.out.print("Mês(número): ");
        mes = ler.nextInt();
//processos e saídas
        switch (mes) {
            case 12:
                System.out.println("Alta temporada.");
                break;
            case 1:
                System.out.println("Alta temporada.");
                break;
            case 2:
                System.out.println("Alta temporada.");
                break;
            case 6:
                System.out.println("Baixa temporada.");
                break;
            case 7:
                System.out.println("Baixa temporada.");
                break;
            default:
                if (mes == 3 || mes == 4 || mes == 5
                        || mes == 8 || mes == 9 || mes == 10 || mes == 11) {
                    System.out.println("Temporada normal");
                } else {
                    System.out.println("Número inválido.");
                }
        }
    }

}
