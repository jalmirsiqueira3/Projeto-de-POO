package model;

import java.time.LocalDate;

public class Franquia {
	
	int id;
	String nome;
	LocalDate dtLancamento;
	String produtora;
	String Status;
	
	public Franquia(String nome, LocalDate dtLancamento, String produtora, String status) {
		this.nome = nome;
		this.dtLancamento = dtLancamento;
		this.produtora = produtora;
		this.Status = status;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDtLancamento() {
		return dtLancamento;
	}
	
	public void setDtLancamento(LocalDate dtLancamento) {
		this.dtLancamento = dtLancamento;
	}
	
	public String getProdutora() {
		return produtora;
	}
	
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	
	

}
