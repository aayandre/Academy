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
        int contador;

        String[] nomesRegioes = {"norte", "sul", "leste", "oeste",
            "centro-oeste", "nordeste", "noroeste", "sudeste", "sudoeste"};

        List<Regiao> lista = new ArrayList<>();

        boolean ehRegiao = false;
        boolean ehParagrafo;
        Regiao regiao = new Regiao();
        ArrayList<String> estados = new ArrayList<>();

        try {

            while (arquivo.ready()) {

                linha = arquivo.readLine();

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
                } else {
                    ehParagrafo = false;
                }

                //Cria regiao
                if (ehRegiao) {
                    regiao = new Regiao();
                    regiao.setNome(linha);
                }

                //Adiciona estado ao array
                if (!ehRegiao && !ehParagrafo) {
                    estados.add(linha);
                }

                //
                if (ehParagrafo || !arquivo.ready()) {
                    regiao.setEstados(estados);
                    lista.add(regiao);
                    estados = new ArrayList<>();
                }

            }

            return (ArrayList<Regiao>) lista;

        } catch (IOException ex) {
            System.out.println("Error ao ler arquivo.");

            return null;
        }

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

    static ArrayList<Regiao> adicionaPibAsRegioes(ArrayList<Regiao> regioes, ArrayList<Estado> estados) {

        double pibRegiao = 0;

        ArrayList<Regiao> retorno = new ArrayList<>();

        //Itera as regioes
        for (Regiao regiaoAtual : regioes) {

            //Itera os estados da regiao atual
            for (String estadoAtual : regiaoAtual.getEstados()) {

                //Itera a lista de estados
                for (Estado estado : estados) {

                    //Verifica se o estadoAtual é um estado da lista estados
                    if (estadoAtual.trim().equalsIgnoreCase(estado.getNome().trim())) {

                        //Se for um estado da regiao acumala o pibDaRegiao
                        pibRegiao += estado.getPib();
                    }

                }
            }

            //Ao acabar de somar os estados add a regiao o pib
            regiaoAtual.setPibRegiao(pibRegiao);
            retorno.add(regiaoAtual);
            pibRegiao = 0;

        }

        //E entao retorna o array de regioes com os devidos pibs
        return retorno;

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

    static void escreverArquivoRegioes(ArrayList<Regiao> regioes) {

        String arquivoDeSaida = "saida.txt";

        try {

            FileWriter saida = new FileWriter(arquivoDeSaida);

            try (PrintWriter arquivo = new PrintWriter(saida)) {

                for (Regiao regiaoAtual : regioes) {

                    arquivo.printf(" - %s\n   Pib: R$ %.2f\n",
                            regiaoAtual.getNome(), regiaoAtual.getPibRegiao());

                    for (String estado : regiaoAtual.getEstados()) {

                        arquivo.printf("  -> %s\n", estado);

                    }

                    arquivo.printf("\n\n");
                }
            }
        } catch (IOException ex) {
            System.out.println("Erro de escrita.");
        }

    }

}
