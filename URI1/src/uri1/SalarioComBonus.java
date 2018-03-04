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
public class SalarioComBonus {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String NOME;
        double SALARIOFIXO, VENDAS, TOTAL;

        NOME = ler.nextLine();
        SALARIOFIXO = ler.nextDouble();
        VENDAS = ler.nextDouble();

        TOTAL = SALARIOFIXO + (VENDAS * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);

    }

}
