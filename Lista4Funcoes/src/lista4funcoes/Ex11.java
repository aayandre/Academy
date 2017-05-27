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
public class Ex11 {

    public static void main(String[] args) {

        System.out.print("Nota: ");
        float nota = MinhasFunc.entradaFloat();

        String resultado = MinhasFunc.conceitoNota(nota);

        System.out.println("Conceito: " + resultado);

    }

}
