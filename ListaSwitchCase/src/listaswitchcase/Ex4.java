/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package listaswitchcase;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int dias, mes, ano;

        String nomeMes;

        System.out.println("----Dias de um Mês----");

        //Entradas
        System.out.print("Mês: ");
        mes = ler.nextInt();

        System.out.print("Ano: ");
        ano = ler.nextInt();

        //Processos e Saídas
        boolean bissexto = (ano % 4 == 0) || (ano % 400 == 0);//Consideração básica para saber se é bissexto

        switch (mes) {
            case 1:
                nomeMes = "Janeiro";
                dias = 31;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 2:
                nomeMes = "Fevereiro";
                if (bissexto) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 3:
                nomeMes = "Março";
                dias = 31;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 4:
                nomeMes = "Abril";
                dias = 30;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 5:
                nomeMes = "Maio";
                dias = 31;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 6:
                nomeMes = "Junho";
                dias = 30;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 7:
                nomeMes = "Julho";
                dias = 31;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 8:
                nomeMes = "Agosto";
                dias = 31;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 9:
                nomeMes = "Setembro";
                dias = 30;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 10:
                nomeMes = "Outubro";
                dias = 31;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 11:
                nomeMes = "Novembro";
                dias = 30;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;
            case 12:
                nomeMes = "Dezembro";
                dias = 31;
                System.out.printf("\nO %s, %d tem %d dias.\n", nomeMes, ano, dias);
                break;

        }
    }
}
