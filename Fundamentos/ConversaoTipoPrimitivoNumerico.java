package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // conversão implicita
		System.out.println(a);
		
		float b = (float) 1.123456; // conversão explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d); // conversão explicita (CAST)
		
		double e = 1.999; //conversao explicita (CAST)
		int f = (int) e;
		System.out.println(f);
		
	}

}
