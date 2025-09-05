package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Episodio {
    
    int idProd;
    int idEpisodio;
    String titulo;
    LocalTime duracao;
    LocalDate dtLancamento;
    
    public Episodio(int idProd, int idEpisodio, String titulo, LocalTime duracao, LocalDate dtLancamento) {
        this.idProd = idProd;
        this.idEpisodio = idEpisodio;
        this.titulo = titulo;
        this.duracao = duracao;
        this.dtLancamento = dtLancamento;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(int idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public LocalDate getDtLancamento() {
        return dtLancamento;
    }

    public void setDtLancamento(LocalDate dtLancamento) {
        this.dtLancamento = dtLancamento;
    }
    
}
