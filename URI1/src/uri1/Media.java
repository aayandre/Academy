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
public class Media {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        double MEDIA, n1, n2, n3;
        
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();
        
        MEDIA = ((n1*2) + (n2*3) + (n3*5)) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }

}
