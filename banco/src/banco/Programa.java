package banco;

public class Programa {
	
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000.00;
		
		System.out.println("Saldo atual: "+minhaConta.saldo);
		
		minhaConta.saca(250.00);
		
		System.out.println("Saldo atual: "+minhaConta.saldo);
		
		minhaConta.saca(100);
		
		System.out.println("Saldo atual: "+minhaConta.saldo);
		
		minhaConta.deposita(1450.68);
		minhaConta.saca(900.00);
		
		Conta conta2 = new Conta();
		
		conta2.deposita(700.00);
		conta2.saca(400.00);
		
		
		
		
		
		
		
	}

}
