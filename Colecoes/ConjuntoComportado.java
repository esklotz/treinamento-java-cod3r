package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
	//	Set<String> lista = new HashSet<>(); Outra maneira de escrever
	//	Set<String> listaAprovados = new HashSet<String>();
		
		Set<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Estefani");
		listaAprovados.add("Daniel");
		listaAprovados.add("Julia");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}  
}
