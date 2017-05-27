/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package coisas;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Coisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double trem, bus, total;
        int dias;

        System.out.print("Trem: ");
        trem = ler.nextDouble();

        System.out.print("Bus: ");
        bus = ler.nextDouble();

        System.out.print("Dias: ");
        dias = ler.nextInt();
        
        total = ((trem + bus) * 2) * dias;
        
        System.out.println(total);
        

    }

}
