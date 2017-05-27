/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecta4;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Conecta4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("---Conecta 4---");

        System.out.printf("    1   2   3   4   5   6   7   (COLUNAS)"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n6 |   |   |   |   |   |   |   |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n5 |   |   |   |   |   |   |   |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n4 |   |   |   |   |   |   |   |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n3 |   |   |   |   |   |   |   |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n2 |   |   |   |   |   |   |   |"
                + "\n  - - - - - - - - - - - - - - -"
                + "\n1 |   |   |   |   |   |   |   |"
                + "\n  - - - - - - - - - - - - - - -\n");

        //Entrada----------
        System.out.print("Primeiro jogador(X ou O): ");
        String jogador = ler.next();

        //Checa a validade do jogador
        while ((!"x".equalsIgnoreCase(jogador)) && (!"o".equalsIgnoreCase(jogador))) {
            System.out.print("Jogador(X ou O): ");
            jogador = ler.next();
        }

        //Processo----------
        String matriz[][] = new String[6][7];//[linha] e [coluna]----------
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 6; j++) {
                matriz[i][j] = " ";
            }
        }

        int certo = 0, linha = 0, colunaAtual = 0;

        boolean vez = jogador.equalsIgnoreCase("x");//Checagem da vez de quem joga---------           

        do {

            if (vez) {//Mostra a vez de quem joga----------
                System.out.println("\nVez do X.");
                jogador = "X";
            } else {
                System.out.println("\nVez do O.");
                jogador = "O";
            }

            System.out.print("Escolha uma coluna: ");
            int coluna = ler.nextInt();

            //Checar se a coluna é válida          
            while (coluna < 1 || coluna > 7) {
                System.out.print("Escolha uma coluna(Entre 1 e 7): ");
                coluna = ler.nextInt();
            }

            //Checar se a  posição está preenchida
            for (int i = 0; i < 6; i++) {
                if (("x".equalsIgnoreCase(matriz[i][(coluna - 1)])) || ("o".equalsIgnoreCase(matriz[i][(coluna - 1)]))) {
                    if (i == 5) {//Se a coluna estiver cheia o jogador escolhe outra coluna.
                        System.out.println("Coluna cheia.\nEscolha outra.");
                        vez = !vez;
                        break;
                    }
                } else {
                    matriz[i][coluna - 1] = jogador;
                    break;
                }
            }

            //Tabuleiro com as jogadas executadas
            Tabuleiro(matriz);

            //Vitória
            certo = VitoriaVerticalHorizontalDiagonal(matriz, jogador, certo);

            //Saída se ganhador
            if (certo == 1) {
                System.out.printf("\nVitória do jogador %s!!!\n", jogador);
            } else if (certo == 2) {
                System.out.println("\nEmpate.");
            }

            //Altera jogador
            vez = !vez;
        } while (certo == 0);//Checar VITÓRIA        
    }

    public static int VitoriaVerticalHorizontalDiagonal(String[][] matriz, String jogador, int certo) {
        //Vitória horizontal, vertical, diagonais
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if ( //Checar na horizontal
                        matriz[i][j].equalsIgnoreCase(jogador)
                        && matriz[i][(j + 1)].equalsIgnoreCase(jogador)
                        && matriz[i][(j + 2)].equalsIgnoreCase(jogador)
                        && matriz[i][(j + 3)].equalsIgnoreCase(jogador)
                        ||//Checar na vertical
                        matriz[j][i].equalsIgnoreCase(jogador)
                        && matriz[(j + 1)][i].equalsIgnoreCase(jogador)
                        && matriz[(j + 2)][i].equalsIgnoreCase(jogador)
                        && matriz[(j + 3)][i].equalsIgnoreCase(jogador)) {
                    certo = 1;
                    break;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ( //Checar na diagonal - Sequência: "/"
                        matriz[i][j].equalsIgnoreCase(jogador)
                        && matriz[(i + 1)][j + 1].equalsIgnoreCase(jogador)
                        && matriz[(i + 2)][j + 2].equalsIgnoreCase(jogador)
                        && matriz[(i + 3)][j + 3].equalsIgnoreCase(jogador)) {
                    certo = 1;
                    break;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 6; j >= 3; j--) {
                if ( //Checar na diagonal - Sequência: "\"
                        matriz[i][j].equalsIgnoreCase(jogador)
                        && matriz[(i + 1)][j - 1].equalsIgnoreCase(jogador)
                        && matriz[(i + 2)][j - 2].equalsIgnoreCase(jogador)
                        && matriz[(i + 3)][j - 3].equalsIgnoreCase(jogador)) {
                    certo = 1;
                    break;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if("x".equalsIgnoreCase(matriz[i][j]) || "o".equalsIgnoreCase(matriz[i][j])) {
                    int contagem = 0;
                    contagem++;
                    if (contagem == 42) {
                        certo = 2;
                    }
                }
            }
            
        }
        return certo;
    }

    public static void Tabuleiro(String[][] matriz) {
        //Saída
        System.out.printf("    1   2   3   4   5   6   7   (COLUNAS)");
        System.out.printf("\n  - - - - - - - - - - - - - - -");
        System.out.printf("\n6 | %s | %s | %s | %s | %s | %s | %s |", matriz[5][0], matriz[5][1], matriz[5][2], matriz[5][3], matriz[5][4], matriz[5][5], matriz[5][6]);
        System.out.printf("\n  - - - - - - - - - - - - - - -");
        System.out.printf("\n5 | %s | %s | %s | %s | %s | %s | %s |", matriz[4][0], matriz[4][1], matriz[4][2], matriz[4][3], matriz[4][4], matriz[4][5], matriz[4][6]);
        System.out.printf("\n  - - - - - - - - - - - - - - -");
        System.out.printf("\n4 | %s | %s | %s | %s | %s | %s | %s |", matriz[3][0], matriz[3][1], matriz[3][2], matriz[3][3], matriz[3][4], matriz[3][5], matriz[3][6]);
        System.out.printf("\n  - - - - - - - - - - - - - - -");
        System.out.printf("\n3 | %s | %s | %s | %s | %s | %s | %s |", matriz[2][0], matriz[2][1], matriz[2][2], matriz[2][3], matriz[2][4], matriz[2][5], matriz[2][6]);
        System.out.printf("\n  - - - - - - - - - - - - - - -");
        System.out.printf("\n2 | %s | %s | %s | %s | %s | %s | %s |", matriz[1][0], matriz[1][1], matriz[1][2], matriz[1][3], matriz[1][4], matriz[1][5], matriz[1][6]);
        System.out.printf("\n  - - - - - - - - - - - - - - -");
        System.out.printf("\n1 | %s | %s | %s | %s | %s | %s | %s |", matriz[0][0], matriz[0][1], matriz[0][2], matriz[0][3], matriz[0][4], matriz[0][5], matriz[0][6]);
        System.out.printf("\n  - - - - - - - - - - - - - - -\n");
    }
}
