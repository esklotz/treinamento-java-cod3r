package oo.Composi��o;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaligado());
		
		c1.ligar();
		System.out.println(c1.estaligado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		
		// Falta Encapsulamento
		//c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		// Rela��o bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
		
	}

}
