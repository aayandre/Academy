/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.util.Scanner;

/**
 *
 * @author andre.ayamamoto
 */
public class Exe3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //Entrada e Processo
        int maisVelho = 0, mediaMulheres, mediaHomens, somaHomens = 0, somaMulheres = 0, quantidadeHomens = 0, quantidadeMulheres = 0;
        String nomeMaisVelho = null, sexoMaisVelho = null;

        for (int i = 0; i < 10; i++) {//Repetição de 11 vezes

            System.out.print("Primeiro nome: ");
            String nome = ler.next();

            System.out.print("Idade: ");
            int idade = ler.nextInt();

            System.out.print("Sexo(M ou F): ");
            String sexo = ler.next();

            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                System.out.println("INFORMAÇÃO INVÁLIDA");
            }

            if (idade > maisVelho) {//Recolhe informações sobre o mais velho
                nomeMaisVelho = nome;
                maisVelho = idade;
                sexoMaisVelho = sexo;
            }
            if (sexo.equalsIgnoreCase("M")) {
                somaHomens += idade;//Soma das idades dos homens 
                quantidadeHomens++;
            } else {
                somaMulheres += idade;//Soma das idades das mulheres
                quantidadeMulheres++;
            }
        }
        mediaHomens = somaHomens / quantidadeHomens;
        mediaMulheres = somaMulheres / quantidadeMulheres;
        
        //Saída
        System.out.printf("\nDados do Aluno mais velho\nNome: %s\nIdade: %d\nSexo: %s\n", nomeMaisVelho, maisVelho, sexoMaisVelho);
        System.out.printf("Idade média(Homens): %d\nIdade média(Mulheres): %d\n", mediaHomens, mediaMulheres);
    }

}
