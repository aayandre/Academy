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
public class Ex9 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

//Variáveis        
        int soma1, resto1, sub1, soma2, resto2, sub2, cpfinte, part1n, part2n, part3n, fimn,
                dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9, dig10, dig11;

        String cpftext, test, part1, part2, part3, fim, proces = "";

//Entrada
        System.out.print("C.P.F: ");
        cpftext = ler.nextLine();
        cpftext = cpftext.replaceAll("[\\D+]", "");

//Dividir o CPF em 4 partes
        part1 = cpftext.substring(0, 3);
        part1n = Integer.parseInt(part1);//String para Int

        part2 = cpftext.substring(3, 6);
        part2n = Integer.parseInt(part2);//String para Int

        part3 = cpftext.substring(6, 9);
        part3n = Integer.parseInt(part3);//String para Int

        fim = cpftext.substring(9);
        fimn = Integer.parseInt(fim);//String para Int

//Digitos
        dig1 = Integer.parseInt(Integer.toString(part1n).substring(0, 1));
        dig2 = Integer.parseInt(Integer.toString(part1n).substring(1, 2));
        dig3 = Integer.parseInt(Integer.toString(part1n).substring(2, 3));
        dig4 = Integer.parseInt(Integer.toString(part2n).substring(0, 1));
        dig5 = Integer.parseInt(Integer.toString(part2n).substring(1, 2));
        dig6 = Integer.parseInt(Integer.toString(part2n).substring(2, 3));
        dig7 = Integer.parseInt(Integer.toString(part3n).substring(0, 1));
        dig8 = Integer.parseInt(Integer.toString(part3n).substring(1, 2));
        dig9 = Integer.parseInt(Integer.toString(part3n).substring(2, 3));
        dig10 = Integer.parseInt(Integer.toString(fimn).substring(0, 1));
        dig11 = Integer.parseInt(Integer.toString(fimn).substring(1));
//Processos
        soma1 = (dig1 * 10) + (dig2 * 9) + (dig3 * 8) + (dig4 * 7) + (dig5 * 6) + (dig6 * 5) + (dig7 * 4) + (dig8 * 3) + (dig9 * 2);
        resto1 = 11 - (soma1 % 11);

//Primeira Condição
        if (resto1 < 10 && resto1 == dig10) {
//Segunda Condição             
            soma2 = (dig1 * 11) + (dig2 * 10) + (dig3 * 9) + (dig4 * 8) + (dig5 * 7) + (dig6 * 6) + (dig7 * 5) + (dig8 * 4) + (dig9 * 3) + (dig10 * 2);
            resto2 = 11 - (soma2 % 11);
            if (resto2 < 10 && resto2 == dig11) {
                proces = "ok";
            } else if (resto2 == 0) {
                proces = "ok";
            } else if (resto1 == 0) {
//Segunda Condição               
                soma2 = (dig1 * 11) + (dig2 * 10) + (dig3 * 9) + (dig4 * 8) + (dig5 * 7) + (dig6 * 6) + (dig7 * 5) + (dig8 * 4) + (dig9 * 3) + (dig10 * 2);
                resto2 = 11 - (soma2 % 11);
                if (resto2 < 10 && resto2 == dig11) {
                    proces = "ok";
                } else if (resto2 == 0) {
                    proces = "ok";
                }
            }
        } else {
            proces = "nope";
        }
        
//Saídas com switch, de acordo com o proces         
        switch (proces) {
            case "ok":
                System.out.println("C.P.F Válido!!!");
                break;
            case "nope":
                System.out.println("C.P.F Inválido!!!");
                break;
            default:
                break;
        }
// Acredito que não seja esse o uso correto do Switch nesse algoritmo, pois não foi nada muito impactante no processo principal da validação do CPF. Mas foi o que eu consegui.        
    }
}
