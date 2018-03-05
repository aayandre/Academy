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
        ArrayList<Regiao> regioes = Tradutor.construirRegioes(Tradutor.lerArquivo(nomeArquivo2));

        //A
        //porcentagemEstado();
        double total = calcularTotalPIB(estados);
        porcentagensPorEstado(total, estados);
        
        
        //B
        regioes = Tradutor.adicionaPibAsRegioes(regioes, estados);
        pibPorRegiao(regioes);
        Tradutor.escreverArquivoRegioes(regioes);

    }

    static void pibPorRegiao(ArrayList<Regiao> regioes) {

        for (Regiao regiaoAtual : regioes) {

            System.out.printf(" - %s\n   Pib: R$ %.2f\n",
                    regiaoAtual.getNome(), regiaoAtual.getPibRegiao());

            for (String estado : regiaoAtual.getEstados()) {

                System.out.printf("  -> %s\n", estado);

            }
            
            System.out.println("\n\n");
        }

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
            System.out.printf("Nome: %s\nPib: %.2f",
                    estado.getNome(), estado.getPib() / (totalPib / 100));
            System.out.println("%\n");
        }

    }

}
