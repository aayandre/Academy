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
public class Ex08 {

    public static void main(String[] args) {

        //Procurado
        System.out.println("- - - - Procure um número no Array - - - -");
        System.out.print("Digite: ");
        int procurado = Lista5Arrays.entradaInt();
        
        //Cria array
        int[] vetor = Lista5Arrays.arrayMakerPrinterInt(9);
        
        //Procura o número digitado
        Lista5Arrays.arrayFindNumberInt(procurado, vetor);

    }

}
