/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package exerciciosx;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex01Menor {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        //Entrada
        System.out.print("Digite qunatos números você digitará: ");
        int quanti = ler.nextInt();
        
        //Processo
        int menor = 1000;
        for (int i = quanti; i > 0; i--) {
            System.out.print("Digite um número:");
            int num = ler.nextInt();
            if (menor > num) {
                menor = num;
            }
        }
        System.out.printf("\nO menor é %d.\n",menor);
    }
    
}
