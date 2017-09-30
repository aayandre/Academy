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
public class TV {

    //Atributos/propriedades
    private int canal;

    private int volume = 0;

    private boolean ligada = false;

    //Construtor
    public TV() {
    }

    //Metodos
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setCanal(int numero) {
        if (this.ligada == true) {
            if (numero > (-1) || numero < 100) {
                canal = numero;
            } else {
                System.out.println("Canal invalido.");
            }
        }
    }

    public void setVolume(boolean escolha) {
        if (this.ligada == true) {
            //escolha == true aumentara o volume, se ele nao atingir o limite
            if (escolha) {
                if (this.volume++ >= 21) {
                    System.out.println("Limite.");
                } else {
                    this.volume++;
                }
            } else {
                if (this.volume-- <= (-1)) {
                    System.out.println("Limite.");
                } else {
                    this.volume--;
                }
            }
        }
    }

    public void isLigada() {
        //poderia retornar o true/false, mas achei melhor assim
        if (this.ligada) {
            System.out.println("Ligada.");
        } else {
            System.out.println("Desligada.");
        }
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

}
