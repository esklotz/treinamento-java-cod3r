package Classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
	Data d1 = new Data(26, 03, 1997);
	//d1.dia = 26;
	//d1.mes = 03;
	//d1.ano = 1997;
	
	String dataFormatada1 = d1.obterDataFormatada();
	System.out.println(dataFormatada1);
	
	var d2 = new Data();
	//d2.dia = 26;
	//d2.mes = 03;
	//d2.ano = 1997;
	
	System.out.println(d2.obterDataFormatada());

	
	}

}
