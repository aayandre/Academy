/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarioplanocarreira;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class SalarioPlanoCarreira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int nivel;
        double salario = 0, granapHora = 0, horas;
        String nomeF = "";

        System.out.print("Nome: ");
        nomeF = ler.next();

        System.out.print("Horas trabalhadas: ");
        horas = ler.nextDouble();

        System.out.print("Nivel: ");
        nivel = ler.nextInt();

        switch (nivel) {
            case 1:
                granapHora = 15.00;
                salario = horas * granapHora;
                break;
            case 2:
                granapHora = 18.00;
                salario = horas * granapHora;
                break;
            case 3:
                granapHora = 22.00;
                salario = horas * granapHora;
                break;
            case 4:
                granapHora = 27.00;
                salario = horas * granapHora;
                break;
            case 5:
                granapHora = 33.00;
                salario = horas * granapHora;
                break;
            default:
                System.out.println("Nivel inválido.");               
                
        }
        System.out.printf("\nO funcionário %s trabalhou %.1f horas por R$%.2f (Nível %d) e deve receber R$%.2f\n", nomeF, horas, granapHora, nivel, salario);
    }

}
