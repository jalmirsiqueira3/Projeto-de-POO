package model;

public class Roteiro {
    
    int idProd;
    int idRoteiro;
    String obraAdaptada;
    
    public Roteiro(int idProd, int idRoteiro, String obraAdaptada) {
        this.idProd = idProd;
        this.idRoteiro = idRoteiro;
        this.obraAdaptada = obraAdaptada;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getIdRoteiro() {
        return idRoteiro;
    }

    public void setIdRoteiro(int idRoteiro) {
        this.idRoteiro = idRoteiro;
    }

    public String getObraAdaptada() {
        return obraAdaptada;
    }

    public void setObraAdaptada(String obraAdaptada) {
        this.obraAdaptada = obraAdaptada;
    }
    
}
