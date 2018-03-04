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
public class Salario {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int NUMBER, HORAS;
        double SALARY, PORHORAS;

        NUMBER = ler.nextInt();
        HORAS = ler.nextInt();
        PORHORAS = ler.nextDouble();

        SALARY = PORHORAS * HORAS;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", NUMBER, SALARY);
        
    }

}
