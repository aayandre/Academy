/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package lista5arrays;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex03 {

    public static void main(String[] args) {
        int[] vetor = new int[9];

        for (int i = 0; i < 9; i++) {
            vetor[i] = Lista5Arrays.geradorRandomInt(50 + i);//Deixei os randoms se repetindo-----------------------
            System.out.printf("Vetor[%d] = %d\n", i, vetor[i]);
            System.out.print("\033[H\033[2J");//Não funcionou no Terminal do NetBeans   ):

        }

        int maior = Lista5Arrays.arrayFindBiggestInt(vetor);

        System.out.println("\nO maior é: " + maior);
    }

}
