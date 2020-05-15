package Colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		 ArrayList<Usuario> lista = new ArrayList<Usuario>();
		 
		 Usuario u1 = new Usuario("Ana");
		 lista.add(u1);
		 
		 lista.add(new Usuario("Molly"));
		 lista.add(new Usuario("Lucas"));
		 lista.add(new Usuario("Maria"));
		 lista.add(new Usuario("Jose"));
		 
		 System.out.println(lista.get(3)); // acessar pelo indice
		 
		 System.out.println(">>" + lista.remove(4));
		 System.out.println(lista.remove(new Usuario("Lucas")));
		 
		 System.out.println(lista.contains(new Usuario("Molly")));
		
		 for(Usuario u: lista) {
			 System.out.println(u); 
		 }
	}

}
