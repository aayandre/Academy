/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2pi;

/**
 *
 * @author andre.ayamamoto 5.	Construa um programa Java que gere um número
 * aleatório (utilizando a classe java.util.Random) e peça que o usuário
 * adivinhe o número. O programa deverá ler dados do usuário até que ele acerte
 * o número (exibindo uma mensagem de sucesso) ou ele digite “desistir” (onde
 * uma mensagem de falha junto ao número que deveria ser adivinhado deverá ser
 * exibida). Separe a lógica dos métodos de forma coesa.
 */
public class Ex05 {

    public static void main(String[] args) {

        //Número aleatório
        int sorteado = Funcoes.aleatorio.nextInt(10) + 1;

        //Processo
        compararSeAdivinhou(sorteado);

    }

    static void compararSeAdivinhou(int aleatorio) {

        //Inicializando
        String entradaUser = null;
        boolean fecharLaco = false, adivinhou = false;

        do {
            entradaUser = Funcoes.lerTEXTOnext("Digite um número");

            //Checar se o usuario vai sair do laço ou não
            fecharLaco = verSeDesistiu(entradaUser);
            if (fecharLaco) {
                break;
            }

            //Comparar com o Random
            adivinhou = compararComRandom(entradaUser, aleatorio);
            if (adivinhou) {
                fecharLaco = true;
            }

        } while (fecharLaco == false);
    }

    static boolean verSeDesistiu(String entradaUser) {

        boolean desistiuQ = false;
        entradaUser = entradaUser.replaceAll("\\s", "");

        if (entradaUser.equalsIgnoreCase("desistir")) {
            System.out.println("Você desistiu.");
            desistiuQ = true;
        } else if (!entradaUser.matches("[0-9]+")) {
            System.out.println("Entrada inválida");
            desistiuQ = true;
        }
        return desistiuQ;
    }

    static boolean compararComRandom(String numero, int aleatorio) {

        boolean adivinhouQ = false;

        //Muda o tipo da variável
        numero = numero.trim();
        int textoToInt = Integer.parseInt(numero);

        //Validação
        if (textoToInt == aleatorio) {
            System.out.printf("Você adivinhou!\nO número era: %d\n", aleatorio);
            adivinhouQ = true;
        }

        return adivinhouQ;

    }

}
