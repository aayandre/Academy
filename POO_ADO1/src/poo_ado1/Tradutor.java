/*
 * André de Amorim Yamamoto
 * TADS - Turma A
 * aay.andre@outlook.com
 */
package poo_ado1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aayan
 */
public class Tradutor {

    static ArrayList<Regiao> construirRegioes(BufferedReader arquivo) {

        String linha;

        String[] nomesRegioes = {"norte", "sul", "leste", "oeste",
            "centro-oeste", "nordeste", "noroeste", "suldeste", "suldoeste"};

        ArrayList<Regiao> lista = new ArrayList<>();

        boolean ehRegiao = false;
        boolean ehParagrafo = false;
        Regiao regiao = new Regiao();
        ArrayList<String> estados = new ArrayList<>();

        try {

            linha = arquivo.readLine();

            while ((linha = arquivo.readLine()) != null) {

                //Verifica se a linha é uma região
                for (String linhaAgr : nomesRegioes) {
                    if (linha.trim().equalsIgnoreCase(linhaAgr.trim())) {
                        ehRegiao = true;
                        break;
                    } else {
                        ehRegiao = false;
                    }
                }

                //Verifica os paragrafos
                if (linha.equalsIgnoreCase("")) {
                    ehParagrafo = true;
                    regiao.setEstados(estados);
                    estados.clear();
                    lista.add(regiao);
                } else {
                    ehParagrafo = false;
                }

                //Cria regiao
                if (ehRegiao) {
                    regiao.setNome(linha);
                }

                //Adiciona estado ao array
                if (!ehRegiao && !ehParagrafo) {
                    estados.add(linha);
                }

            }

        } catch (IOException ex) {
            System.out.println("Error ao ler arquivo.");

        }

        return null;
    }

    static ArrayList<Estado> construirEstados(BufferedReader arquivo) {

        String linha;
        ArrayList<Estado> lista = new ArrayList<>();

        try {

            while ((linha = arquivo.readLine()) != null) {

                String nomeEstado = linha.split(";")[0];
                double pib = Double.parseDouble(linha.split(";")[1]);

                //String[] temp = linha.split(";");
                //Estado estado = new Estado(temp[0], Double.parseDouble(temp[1]));
                Estado estado = new Estado(nomeEstado, pib);
                lista.add(estado);

            }

            //arquivo.close();
            return lista;

        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo");
            System.out.println(ex.getMessage());
            return null;
        }

    }

    static BufferedReader lerArquivo(String nomeArquivo) {

        try {
            FileReader fileReader = new FileReader(nomeArquivo);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            return bufferedReader;

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + nomeArquivo + "'");
            return null;
        }

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
