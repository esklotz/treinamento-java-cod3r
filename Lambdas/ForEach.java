package Lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList
				("Ana" , "Bia", "Lia", "Gui");
	
		
		System.out.println("Forma tradicional:");	
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda versão 1:");
		aprovados.forEach(nome -> 
		System.out.println(nome + "!!!"));
		
		
		System.out.println("\nMethod Reference:");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda versão 2:");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference 2:");
		aprovados.forEach(ForEach::meuImprimir);
	
}
	
	static void meuImprimir (String nome){
		System.out.println("Oi! meu nome é " + nome);
	}
}
