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
public class Ex03ProdutoAte1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Digite o número: ");
        int num = ler.nextInt();

        //Processo
        int produto = num;
        for (int i = 1; i < num; i++) {
            produto = produto * (num - (i));
        }
        
        //Saída
        System.out.println(produto);
    }

}
