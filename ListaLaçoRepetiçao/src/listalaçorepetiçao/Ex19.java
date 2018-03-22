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
public class Ex19 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada
        System.out.print("Senha: ");
        String senha = ler.next();

        //Processo e Saídas
        boolean valido = senha.equalsIgnoreCase("2002");
        if (valido) {
            System.out.println("Acesso Permitido");
        } else {
            while (!valido) {
                System.out.print("Senha Invalida.\nSenha: ");
                senha = ler.next();
                if (senha.equalsIgnoreCase("2002")) {
                    System.out.println("Acesso Permitido");
                    break;
                }
            }
        }
    }

}
