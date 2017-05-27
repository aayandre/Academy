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
public class Ex6 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
//Variável        
        int dia;
        
//Entradas
        System.out.print("Dia da Semana: ");
        dia = ler.nextInt();
//Processos e Saídas        
        switch (dia) {
            case 1:
            case 7:    
                System.out.println("Final de Semana.");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de Semana.");
            default:
                System.out.println("Inválido.\nDigite um número de 1 a 7.");
        }
    }
    
}
