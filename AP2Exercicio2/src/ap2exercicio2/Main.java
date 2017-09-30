/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2exercicio2;

/**
 *
 * @author andre.ayamamoto
 */
public class Main {

    public static void main(String[] args) {

        Pessoa lala = new Pessoa("Lala", 38, 68.3, 1.78);

        String nome = lala.getNome();
        int idade = lala.getIdade();
        double peso = lala.getPeso();
        double altura = lala.getAltura();
        double imc = lala.calculaIMC(lala);
        
        System.out.println(nome + idade + peso + altura);
        lala.resultadoIMC(imc);
    }

}
