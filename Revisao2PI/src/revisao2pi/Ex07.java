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
public class Ex07 {

    public static void main(String[] args) {

        recebeExecuta();

    }

    static void recebeExecuta() {

        System.out.println("Quantos alunos?");
        int quantidadeAlunos = Funcoes.lerINT("");
 
        validarEntrada(quantidadeAlunos);//Só usaria se fosse uma String pra checar se é válido

        System.out.println("- - - Notas - - -");

        double notasSoma = 0, notas = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {

            System.out.printf("%dº Nota: ", i + 1);
            notas = Funcoes.lerDOUBLE("");
            System.out.println("- - - - - - - - -");
            notasSoma += notas;

        }

        calculaMedia(quantidadeAlunos, notasSoma);
    }

    static void validarEntrada(int alunosTest) {

        String alunos = Integer.toString(alunosTest);

        while (!alunos.matches("[0-9]+")) {
            if (!alunos.matches("[0-9]+")) {

                alunos = Funcoes.lerTEXTOnext("Digite um número");

            } else {
                break;
            }
        }

    }

    static void calculaMedia(int numeroDeAlunos, double somaDasNotas) {

        double alunos = numeroDeAlunos;

        double media = somaDasNotas / alunos;

        System.out.printf("A média é: %.2f\n", media);

    }

}
