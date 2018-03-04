/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1;

import java.util.Scanner;

/**
 *
 * @author aayan
 */
public class Area {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double v1, v2, v3, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

        String oi = ler.nextLine();

        String[] valores = oi.split(" ");

        v1 = Double.parseDouble(valores[0]);
        v2 = Double.parseDouble(valores[1]);
        v3 = Double.parseDouble(valores[2]);

        TRIANGULO = (v1 * v3) / 2;
        CIRCULO = (3.14159 * Math.pow(v3, 2));
        TRAPEZIO = ((v1 + v2) * v3) / 2;
        QUADRADO = v2 * v2;
        RETANGULO = v1 * v2;

        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);

    }

}
