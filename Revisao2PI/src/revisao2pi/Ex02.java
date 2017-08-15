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
public class Ex02 {

    public static void main(String[] args) {

        String numeroUser = Funcoes.lerTEXTOnext("Digite um número");

        //Resultado validado
        int isNumber = verificarNumero(numeroUser);

        //Verifica se é par ou impar
        verificarParOuImpar(isNumber);

        //Verificar se é primo
        verificarPrimo(isNumber);
    }

    static int verificarNumero(String numero) {
        //Remove os espaços
        numero = numero.trim();

        boolean isNumber = numero.matches("[0-9]+");

        //Valida para a certeza de que são apenas números
        if (!isNumber) {
            //Repetição
            do {
                numero = Funcoes.lerTEXTOnext("Digite um número");
            } while (!numero.matches("[0-9]+"));

            //Retorno
            int numeroParaInt = Integer.parseInt(numero);
            return numeroParaInt;

        } else {
            int numeroParaInt = Integer.parseInt(numero);
            return numeroParaInt;
        }
    }

    static void verificarParOuImpar(int isNumber) {
        boolean verificacao = isNumber % 2 == 0;

        if (verificacao) {
            System.out.printf("%d é par.\n", isNumber);
        } else {
            System.out.printf("%d é impar.\n", isNumber);
        }

    }

    static void verificarPrimo(int isNumber) {
        boolean ehPrimo = false;

        for (int i = 2; i < isNumber; i++) {
            if (isNumber % i != 0) {
                ehPrimo = true;
            } else {
                ehPrimo = false;
                break;
            }
        }

        if (isNumber == 2 || ehPrimo) {
            System.out.println("É primo.");
        } else if (ehPrimo == false) {
            System.out.println("Não é primo.");
        }
    }

}
