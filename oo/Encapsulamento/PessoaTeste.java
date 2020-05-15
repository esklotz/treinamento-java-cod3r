package oo.Encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", -50);
		p1.setIdade(230);
		
		System.out.println(p1.getIdade());
		System.out.println(p1);
		
	}

}
