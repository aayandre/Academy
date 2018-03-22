/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package listalaçorepetiçao;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex20 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Saldo Inicial: ");
        double saldo = ler.nextDouble();

        //Processo
        int operacao;
        double deposito, saque;

        do {
            System.out.printf("\nOk.\nSeu saldo é de R$%.2f\n", saldo);
            System.out.print("Escolha a operação desejada\n( 1 para Depósito; 2 para Saque; 3 para Concluir ou Sair)\nOperação: ");
            operacao = ler.nextInt();
        //Depósito----------------------------------------------
            if (operacao == 1) {                
                System.out.print("Depósito\nValor: R$");
                deposito = ler.nextDouble();
                saldo += deposito;
        //Saque-------------------------------------------------
            } else if (operacao == 2) {                
                System.out.print("Saque\nValor: R$");
                saque = ler.nextDouble();
                saldo -= saque;
        //Nenhum------------------------------------------------
            } else if (operacao > 3 || operacao < 0) {                
                System.out.println("Operação Invalida...");
            }
        } while ((operacao < 3) && (operacao > 0));

        //Conclusão do processo e Saída-------------------------
        System.out.printf("Saldo Final: R$%.2f\n", saldo);
        if (saldo == 0) {
            System.out.println("CONTA ZERADA");
        } else if (saldo < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }
    }

}
