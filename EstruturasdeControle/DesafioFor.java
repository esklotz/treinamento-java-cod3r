package EstruturasdeControle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		int valor2 = "#####".length();
		
		for( int i = "#".length(); i <= valor2; i++) {
		System.out.println(valor);
		valor += "#";
		}
	
		// resposta do professor
	for( String v = "#"; !v.equals("######"); v +="#") {
		System.out.println(v);
		}
	}
        
}


