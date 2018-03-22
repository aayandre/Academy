/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package doacaodesangue;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class DoacaoDeSangue {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String blood;        
               
        System.out.println("----Doação de Sangue----");
        
        //Entradas
        System.out.println("\nQual é o seu tipo de sangue?");
        blood = ler.nextLine();
        blood = blood.trim();
        
        switch (blood.toUpperCase()) {
            case "AB+":
                System.out.println("\nPode doar para: AB+");
                System.out.println("\nPode receber doação de: A+, B+, O+, AB+, A-, B-, O- e AB- (Todos).");
                break;
            case "AB-":
                System.out.println("\nPode doar para: AB+ e AB-.");
                System.out.println("\nPode receber doação de: A-, B-, O- e AB-.");
                break;
            case "O+":
                System.out.println("\nPode doar para: A+, B+, O+ e AB+.");
                System.out.println("\nPode receber doação de: O+ e O-.");
                break;
            case "O-":
                System.out.println("\nPode doar para: A+, B+, O+, AB+, A-, B-, O- e AB- (Todos).");
                System.out.println("\nPode receber doação de: O-.");
                break;
            default:
                System.out.println("\nEste tipo de sangue não é válido.\n(Os tipos válidos são: A+, B+, O+, AB+, A-, B-, O- e AB-");
        }
        
    }
        
}
