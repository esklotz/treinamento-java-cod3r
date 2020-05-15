package Operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		
//comparação entre os dois vai ser (primeiro incrementa 1 no a 
//e depois faz a comparação com b e só depois ele vai tirar 1 do b
//por isso o valor é verdadeiro (pq eles ficam iguais antes de comparar)
		System.out.println("Mini Desafio: ");
		System.out.println( ++a == b--); 
		System.out.println(a);
		System.out.println(b);
	}
	
}
