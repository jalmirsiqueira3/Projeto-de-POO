package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {
	private String nome;
	private LocalDate dtNascimento;
	private String email;
	private String senha;
	private ArrayList<Usuario> listaSegue = new ArrayList<Usuario>();
	
	public Usuario(String nome, LocalDate dtNascimento, String email, String senha) throws Exception {
		setNome(nome);
		this.dtNascimento = dtNascimento;
		this.email = email;
		setSenha(senha);;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if(nome.length() > 10) {
			throw new Exception("Não é permitido nome de usúario com mais de dez caracteres!");
		}
		this.nome = nome;			
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) throws Exception {
		if(senha.length() == 4 && senha.matches(".*[A-Za-z].*") && senha.matches(".*\\d.*")) {
			this.senha = senha;
		}
		else {
			throw new Exception("A senha deve conter extamente 4 caracteres, tendo pelo menos uma letra e um número!");
		}
	}

	public List<Usuario> getListaSegue() {
		return Collections.unmodifiableList(listaSegue);
	}

	public void seguir(Usuario user) throws Exception {
		if(user.getNome().equals(this.getNome())) {
			throw new Exception("O usuário não pode seguir a si mesmo!");
		}
		for (Usuario usuario : this.listaSegue) {
			if(usuario.getNome().equals(user.getNome())) {
				throw new Exception("O usuário já segue \'" + user.getNome() + "\'");
			}
		}
		this.listaSegue.add(user);
	}
	
}
