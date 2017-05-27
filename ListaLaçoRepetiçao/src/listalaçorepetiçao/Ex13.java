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
public class Ex13 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Digite um número: ");
        int num = ler.nextInt();

        //Processo
        
          //Variáveis
        double resultado = 0;
        
        for (double i = 0; i < num; i++) {
        double numerador = 1;
        double denominador = 1;
            numerador *= (i + 1);
            denominador *= (2 * (i + 1)) - 1;
            resultado += (numerador / denominador);
        }
                
        //Saída
        System.out.println(resultado);
    }

}
