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
public class Ex08 {

    public static void main(String[] args) {

        System.out.println("- - É primo? - -\nDigite um número inteiro e positivo.");
        int num = MinhasFunc.entradaInt();

        boolean numMenorZero = num <= 0;
        boolean resultado = MinhasFunc.primo(num);

        if (numMenorZero) {
            System.out.println("Valor Inválido.\nNúmero menor ou igual a zero.");
        } else if (resultado) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}
