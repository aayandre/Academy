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
public class Ex15 {

    public static void main(String[] args) {

        System.out.println("- - - Potência - - -");
        System.out.println("X^Z");

        //Entrada
        System.out.print("X = ");
        double x = MinhasFunc.entradaDb();
        System.out.print("Z = ");
        double z = MinhasFunc.entradaDb();

        //Processo
        double resultado = MinhasFunc.potencia(x, z);

        //Saída
        System.out.printf("%.0f ^ %.0f = %.1f\n", x, z, resultado);
    }

}
