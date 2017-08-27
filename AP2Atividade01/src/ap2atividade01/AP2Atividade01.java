/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package ap2atividade01;

import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class AP2Atividade01 {

    public static void main(String[] args) {

        principal();

    }

    static void principal() {

        int escolha;
        //Criar vetor
        String[] listaDeNomes = criaVetor(4);//Escolha o tamanho da lista se quiser

        do {
            //Menus
            escolha = mostraMenus();
            //Escolher o menu
            listaDeNomes = escolherMenu(escolha, listaDeNomes);
        } while (escolha != 0);

    }

    static int mostraMenus() {
        System.out.println("\n- - - - Menu - - - -");
        System.out.println("1 - Adicionar novo nome"
                + "\n2 - Apresentar nomes"
                + "\n3 - Pesquisar nome"
                + "\n4 - Remover nome"
                + "\n0 - Sair");
        System.out.println("Escolha[0-4]: ");
        int escolhaDoUser = validarEscolha();
        return escolhaDoUser;
    }

    static String[] escolherMenu(int escolhaDoUser, String[] listaDeNomes) {

        switch (escolhaDoUser) {
            case 0:
                System.out.println("- - Sair - -");
                break;
            case 1:
                System.out.println("- - Adicionar novo nome - -");
                listaDeNomes = adicionarNovoNome(listaDeNomes);
                return listaDeNomes;
            case 2:
                System.out.println("- - Apresentar nomes - -");
                mostraVetor(listaDeNomes);
                break;
            case 3:
                System.out.println("- - Pesquisar nome - -");
                System.out.print("Nome: ");
                String nome = lerTXT();
                pesquisarNome(listaDeNomes, nome);
                return listaDeNomes;
            case 4:
                System.out.println("- - Remover nome - -");
                listaDeNomes = removerNomeDaLista(listaDeNomes);
                return listaDeNomes;
            default:
                break;
        }
        return listaDeNomes;
    }

    static String[] removerNomeDaLista(String[] listaDeNomes) {
        System.out.print("Nome a ser removido: ");
        String nome = lerTXT();
        listaDeNomes = pesquisarNomeParaRemover(listaDeNomes, nome);
        listaDeNomes = organizarLista(listaDeNomes);
        return listaDeNomes;
    }

    static String[] organizarLista(String[] listaDeNomes) {

        for (int i = 0; i < listaDeNomes.length; i++) {
            if (listaDeNomes[i].equalsIgnoreCase("") && i != (listaDeNomes.length - 1)) {
                listaDeNomes[i] = listaDeNomes[i + 1];
                listaDeNomes[i + 1] = "";
            }
        }
        
          //A complicação que eu crio é foda
//        String preenchido = "";
//        //Procura um espaço preenchido e manda pra variavel
//        for (int j = (listaDeNomes.length - 1); j > (-1); j--) {
//            if (!listaDeNomes[j].trim().equalsIgnoreCase("")) {
//                preenchido = listaDeNomes[j];
//                listaDeNomes[j] = "";
//                break;
//            }
//        }
//        //Procura um espaço vazio e preenche
//        for (int i = 0; i < listaDeNomes.length; i++) {
//            if (listaDeNomes[i].trim().equalsIgnoreCase("")) {
//                listaDeNomes[i] = preenchido;
//                break;
//            }
//        }
        return listaDeNomes;
    }

    static int validarEscolha() {
        String validacao = lerTXT();
        if (!validacao.matches("[0-4]")) {
            while (!validacao.matches("[0-4]")) {
                System.out.print("Escolha[0-4]: ");
                validacao = lerTXT();
            }
        }
        int numero = Integer.valueOf(validacao);
        return numero;
    }

    static String[] criaVetor(int tamanho) {

        String[] listaDeNomes = new String[tamanho];
        listaDeNomes = retirarNulls(listaDeNomes);
        return listaDeNomes;

    }

    static String[] retirarNulls(String[] listaDeNomes) {
        for (int i = 0; i < listaDeNomes.length; i++) {
            listaDeNomes[i] = "";
        }
        return listaDeNomes;
    }

    static void mostraVetor(String[] listaDeNomes) {
        boolean vazia = verSeEstaVazia(listaDeNomes);
        if (vazia) {
            System.out.println("A lista está vazia.");
        } else {
            for (String NomeNaLista : listaDeNomes) {
                if (!NomeNaLista.trim().equalsIgnoreCase("")) {
                    System.out.printf("%-3s\n", NomeNaLista);
                }
            }
        }
    }

    static boolean verSeEstaVazia(String[] listaDeNomes) {
        boolean vazia = true;
        for (String listaDeNome : listaDeNomes) {
            if (!listaDeNome.trim().equalsIgnoreCase("")) {
                vazia = false;
                break;
            }
        }
        return vazia;
    }

    static String[] adicionarNovoNome(String[] listaDeNomes) {
        boolean jaExiste;
        System.out.println("Nome a ser adicionado: ");
        String nome = lerTXT();
        jaExiste = pesquisarNomeParaAdd(listaDeNomes, nome);
        if (jaExiste) {
            return listaDeNomes;
        } else if (!listaDeNomes[listaDeNomes.length - 1].trim().equalsIgnoreCase("")) {
            System.out.println("Lista cheia.");
            return listaDeNomes;
        } else {
            listaDeNomes[listaDeNomes.length - 1] = nome;
            listaDeNomes = organizarLista(listaDeNomes);
            return listaDeNomes;
        }

    }

    static void pesquisarNome(String[] listaDeNomes, String nome) {
        boolean encontrou = false;
        for (int i = 0; i < listaDeNomes.length; i++) {
            if (listaDeNomes[i].trim().equalsIgnoreCase(nome.trim())) {
                System.out.printf("O nome \"%s\" foi encontrado.\nNa posição %d\n", nome, i + 1);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.printf("Nome \"%s\" não foi encontrado.\n", nome);
        }
    }

    static String[] pesquisarNomeParaRemover(String[] listaDeNomes, String nome) {
        boolean removeu = false;
        for (int i = 0; i < listaDeNomes.length; i++) {
            if (listaDeNomes[i].trim().equalsIgnoreCase(nome.trim())) {
                listaDeNomes[i] = "";
                removeu = true;
                break;
            }
        }
        if (!removeu) {
            System.out.printf("Nome \"%s\" não foi encontrado.\n", nome);
        }
        return listaDeNomes;
    }

    static boolean pesquisarNomeParaAdd(String[] listaDeNomes, String nome) {
        boolean encontrou = false;
        for (String NomeNaLista : listaDeNomes) {
            if (NomeNaLista.trim().equalsIgnoreCase(nome.trim())) {
                encontrou = true;
            }
        }
        if (encontrou) {
            System.out.println("O nome já existe.");
        }
        return encontrou;
    }

    static Scanner ler = new Scanner(System.in);

    static int lerINT() {
        int x = ler.nextInt();
        return x;
    }

    static String lerTXT() {
        String texto = ler.nextLine();
        return texto;
    }
}
