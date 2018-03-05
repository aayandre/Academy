/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ado1;

import java.io.*;

/**
 *
 * @author aayan
 */
public class lab1Adaptado {

    static double calculaTotalPib() {

        String nomeDoArquivo1 = "pib.txt";

        // linha temporaria
        String linha = null;
        // total pib
        double total = 0;

        try {
            FileReader fileReader = new FileReader(nomeDoArquivo1);

            // loop por cada linha do arquivo
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                // loop por cada linha do arquivo
                while ((linha = bufferedReader.readLine()) != null) {

                    //Pega o valor do pib
                    //System.out.println(linha);
                    String valor = linha.substring(linha.lastIndexOf(";") + 1);

                    //Soma os valores do pib
                    //System.out.println(total);
                    total += Double.parseDouble(valor);
                }
                // feche o arquivo
                bufferedReader.close();

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + nomeDoArquivo1 + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo '" + nomeDoArquivo1 + "'");
        }

        //FIM Retorno da soma do pib
        return total;

    }
    
    static double[] calculaPibProRegiao() {
        
        String nomeDoArquivo1 = "pib.txt";
        String nomeDoArquivo2 = "regioes.txt";
        
        String linhaPib = null;
        String linhaRegiao = null;
        
        String regiao = null;
        
        return null;
        
    }
    
    static void Writer() {

        String arquivoDeSaida = "saida.txt";

        try {

            FileWriter fileWriter = new FileWriter(arquivoDeSaida);

            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write("pib da regiao X = $$$$");
                bufferedWriter.newLine();
                bufferedWriter.write("pib da regiao Y = $$$$");
                // feche o arquivo
            }
        } catch (IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoDeSaida + "'");
        }
    }

}
