/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package lista4funcoes;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex10 {

    public static void main(String[] args) {

        System.out.println("- - Categoria do Nadador - -");
        System.out.println("Idade?");
        int idade = MinhasFunc.entradaInt();

        String categoria = MinhasFunc.categoriaNadador(idade);

        System.out.printf("Categoria: %s\n", categoria);

    }

}
