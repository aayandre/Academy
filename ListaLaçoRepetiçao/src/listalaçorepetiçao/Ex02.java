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
public class Ex02 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        //Variáveis
        int soma = 0, clienteNum, base = 0;
        
        //Entrada
        System.out.print("Digite um número: ");
        clienteNum = ler.nextInt();
        
        //Processamento
        while(base <= clienteNum) {
            soma = soma + base;
            base++;            
        }
        //Saída
        System.out.println(soma);
    }
    
}
