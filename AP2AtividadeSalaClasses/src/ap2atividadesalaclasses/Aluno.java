/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2atividadesalaclasses;

/**
 *
 * @author andre.ayamamoto
 */
public class Aluno {

    private String Nome;

    private float Nota1, Nota2, Nota3;

    //Construtor
    public Aluno() {
    }

    //Métodos
    public double verMedia() {
        double media = (this.Nota1 + this.Nota2 + this.Nota3) / 3.0;
        return media;
    }

    public void verSituacao() {
        double media = verMedia();
        String situacao;
        if (media < 6.0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
    }
}
