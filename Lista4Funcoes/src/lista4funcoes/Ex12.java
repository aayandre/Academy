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
public class Ex12 {

    public static void main(String[] args) {

        System.out.println("- - Gênero - -");

        //Entrada
        System.out.print("(M)asculino - - (F)eminino: ");
        String sexo = MinhasFunc.entradaTXT();

        System.out.print("Altura: ");
        double altura = MinhasFunc.entradaDb();

        //Processo
        double resultado = MinhasFunc.alturaPesoIdeal(altura, sexo);

        //Saída
        System.out.printf("Peso ideal é: %.2fKg\n", resultado);
    }

}
