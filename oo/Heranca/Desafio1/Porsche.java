package oo.Heranca.Desafio1;

public class Porsche extends Carro implements Esportivo , Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Porsche(){
		this(345);
	}
	
	public Porsche(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void ligarAr(){
		ligarAr = true;
	}
	
	public void desligarAr(){
		ligarAr = false;
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	public void desligarTurbo(){
		ligarTurbo = false;
	}
	
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if( ligarTurbo && ligarAr ) {
		return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	

}
