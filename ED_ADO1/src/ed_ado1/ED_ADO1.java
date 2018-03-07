/*
 * André de Amorim Yamamoto
 * TADS - Turma A
 * aay.andre@outlook.com
 */
package ed_ado1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author aayan
 */
public class ED_ADO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Lista de carros
        ListaSimples carList = new ListaSimples();

    }

    static void Opcoes(ListaSimples list) {

        int option;

        do {

            System.out.println(" === Menu === ");
            System.out.println("1 - Adicionar carro ao início da lista\n"
                    + "2 - Adicionar carro ao fim da lista\n"
                    + "3 - Pesquisar carro pelo modelo\n"
                    + "4 - Mostrar lista\n"
                    + "5 - Remover carro pelo modelo\n"
                    + "6 - Remover tudo\n"
                    + "7 - Sair\n");

            System.out.println("Escolha um dos itens acima");
            option = inputCheck();

            switch (option) {
                case 1:
                    //Adiciona carro ao comeco da lista
                    Carros car = new Carros();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }

        } while (option != 7);

    }

    static int inputCheck() {

        Scanner read = new Scanner(System.in);

        int numberOption = 0;

        String option = read.nextLine();

        try {

            if (inputOk(option)) {
                return Integer.parseInt(option);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            inputCheck();
        }
        return -1;
    }

    static boolean inputOk(String option) throws Exception {

        //Verificar OPTION
        if (!option.matches("\\d+")) {
            throw new Exception("Erro 1");
        }

        int numberOption = Integer.parseInt(option);

        if (!(numberOption >= 1 && numberOption <= 7)) {
            throw new Exception("Erro 2");

        }

        return true;
    }

    static Carros setCar(Carros car) {

        return null;
    }

    static int yearCheck() {

        Scanner read = new Scanner(System.in);

        String year = read.nextLine();

        if (!year.matches("\\d+")) {
            System.out.println("Nao e numero.");
            yearCheck();
        }

        int yearNum = Integer.parseInt(year);

        if (yearNum > Calendar.getInstance().get(Calendar.YEAR)) {
            System.out.println("Ano maior que o atual.");
            yearCheck();
        }

        return yearNum;
    }

}
