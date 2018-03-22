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
public class Ex10 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
//Variáveis        
        double n1, n2, soma, sub, mult, div;
        String oper;

//Entradas
        System.out.print("Primeiro Número: ");
        n1 = ler.nextDouble();
        System.out.print("Segundo Número: ");
        n2 = ler.nextDouble();
        System.out.print("Operação ( + , - , * , /): ");
        oper = ler.next();
        
        oper = oper.trim();
//Processos e Saídas        
        switch (oper) {
            case "+":
                soma = n1 + n2;
                System.out.printf("\nSoma: %.2f\n", soma);
                break;
            case "-":
                sub = n1 - n2;
                System.out.printf("\nSubtração: %.2f\n", sub);
                break;
            case "*":
                mult = n1 * n2;
                System.out.printf("\nMultiplicação: %.2f\n", mult);
                break;
            case "/":
                div = n1 / n2;
                System.out.printf("\nDivisão: %.2f\n", div);
                break;
            default:
                System.out.println("\nOperação Inválida.\n");
        }

    }

}
