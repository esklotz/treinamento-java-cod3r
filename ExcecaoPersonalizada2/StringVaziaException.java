package ExcecaoPersonalizada2;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	
	private String nomeDoAtributo;
	
	public StringVaziaException (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
	public String getMessage() {
		return String.format("O atributo '%s' est� vazio.",
				nomeDoAtributo);
	}

}
