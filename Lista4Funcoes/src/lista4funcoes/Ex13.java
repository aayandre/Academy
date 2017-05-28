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
public class Ex13 {

    public static void main(String[] args) {

        System.out.println("- - Mostra o número de divisores - -");

        //Entrada        
        System.out.print("Digite: ");
        int numero = MinhasFunc.entradaInt();

        //Validação
        numero = MinhasFunc.numeroPositivoValidacao(numero);

        //Processo
        int resultado = MinhasFunc.numeroDeDivisores(numero);

        //Saída
        System.out.printf("O número de divisores é: %d\n", resultado);

    }

}
