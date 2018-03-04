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
public class Diferenca {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int DIFERENCA, A, B, C, D;

        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();

        DIFERENCA = ((A * B) - (C * D));

        System.out.println("DIFERENCA = " + DIFERENCA);

    }

}
