package Classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10;
		
		AreaCirc a2 = new AreaCirc(5);
		//a2.pi = 5;
		
		// AreaCirc.PI = 0.1; (N�o pode mais ser alterada.)
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
	}

}
