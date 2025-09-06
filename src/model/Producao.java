package model;

public abstract class Producao {

	int idProd;
	String titulo;
	String genero;
	int anoLancamento;
	String sinopse;
	int idFranq;
	
	public Producao(int idProd, String titulo, String genero, int anoLancamento, String sinopse, int idFranq) {
		super();
		this.idProd = idProd;
		this.titulo = titulo;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.sinopse = sinopse;
		this.idFranq = idFranq;
	}

	public int getId() {
		return idProd;
	}

	public void setId(int id) {
		this.idProd = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public int getIdFranq() {
		return idFranq;
	}

	public void setIdFranq(int idFranq) {
		this.idFranq = idFranq;
	}
	
}
