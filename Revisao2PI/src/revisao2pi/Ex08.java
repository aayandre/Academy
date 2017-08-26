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
public class Ex08 {

    public static void main(String[] args) {

        int tamanhoDoVetor = Funcoes.lerINT("Quantos números?\n");

        int[] vetor = criaVetorComNUmeros(tamanhoDoVetor);

        findBiggestNumberInArray(vetor);

    }

    static int[] criaVetorComNUmeros(int quantidadeDeNumeros) {

        int[] numerosUser = new int[quantidadeDeNumeros];

        System.out.println("Digite o(s) número(s): ");
        for (int i = 0; i < numerosUser.length; i++) {

            numerosUser[i] = Funcoes.lerINT("");

        }

        return numerosUser;

    }

    static void findBiggestNumberInArray(int[] vetor) {

        int posicao = 0;
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (maior < vetor[i]) {
                maior = vetor[i];
                posicao = i + 1;
            }

        }

        System.out.printf("O maior número digitado foi %d na rodada %d.\n", maior, posicao);

    }

}
