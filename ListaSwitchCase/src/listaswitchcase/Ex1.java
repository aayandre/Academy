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
public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n1, resto;
        
        System.out.println("----Divisível----");
        
        System.out.print("Digite um número: ");
        n1 = ler.nextInt();
        
        resto = n1 % 3;
        
        switch(resto) {
            case 0:
                System.out.printf("\nO número %d é divisil por 3.\n", n1);
                break;
            default:
                System.out.printf("\nO número %d NÃO é divisível por 3.\n", n1);
                break;
                
        }
    }
    
}
