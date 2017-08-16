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

    static int lerINT() {
        System.out.println("Digite um número");
        int x = ler.nextInt();
        return x;
    }

    static double lerDOUBLE() {
        System.out.println("Digite um número");
        double x = ler.nextDouble();
        return x;
    }

    static String lerTEXTOnext(String titulo) {
        System.out.println(titulo);
        String x = ler.next();
        return x;
    }

    static String lerTEXTOnextLine(String titulo) {
        System.out.println(titulo);
        String x = ler.nextLine();
        return x;
    }

}
