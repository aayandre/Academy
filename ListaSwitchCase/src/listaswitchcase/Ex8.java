/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package listaswitchcase;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

//Variáveis
        double ano, multa, tarifa;
        int mes;

//Entradas
        System.out.print("Mês em que pagará ou foi paga a multa: ");
        mes = ler.nextInt();
        System.out.print("Valor da anuidade: ");
        tarifa = ler.nextDouble();
        ano = tarifa;
//Processos e saídas        
        switch (mes) {
            case 1:
                System.out.printf("\nValor normal: R$%.2f\n", tarifa);
                break;
            case 2:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 3:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 4:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 5:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 6:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 7:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 8:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 9:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 10:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 11:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            case 12:
                tarifa = tarifa * Math.pow((1 + 0.05), (mes - 1));
                System.out.printf("A anuidade é de R$%.2f\nCom a multa é: R$%.2f\n", ano, tarifa);
                break;
            default:
                System.out.println("Mês inválido.");
                break;
        }

    }

}
