package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e add = adicionam elementos na fila
		
		// A diferen�a � o comportamento quando a fila esta cheia
		fila.add("Ana"); // retorna false se a fila esta vazia
		fila.offer("Bia"); // lan�a uma exce��o quandp a fila esta vazia
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");
		
		//Peek e element = imprimem os elementos da fila
		
		//Diferen�a � o comportamento que ocorre
		//quando a fila est� vazia...
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma exce��o

		
		// Poll e Remove = obtem o proximo elemento da fila e remove em seguida!
		
		//Diferen�a � o comportamento que ocorre
		//quando a fila est� vazia...
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove()); // lan�a uma exce��o
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
