package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e add = adicionam elementos na fila
		
		// A diferença é o comportamento quando a fila esta cheia
		fila.add("Ana"); // retorna false se a fila esta vazia
		fila.offer("Bia"); // lança uma exceção quandp a fila esta vazia
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");
		
		//Peek e element = imprimem os elementos da fila
		
		//Diferença é o comportamento que ocorre
		//quando a fila está vazia...
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção

		
		// Poll e Remove = obtem o proximo elemento da fila e remove em seguida!
		
		//Diferença é o comportamento que ocorre
		//quando a fila está vazia...
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove()); // lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		
//		fila.clear();
//		fila.size();
//		fila.isEmpty();
//		fila.contains(...);

	}

}
