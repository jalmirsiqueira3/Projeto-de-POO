package model;

import java.time.LocalTime;

public class Serie extends Producao {
    
    int nTemporadas;
    int nEpisodios;
    LocalTime duracaoMed;
    
    public Serie(int idProd, String titulo, String genero, int anoLancamento, String sinopse, int idFranq,
            int nTemporadas, int nEpisodios, LocalTime duracaoMed) {
        super(idProd, titulo, genero, anoLancamento, sinopse, idFranq);
        this.nTemporadas = nTemporadas;
        this.nEpisodios = nEpisodios;
        this.duracaoMed = duracaoMed;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public int getnEpisodios() {
        return nEpisodios;
    }

    public void setnEpisodios(int nEpisodios) {
        this.nEpisodios = nEpisodios;
    }

    public LocalTime getDuracaoMed() {
        return duracaoMed;
    }

    public void setDuracaoMed(LocalTime duracaoMed) {
        this.duracaoMed = duracaoMed;
    }

}
