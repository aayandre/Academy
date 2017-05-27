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
public class Ex02 {

    public static void main(String[] args) {

        System.out.print("Digite um número: ");
        int num = MinhasFunc.entradaInt();

        //Validação
        num = MinhasFunc.numeroPositivoValidacao(num);

        //Processo
        num = MinhasFunc.somatoria(num);

        //Saída
        System.out.println(num);
    }

}
