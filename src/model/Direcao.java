package model;

public class Direcao {

    int idProd;
    String nome;
    
    public Direcao(int idProd, String nome) {
        this.idProd = idProd;
        this.nome = nome;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
