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
public class Ex15 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Digite um número: ");
        int num = ler.nextInt();
        
        //Processo
        double multiplica = 1;
        if (num > 0) {
            for (double i = 0; i < num; i++) {
                multiplica = multiplica * (num - i);
            }//for
            
        //Saída
            System.out.println(multiplica);
        }/*if*/ else {
            System.out.println("Número menor ou igual a ZERO.");            
        }//else

    }

}
