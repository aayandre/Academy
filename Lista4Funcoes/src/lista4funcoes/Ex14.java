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
public class Ex14 {

    public static void main(String[] args) {
        System.out.println("- - Soma de A até N - -");

        //Entrada
        System.out.print("A = ");
        int A = MinhasFunc.entradaInt();

        System.out.print("\nN = ");
        int N = MinhasFunc.entradaInt();

        //Processo
        int resultado = MinhasFunc.somaDeAaN(A, N);

        //Saída
        System.out.printf("O resultado é: %d\n", resultado);
    }

}
