/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosfuncao;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class ExerciciosFuncao {

    static Scanner ler = new Scanner(System.in);

    static int lerInt(String texto) {
        System.out.println(texto);
        int x = ler.nextInt();
        return x;
    }
    
    static double lerDouble(String texto) {
        System.out.println(texto);
        double x = ler.nextDouble();
        return x;
    }

}
