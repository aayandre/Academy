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
public class Ex06 {

    public static void main(String[] args) {

        System.out.println("---Bháskara---");
        System.out.println("ax² + bx + c");

        System.out.println("Valor de a:");
        double a = MinhasFunc.entradaInt();

        System.out.println("Valor de b:");
        double b = MinhasFunc.entradaInt();

        System.out.println("Valor de c:");
        double c = MinhasFunc.entradaInt();

        System.out.println("Escolha:\nRaiz Maior(1) ou Raiz Menor(2)");
        int escolha = MinhasFunc.entradaInt();
        
        while (escolha != 1 && escolha != 2) {
            System.out.println("Escolha Inválida\nRaiz Maior(1) ou Raiz Menor(2)");
            escolha = MinhasFunc.entradaInt();
        }

        double resultado = MinhasFunc.bhaskaraComEscolha(a, b, c, escolha);

        if (escolha == 1) {
            System.out.printf("----Resultado----\na = %.1fx² b = %.1fx c = %.1f\nA maior raiz(1) é: %.2f\n", a, b, c, resultado);
        } else {
            System.out.printf("----Resultado----\na = %.1fx² b = %.1fx c = %.1f\nA menor raiz(2) é: %.2f\n", a, b, c, resultado);
        }
    }

}
