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
public class Ex01 {

    public static void main(String[] args) {

        //Entrada de decimal
        double decimalUser = Funcoes.lerDOUBLE("Digite um número");
        
        verificarMaiorQue50(decimalUser);
    }

    static void verificarMaiorQue50(double numero) {
        if (numero >= 50.0) {
            System.out.println("SUCESSO");
        } else {
            System.out.println("ERRO");
        }
        System.out.println("FIM DO PROGRAMA");
    }

}
