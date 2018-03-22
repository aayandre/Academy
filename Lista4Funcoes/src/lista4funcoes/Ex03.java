/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4funcoes;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex03 {

    public static void main(String[] args) {


        //Entrada
        System.out.print("Digite um número: ");
        int num = MinhasFunc.entradaInt();

        //Validação
        num = MinhasFunc.numeroPositivoValidacao(num);

        //Processo
        int resultado = MinhasFunc.fatorial(num);

        //Saída        
        System.out.printf("O fatorial de %d é %d.\n", num, resultado);
    }

}
