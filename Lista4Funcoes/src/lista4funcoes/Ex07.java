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
public class Ex07 {

    public static void main(String[] args) {

        System.out.println("----Calcular o volume----");
        System.out.println("Raio(cm)");
        double raio = MinhasFunc.entradaDb();

        double volume = MinhasFunc.volumePorRaio(raio);

        System.out.printf("O volume é: %.2fcm\n", volume);

    }

}
