/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package revisao2pi;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex09 {

    public static void main(String[] args) {

        principal();

    }

    static void principal() {

        String entradaUser = "";

        boolean saiu = false;

        System.out.println("- - - Aulas da Semana - - -\n\nDigite \"sair\" para sair.");

        String[][] matrizFinal = criaMatriz();

        mostrarMatriz(matrizFinal);

        while (saiu == false) {
            matrizFinal = preencheComEntradaUser(matrizFinal);
            if (saiu = validarMatriz(matrizFinal) == true) {
                break;
            }
        }
    }

    static String[][] preencheComEntradaUser(String[][] matrizPrincipal) {
        String userEntrada = null;
        int contagemAulas = 1;

        /*O primeiro for esta andando nas LINHAS
        O segundo está nas COLUNAS. Ou seja String[LINHAS][COLUNAS]*/
        for (int i = 0; i < matrizPrincipal[0].length; i++) {
            contagemAulas = 1;
            for (int j = 1; j < matrizPrincipal.length; j++) {
                //for (int k = 1; k < 3; k++) {
                userEntrada = perguntaAulas(i, contagemAulas);
                contagemAulas++;
                matrizPrincipal[j][i] = userEntrada;
                if (validarResposta(userEntrada)) {
                    break;
                } else if (i == 4 && j == 2) {
                    mostrarMatriz(matrizPrincipal);
                    System.out.println("Você terminou de preencher seus horários.\nGostaria de sair?");
                    userEntrada = Funcoes.lerOnlyTEXTO();
                    if (userEntrada.equalsIgnoreCase("sim") || userEntrada.equalsIgnoreCase("s")) {
                        userEntrada = "sair";
                        matrizPrincipal[j][i] = userEntrada;
                        break;
                    }
                } else {
                    Funcoes.pulaLinhas(10);
                    mostrarMatriz(matrizPrincipal);
                }
                //}
                if (validarResposta(userEntrada)) {
                    break;
                }
            }
            if (validarResposta(userEntrada)) {
                break;
            }
        }

        return matrizPrincipal;
    }

    static String[][] criaMatriz() {
        String[][] tabelaDeAulas
                = {{"Segunda", "Terça", "Quarta", "Quinta", "Sexta"},
                {"", "", "", "", ""},
                {"", "", "", "", ""}};
        return tabelaDeAulas;
    }

    static String perguntaAulas(int x, int y) {

        String disciplina;

        switch (x) {
            case 0:
                System.out.println(" - - - Segunda - - - ");
                disciplina = Funcoes.lerTEXTOnext(y + "º Aula: ");
                break;
            case 1:
                System.out.println(" - - - Terça - - - ");
                disciplina = Funcoes.lerTEXTOnext(y + "º Aula: ");
                break;
            case 2:
                System.out.println(" - - - Quarta - - - ");
                disciplina = Funcoes.lerTEXTOnext(y + "º Aula: ");
                break;
            case 3:
                System.out.println(" - - - Quinta - - - ");
                disciplina = Funcoes.lerTEXTOnext(y + "º Aula: ");
                break;
            case 4:
                System.out.println(" - - - Sexta - - - ");
                disciplina = Funcoes.lerTEXTOnext(y + "º Aula: ");
                break;
            default:
                disciplina = null;
                break;
        }

        return disciplina;

    }

    static void mostrarMatriz(String[][] tabelaDeAulas) {

        for (String[] tabelaDeAula : tabelaDeAulas) {
            for (int j = 0; j < tabelaDeAula.length; j++) {
                if (j == 4) {
                    System.out.printf("%-10s\n", tabelaDeAula[j]);
                } else {
                    System.out.printf("%-10s", tabelaDeAula[j]);
                }
            }
        }

    }

    static boolean validarResposta(String entradaUser) {
        boolean saiu = false;
        if (entradaUser.equalsIgnoreCase("sair")) {
            saiu = true;
        }
        return saiu;
    }

    static boolean validarMatriz(String[][] matrizPrincipal) {
        boolean saiu = false;
        for (String[] strings : matrizPrincipal) {
            for (String string : strings) {
                if (string.equalsIgnoreCase("sair")) {
                    saiu = true;
                    break;
                }
            }
        }
        return saiu;

    }

    //static boolean 
}
//    static String[][] substituiNull(String[][] tabelaDeAulas) {
//
//        for (String[] tabelaDeAula : tabelaDeAulas) {
//            for (int j = 1; j < tabelaDeAula.length; j++) {
//                tabelaDeAula[j] = "";
//            }
//        }
//        return tabelaDeAulas;
//    }
