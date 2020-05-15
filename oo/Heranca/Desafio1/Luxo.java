package oo.Heranca.Desafio1;

public interface Luxo {
	
	public void ligarAr();
	void desligarAr();
	
	default int nivelDoAr() {
		return 1; 
	}

}
