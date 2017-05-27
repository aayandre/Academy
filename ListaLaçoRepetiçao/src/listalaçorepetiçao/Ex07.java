/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package listalaçorepetiçao;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Ex07 {

    public static void main(String[] args) {
        
        //Variáveis
        int multisete = 7, contagi = 1;
        
        //Processamento
        while (multisete <= 200) {
            
        //Saída
            System.out.println(multisete);
            contagi++;
            multisete = 7 * contagi;
        }
    }

}
