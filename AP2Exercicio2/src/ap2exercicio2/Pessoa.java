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
public class Pessoa {

    private String nome;

    private int idade;

    private double peso;

    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calculaIMC(Pessoa x) {
        double imc = x.peso / (x.altura * x.altura);
        return imc;
    }

    public void resultadoIMC(double imc) {
        
        if(imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        } else if (imc <= 24.9) {
            System.out.println("Peso Ideal.");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I.");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II.");
        } else {
            System.out.println("Obesidade grau III.");
        }
    }
    
}
