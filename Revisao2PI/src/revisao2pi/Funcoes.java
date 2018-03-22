/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package revisao2pi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Funcoes {

    static Random aleatorio = new Random();

    static Scanner ler = new Scanner(System.in);

    static int lerINT(String texto) {
        System.out.print(texto);
        int x = ler.nextInt();
        return x;
    }

    static double lerDOUBLE(String texto) {
        System.out.print(texto);
        double x = ler.nextDouble();
        return x;
    }

    static String lerTEXTOnext(String titulo) {
        System.out.print(titulo);
        String x = ler.next();
        return x;
    }

    static String lerTEXTOnextLine(String titulo) {
        System.out.print(titulo);
        String x = ler.nextLine();
        return x;
    }

    static String lerOnlyTEXTO() {
        String x = ler.next();
        return x;
    }

    static void pulaLinhas(int x) {
        //Para sumir as coisas acima
        for (int i = 0; i < x; i++) {
            System.out.println("");
        }
    }

}
