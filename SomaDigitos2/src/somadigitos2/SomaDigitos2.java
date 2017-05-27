/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package somadigitos2;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class SomaDigitos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Variáveis
        String numero;

        int soma = 0, digito, tamanhoNum, multipli;

        //Entrada
        System.out.print("Digite um número: ");
        numero = ler.next();

        //Processamento
        tamanhoNum = numero.length();
        multipli = tamanhoNum;

        for (int i = 0; i < tamanhoNum; i++) {

            digito = Integer.parseInt(numero.substring(i, i + 1));

            soma = soma + (digito * multipli);
            
            multipli--;
        }
        
        //Saída
        System.out.println(soma);
    }

}
