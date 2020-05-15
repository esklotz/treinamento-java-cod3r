package EstruturasdeControle;

public class For {
	
	public static void main(String[] args) {
	
		
		for (int contador = 1;  contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
			}
		
		
		// jeito estranho de criar 
		int x = 2;
		for (; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
	
	 //laço infinito
		for (;true;) {
			System.out.println("Fim");
		}
	
	}
}
