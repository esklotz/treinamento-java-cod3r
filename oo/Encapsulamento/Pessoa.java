package oo.Encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa (String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Pessoa(int idade) {
		setIdade(idade);
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
		this.idade = novaIdade;
		}
	}
	
	public String toString() {
		return "Ol� eu sou o " + getNome() + 
				" e tenho " + getIdade() + " anos.";
	}
	

}
