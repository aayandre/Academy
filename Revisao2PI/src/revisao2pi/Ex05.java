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

    }

    static int compararSeAdivinhou() {

        String entradaUser = null;
        boolean desistirOn = false;
        boolean adivinhou = false;

        do {
            entradaUser = Funcoes.lerTEXTOnext("Digite um número");

            //Checar se o usuario vai sair do laço ou não
            desistirOn = verSeDesistiu(entradaUser);
            if (desistirOn) {
                break;
            }

            //Comparar com o Random
            
            
        } while (desistirOn == false);
    }

    static boolean verSeDesistiu(String entradaUser) {

        boolean desistiuQ = false;

        if (entradaUser.equalsIgnoreCase("desistir")) {
            System.out.println("Você desistiu.");
            desistiuQ = true;
        } else if (!entradaUser.matches("[0-9]+")) {
            System.out.println("Entrada inválida");
            desistiuQ = true;
        }
        return desistiuQ;
    }

    static boolean comprarComRandom(String numero) {
        int textoToInt = Integer.parseInt(numero);
        
        
    }

}
