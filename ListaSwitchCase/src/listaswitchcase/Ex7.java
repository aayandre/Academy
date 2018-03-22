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
public class Ex7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

//Variáveis
        int idade, consid;
        double tarifa;

//Entradas
        System.out.print("Sua idade: ");
        idade = ler.nextInt();

//Processos
        if (idade < 10) {
            consid = 1;
        } else if (idade >= 10 && idade <= 30) {
            consid = 2;
        } else if (idade >= 40 && idade <= 60) {
            consid = 3;
        } else /*if (idade > 60)*/ {
            consid = 4;
        } /*else {
            System.out.println("Idade inválida.");
        }*/

        switch (consid) {
            case 1:
                tarifa = 100 + 80;
                break;
            case 2:
                tarifa = 100 + 50;
                break;
            case 3:
                tarifa = 100 + 95;
                break;
            case 4:
                tarifa = 100 + 130;
                break;
            default:
                tarifa = 100;
                break;
        }

        System.out.printf("\nO valor do Plano de Saúde é de: R$%.2f\n", tarifa);
    }

}
