/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ado1;

import java.util.ArrayList;

/**
 *
 * @author aayan
 */
public class POO_ADO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        a-) Imprimir na tela a lista de PIB por estado
        em percentual em relação ao total.

        b-) Gerar um arquivo de saída (saida.txt) sumarizando (somando)
        o PIB por regiões. Será fornecida uma lista de estados por regiões
        que deve ser lida do arquivo regioes.txt
         */
        String nomeArquivo1 = "pib.txt", nomeArquivo2 = "regioes.txt";

        ArrayList<Estado> estados = Tradutor.construirEstados(Tradutor.lerArquivo(nomeArquivo1));

        //A
        //porcentagemEstado();
        double total = calcularTotalPIB(estados);
        porcentagensPorEstado(total, estados);

        //B
        
    }

    static void pibPorRegiao() {

    }

    static double calcularTotalPIB(ArrayList<Estado> estados) {

        double total = 0;

        for (Estado estado : estados) {
            total += estado.getPib();
        }

        //System.out.println(total);
        return total;
    }

    static void porcentagensPorEstado(double totalPib, ArrayList<Estado> estados) {

        for (Estado estado : estados) {
            System.out.printf("Nome: %s\nPib: %.2f", estado.getNome(), estado.getPib());
            System.out.println("%\n");
        }

    }

}
