/*
 * André de Amorim Yamamoto
 * TADS - Turma A
 * aay.andre@outlook.com
 */
package poo_ado1;

import java.util.ArrayList;

/**
 *
 * @author aayan
 */
public class Regiao {

    private String nome;

    private double pibRegiao;

    private ArrayList<String> estados;

    public Regiao(String Nome, ArrayList<String> Estados) {
        this.nome = Nome;
        this.estados = Estados;
    }

    public Regiao(String nome) {
        this.nome = nome;
    }

    public Regiao() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public double getPibRegiao() {
        return pibRegiao;
    }

    public void setPibRegiao(double PibRegiao) {
        this.pibRegiao = PibRegiao;
    }

    public ArrayList<String> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<String> Estados) {
        this.estados = Estados;
    }

}
