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
public class CalculoSimples {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String l1, l2;
        double q1, v1, q2, v2, TOTAL;

        l1 = ler.nextLine();
        l2 = ler.nextLine();

        String[] d1 = l1.split(" ");
        q1 = Double.parseDouble(d1[1]);
        v1 = Double.parseDouble(d1[2]);

        String[] d2 = l2.split(" ");
        q2 = Double.parseDouble(d2[1]);
        v2 = Double.parseDouble(d2[2]);

        TOTAL = (q1 * v1) + (q2 * v2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", TOTAL);

    }

}
