package conceitos;

public class Iteracao {
	
	public static void main(String[] args) {
		int contador = 10;
		
		for(int i=0;i<contador;i++){
			System.out.println("Numero: "+i);
		}
		
		while(contador<100){
			System.out.println("Numero: "+contador);
			contador++;
		}
		
		do{
			System.out.println("Numero: "+contador);
			contador++;
		}while(contador<100);
	}
}
