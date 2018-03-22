/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsala;

/**
 *
 * @author andre.ayamamoto
 */
public class EmSala {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Tamanho do vetor
        int tamanho = Funcoes.tamanhoDoVetor();

        //Cria vetor
        int vetor[] = Funcoes.criaVetor(tamanho);

        //Preenche
        vetor = Funcoes.preencheVetor(tamanho);

        //Copia vetor
        int vetor2[] = Funcoes.copiaVetor(vetor);

        //Soma 2 vetores
        int vetor3[] = Funcoes.somaVetor(vetor, vetor2);

        //Une vetor
        int vetor4[] = Funcoes.uneVetor(vetor, vetor3);

        //Mostra o vetor, a soma, o menor e o maior
        Funcoes.imprimeVetor(vetor);
        //Soma
        Funcoes.imprimeVetor(vetor3);
        //União
        Funcoes.imprimeVetor(vetor4);
    }

}
