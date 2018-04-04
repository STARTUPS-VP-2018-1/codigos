package banco;

public class Conta {
	
	int numero;
	String titular;
	double saldo;
	
	void saca(double quantidade){
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}

	void deposita(double valorDoDeposito){
		this.saldo+=valorDoDeposito;
	}
	
}
