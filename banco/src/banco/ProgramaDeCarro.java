package banco;

public class ProgramaDeCarro {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.modelo ="Corvete";
		carro.cilindradas = 4.2;
		
		
		System.out.println("A cilindrada eh: "+carro.saberACilindradas());
	}

}
