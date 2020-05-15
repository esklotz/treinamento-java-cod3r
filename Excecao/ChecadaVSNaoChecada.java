package Excecao;

public class ChecadaVSNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception error) {
			System.out.println(error.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!");
	}

	// Não checada ou não verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01");
	}
	
	// Checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02");
	}
}
