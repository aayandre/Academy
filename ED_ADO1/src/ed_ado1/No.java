/*
 * André de Amorim Yamamoto
 * TADS - Turma A
 * aay.andre@outlook.com
 */
package ed_ado1;

/**
 *
 * @author aayan
 */
public class No {

    private Carros c;
    private No prox;

    public No(Carros car) {
        this.c = car;
        this.prox = null;
    }

    public Carros getC() {
        return c;
    }

    public void setC(Carros c) {
        this.c = c;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

}
