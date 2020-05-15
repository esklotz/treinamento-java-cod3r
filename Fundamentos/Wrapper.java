package Fundamentos;

public class Wrapper {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;

		// Integer.parseInt(entrada.next());
		Integer i = 10000; // INT
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//Wrapper Float
	
		Float f = 123.10F;
		System.out.println(f);
		
		//Wrapper double
		
		Double d = 1234.567;
		System.out.println(d);
		
		//Wrapper Boolean
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		//System.out.println(bo.toString().toUpperCase());
		
		//Wrapper Character
		
		Character c = '#'; //char
		System.out.println(c + "...");
		

	}
}
