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
public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int dia;
        
        System.out.println("----Dia da Semana----");
        
        System.out.print("Digite um dia(número): ");
        dia = ler.nextInt();
        
        switch(dia) {
            case (1):
            case (8):
            case (15):
            case (22):
            case (29):
                System.out.printf("\nDomingo %d\n", dia);
                break;
            case (2):
            case (9):
            case (16):
            case (23):
            case (30):   
                System.out.printf("\nSegunda %d\n", dia);
                break;
            case (3):
            case (10):
            case (17):
            case (24):              
                System.out.printf("\nTerça %d\n", dia);
                break;
            case (4):
            case (11):
            case (18):
            case (25):              
                System.out.printf("\nQuarta %d\n", dia);
                break; 
            case (5):
            case (12):
            case (19):
            case (26):              
                System.out.printf("\nQuinta %d\n", dia);
                break;
            case (6):
            case (13):
            case (20):
            case (27):              
                System.out.printf("\nSexta %d\n", dia);
                break;  
            case (7):
            case (14):
            case (21):
            case (28):              
                System.out.printf("\nSábado %d\n", dia);
                break;    
        }
    }
    
}
