/*
 * Andre de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package ap2exercicio1;

/**
 *
 * @author aayan
 */
public class Main {

    public static void main(String[] args) {

        TV sala = new TV();

        sala.setLigada(true);
        sala.setCanal(80);
        sala.setVolume(true);//aumenta

        System.out.println(sala.getCanal());
        System.out.println(sala.getVolume());
        sala.isLigada();
        
        sala.setLigada(true);
        sala.setCanal(56);
        sala.setVolume(true);//aumenta

        System.out.println(sala.getCanal());
        System.out.println(sala.getVolume());
        sala.isLigada();

    }

}
