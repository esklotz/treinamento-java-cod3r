package oo.Heranca.Desafio1;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Ferrari();
		
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		
		Porsche c2 = new Porsche(400);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.desligarAr();
		
		System.out.println(c2.nivelDoAr());
		
		c2.acelerar();
		c2.freiar();
		System.out.println(c2);
		c2.acelerar();
		c2.freiar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
	
	}

}
