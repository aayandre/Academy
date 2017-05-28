/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Exe2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Temperatura em graus Celsius: ");
        double celsius = ler.nextDouble();

        //Processo
        double fare = ((9.0 / 5.0) * celsius + 32);

        //Saída
        if (fare > 95) {
            System.out.printf("Fahrenheit: %.1f\nTemperatura muito alta.\n", fare);
        } else if (fare <= 95 && fare >= 80) {
            System.out.printf("Fahrenheit: %.1f\nTemperatura alta.\n", fare);
        } else if (fare <= 79 && fare >= 65) {
            System.out.printf("Fahrenheit: %.1f\nTemperatura amena.\n", fare);
        } else {
            System.out.printf("Fahrenheit: %.1f\nTemperatura baixa.\n", fare);
        }

    }
}
