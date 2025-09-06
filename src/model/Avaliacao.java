package model;

import java.time.LocalDate;

public class Avaliacao {
	
	LocalDate dtAvaliacao;
	int roteiro;
	int cinegrafia;
	int trilhaSonora;
	int figurino;
	int edicao;
	String comentario;
	
	public Avaliacao(LocalDate dtAvaliacao, int roteiro, int cinegrafia, int trilhaSonora, int figurino, int edicao, String comentario) {
		this.dtAvaliacao = dtAvaliacao;
		this.roteiro = roteiro;
		this.cinegrafia = cinegrafia;
		this.trilhaSonora = trilhaSonora;
		this.figurino = figurino;
		this.edicao = edicao;
		this.comentario = comentario;
	}

	public LocalDate getDtAvaliacao() {
		return dtAvaliacao;
	}

	public void setDtAvaliacao(LocalDate dtAvaliacao) {
		this.dtAvaliacao = dtAvaliacao;
	}

	public int getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(int roteiro) {
		this.roteiro = roteiro;
	}

	public int getCinegrafia() {
		return cinegrafia;
	}

	public void setCinegrafia(int cinegrafia) {
		this.cinegrafia = cinegrafia;
	}

	public int getTrilhaSonora() {
		return trilhaSonora;
	}

	public void setTrilhaSonora(int trilhaSonora) {
		this.trilhaSonora = trilhaSonora;
	}

	public int getFigurino() {
		return figurino;
	}

	public void setFigurino(int figurino) {
		this.figurino = figurino;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public double calcMedia(double media) {
		media = (roteiro + cinegrafia + trilhaSonora + figurino + edicao) / 5.0;
		return media;
	}

}
