package Operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
	//	PARA FAZER ALGUM NUMERO ELEVADO A OUTRO
	//	int a = 3 * 4 - 10;
	//	int b = (int) Math.pow(a, 3);
	//	double c = Math.pow (a, 3);
		
	//	System.out.println(b);
	//	System.out.println(c);   
		
		int a = 6 * (3 + 2);
		int b = (int) Math.pow(a, 2);
		int c = 3 * 2;
		
		int d = (1 - 5) * (2 - 7) / 2;
		int e = (int) Math.pow(d, 2);
		
		int f = b / c - e;
		int g = (int) Math.pow(f, 3);
		System.out.println(g);
		
		int h = (int) Math.pow(10, 3);
		System.out.println(h);
		
		int i = g / h;
		System.out.println("O Resultado é: " + i);	
		
		// como o professor fez:
		//double numA = Math.pow(6 * (3 + 2), 2);
		//double denA = 3 * 2;
		
		//double numB = (1 - 5) * (2 - 7);
		//double denB = 2;
		
		//double superiorA = numA / denA;
		//double superiorB = Math.pow(numB / denB, 2);
		
		//double superior = Math.pow(superiorA - superiorB , 3);
		//double inferior = Math.pow(10, 3);
		
		//double resultado = superior / inferior;
		
		//System.out.println(resultado);
		
		
	}

}
