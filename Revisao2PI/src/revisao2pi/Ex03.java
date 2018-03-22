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
public class Ex03 {

    public static void main(String[] args) {

        int numero = Funcoes.lerINT("Digite um número");

        //Valida o número(>=10 ou <0 não pode)
        numero = validarNumero(numero);

        //Escreve em extenso
        escreverExtenso(numero);

    }

    static int validarNumero(int numero) {
        int numeroFinal = numero;

        if (numeroFinal >= 10 || numeroFinal < 0) {
            System.out.println("Erro");

            //Repetição para entrada ser a correta
            do {
                numeroFinal = Funcoes.lerINT("Digite um número");
            } while (numeroFinal >= 10 || numeroFinal < 0);

        }

        return numeroFinal;
    }

    static void escreverExtenso(int numero) {
        switch (numero) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SETE");
                break;
            case 8:
                System.out.println("OITO");
                break;
            case 9:
                System.out.println("NOVE");
                break;
            default:
                System.out.println("Erro");
                break;
        }

    }

}
