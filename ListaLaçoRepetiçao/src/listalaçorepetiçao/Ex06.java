/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package listalaçorepetiçao;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex06 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        //Variáveis
        String nome = null, nomefim = null;
        String gen = null, genfim = null;
        int idade = 0, idadefim = 0;
        
        int alunos = 5;
        
        do {
            
        //Entrada
        System.out.print("Nome: ");
        nome = ler.next();
        
        System.out.print("Idade: ");
        idade = ler.nextInt();
        
        System.out.print("Genero: ");
        gen = ler.next();
        
        //Processamento
        if(idade > idadefim) {
            nomefim = nome;
            genfim = gen;
            idadefim = idade;
        } 
        alunos--;
        }while (alunos != 0);
        
        //Saída
        System.out.printf("\nNome: %s\nIdade: %d\nGênero: %s\n", nomefim, idadefim, genfim);
    }
    
}
