package Operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoParcial =  media >= 5 ? "Em recupera��o" : "Reprovado";
		String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;
		
		System.out.println("O aluno est�: " + resultadoFinal);
		
	}

}
