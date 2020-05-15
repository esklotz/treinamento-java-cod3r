package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Molly");
		usuarios.put(2, "Estefani");
		usuarios.put(3, "Daniel");
		usuarios.put(4, "Maria");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsValue("Daniel"));
		
		System.out.println(usuarios.get(1));
		System.out.println(usuarios.remove(4));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
		
	}

}
