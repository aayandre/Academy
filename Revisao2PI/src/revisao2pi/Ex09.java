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

        String entradaUser = null;

        System.out.println("- - - Aulas da Semana - - -\n\nDigite \"sair\" para sair.");

        String[][] matrizFinal = criaMatriz();

        mostrarMatriz(matrizFinal);

//        while (!entradaUser.equalsIgnoreCase("sair")) {
//
//        }
    }

    static String perguntaAulas(int i) {

        Aula perguntas = new Aula();

        switch (i) {
            case 0:
                System.out.println("Segunda");
                perguntas.disciplina = Funcoes.lerTEXTOnext("Aula: ");
                break;
            case 1:
                System.out.println("Terça");
                perguntas.disciplina = Funcoes.lerTEXTOnext("Aula: ");
                break;
            case 2:
                System.out.println("Quarta");
                perguntas.disciplina = Funcoes.lerTEXTOnext("Aula: ");
                break;
            case 3:
                System.out.println("Quinta");
                perguntas.disciplina = Funcoes.lerTEXTOnext("Aula: ");
                break;
            case 4:
                System.out.println("Sexta");
                perguntas.disciplina = Funcoes.lerTEXTOnext("Aula: ");
                break;
            default:
                perguntas.disciplina = null;
                break;
        }

        return perguntas.disciplina;

    }

    static void mostrarMatriz(String[][] tabelaDeAulas) {

        for (int i = 0; i < tabelaDeAulas.length; i++) {
            for (int j = 0; j < tabelaDeAulas[i].length; j++) {
                if (i == 4) {
                    System.out.printf("%-10s\n", tabelaDeAulas[i][j]);
                } else {
                    System.out.printf("%-10s", tabelaDeAulas[i][j]);
                }

            }
        }

    }

    static String[][] criaMatriz() {

        String[][] tabelaDeAulas = new String[5][3];

        for (int i = 0; i < tabelaDeAulas.length; i++) {
            switch (i) {
                case 0:
                    tabelaDeAulas[i][0] = "Segunda";
                    break;
                case 1:
                    tabelaDeAulas[i][0] = "Terça";
                    break;
                case 2:
                    tabelaDeAulas[i][0] = "Quarta";
                    break;
                case 3:
                    tabelaDeAulas[i][0] = "Quinta";
                    break;
                case 4:
                    tabelaDeAulas[i][0] = "Sexta";
                    break;
            }

        }

        tabelaDeAulas = preencheDiasDaSemana(tabelaDeAulas);

        return tabelaDeAulas;
        //tabelaDeAulas = preencheDiasDaSemana(tabelaDeAulas);

    }

    static String[][] preencheDiasDaSemana(String[][] tabelaDeAulas) {

        for (String[] tabelaDeAula : tabelaDeAulas) {
            for (int j = 1; j < tabelaDeAula.length; j++) {
                tabelaDeAula[j] = "";
            }
        }

        return tabelaDeAulas;
    }

}

class Aula {

    public String disciplina;

    public boolean saiu;

    public Aula(String disciplina, boolean saiu) {
        this.disciplina = disciplina;
        this.saiu = saiu;
    }

}
