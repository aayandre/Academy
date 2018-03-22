/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package lista4funcoes;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex09 {
    
    public static void main(String[] args) {
        
        System.out.println("- - Idade em Dias - -");
        System.out.println("Ano atual?");
        int anoAtual = MinhasFunc.entradaInt();
        
        System.out.println("Idade?");
        int anos = MinhasFunc.entradaInt();
        
        System.out.println("Meses?(Quantos meses se passaram desde o seu aniversário)");
        int meses = MinhasFunc.entradaInt();
        
        System.out.println("Dias?");
        int dias = MinhasFunc.entradaInt();
        
        int diasTotal = MinhasFunc.idadeEmDias(anoAtual, anos, meses, dias);
        
        System.out.printf("Sua idade em dias é : %d\n", diasTotal);
    }
    
}
