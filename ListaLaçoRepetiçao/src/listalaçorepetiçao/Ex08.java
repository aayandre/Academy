/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package listalaçorepetiçao;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex08 {

    public static void main(String[] args) {

        //Variáveis
        int soma = 0, denominador = 0, fim;
        
        //Processo
        for (int i = 13; i < 73; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                soma = soma + i;
                denominador++;
            }
        }

        //Saída
        fim = soma / denominador;
        System.out.println(fim);
    }

}
