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
public class Esfera {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double RAIO, VOLUME;

        RAIO = ler.nextDouble();

        VOLUME = ((4 / 3.0) * 3.14159 * Math.pow(RAIO, 3));

        System.out.printf("VOLUME = %.3f\n", VOLUME);
    }

}
