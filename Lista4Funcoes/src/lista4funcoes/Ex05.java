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
public class Ex05 {
    
    public static void main(String[] args) {
        
        System.out.println("---Bháskara---");
        System.out.println("ax² + bx + c");
        System.out.println("Valor de a:");
        double a = MinhasFunc.entradaInt();
        
        System.out.println("Valor de b:");
        double b = MinhasFunc.entradaInt();
        
        System.out.println("Valor de c:");
        double c = MinhasFunc.entradaInt();
        
        double resultado = MinhasFunc.bhaskara(a, b, c);
        
        System.out.printf("----Resultado----\na = %.1fx² b = %.1fx c = %.1f\nA maior raiz é: %.2f\n", a, b, c, resultado);
    }
    
}
