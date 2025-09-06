package model;

import java.time.LocalTime;

public class Filme extends Producao {

    LocalTime duracao;
    float bilheteria;
    int continua;
    
    public Filme(int idProd, String titulo, String genero, int anoLancamento, String sinopse, int idFranq,
            LocalTime duracao, float bilheteria, int continua) {
        super(idProd, titulo, genero, anoLancamento, sinopse, idFranq);
        this.duracao = duracao;
        this.bilheteria = bilheteria;
        this.continua = continua;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public float getBilheteria() {
        return bilheteria;
    }

    public void setBilheteria(float bilheteria) {
        this.bilheteria = bilheteria;
    }

    public int getContinua() {
        return continua;
    }

    public void setContinua(int continua) {
        this.continua = continua;
    }
    
}
