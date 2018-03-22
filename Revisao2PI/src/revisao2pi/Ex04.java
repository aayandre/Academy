/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2pi;

/**
 *
 * @author andre.ayamamoto
 */
public class Ex04 {

    public static void main(String[] args) {

        System.out.println("Média");
        System.out.println("Notas:");

        //Entrada
        double somaDasNotas = lerNotas();

        //Calculo da média
        calcularMedia(somaDasNotas);
    }

    static double lerNotas() {
        double resultado = 0;

        for (int i = 0; i < 5; i++) {
            double nota = Funcoes.lerDOUBLE("Digite um número");
            resultado += nota;
        }
        return resultado;
    }

    static void calcularMedia(double notas) {
        double resultado = notas / 5;

        System.out.printf("\n%.2f/5\nMédia: %.2f\n", notas, resultado);

        if (resultado < 5) {
            System.out.println("Reprovado");
        } else if (resultado >= 5 && resultado < 9) {
            System.out.println("Aprovado");
        } else if (resultado == 9) {
            System.out.println("Parabéns!");
        } else {
            System.out.println("MASTER OF THE UNIVERSE");
        }
    }

}
