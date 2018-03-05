/*
 * André de Amorim Yamamoto
 * TADS - Turma A
 * aay.andre@outlook.com
 */
package poo_ado1;

/**
 *
 * @author aayan
 */
public class Estado {

    private String Nome;

    private double pib;

    public Estado(String Nome, double pib) {
        this.Nome = Nome;
        this.pib = pib;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

}
