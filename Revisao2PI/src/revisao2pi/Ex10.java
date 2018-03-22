/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package revisao2pi;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex10 {

    public static void main(String[] args) {

        principal();

    }

    static void principal() {

        System.out.println("- - Soma de Matrizes - -");

        System.out.println("\nTamanho das matrizes?\nSe você digitar 10 serão duas matrizes de 10x10.\n");

        int tamanho = Funcoes.lerINT("Tamanho: ");

        int[][] matriz1 = criaMatriz(tamanho);
        int[][] matriz2 = criaMatriz(tamanho);

        mostraMatriz(matriz2);

        preencheESomaMatrizes(matriz1, matriz2);

    }

    static int[][] criaMatriz(int tamanho) {

        int[][] matriz = new int[tamanho][tamanho];

        return matriz;

    }

    static void mostraMatriz(int[][] matriz) {

        for (int[] matrizVetor : matriz) {
            for (int i = 0; i < matrizVetor.length; i++) {
                System.out.printf(" %3d ", matrizVetor[i]);
            }
            System.out.println("");
        }
    }

    static void preencheESomaMatrizes(int[][] matriz1, int[][] matriz2) {

        int[][] matrizResultado = new int[matriz1.length][matriz1.length];

        System.out.println("- - - - - - - - 1º Matriz - - - - - - - -");

        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                System.out.println("-----------------------------------------");
                System.out.printf("1º Matriz[%d][%d]: ", i, j);
                int userINT = validacaoUserIN();
                matriz1[i][j] = userINT;
            }
        }
        mostraMatriz(matriz1);

        System.out.println("\n\n- - - - - - - - 2º Matriz - - - - - - - -");

        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                System.out.println("-----------------------------------------");
                System.out.printf("2º Matriz[%d][%d]: ", i, j);
                int userINT = validacaoUserIN();
                matriz2[i][j] = userINT;
            }
        }
        mostraMatriz(matriz2);

        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado.length; j++) {
                matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\n\n- - - - - - - - Resultado - - - - - - - -");
        mostraMatriz(matrizResultado);
    }

    static int validacaoUserIN() {
        String userIN = Funcoes.lerTEXTOnext("");
        if (!userIN.matches("[0-9]+")) {
            while (!userIN.matches("[0-9]+")) {
                userIN = Funcoes.lerTEXTOnext("Digite um número: ");
            }
        }
        int userINT = Integer.valueOf(userIN);
        return userINT;
    }
}
