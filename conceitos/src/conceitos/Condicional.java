package conceitos;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Condicional {

	public static void main(String agrs[]){
		
		int primeiroNumero = 1;
		int segundoNumero  = 2;
		int terceiroNumero = 3;
		boolean flag=false;
		
		if(primeiroNumero <= segundoNumero || flag){
			System.out.println("Verdadeiro");
		}
		
		if(segundoNumero <= segundoNumero && false){
			System.out.println("Verdadeiro");
		}
		
		if(Boolean.TRUE){
			System.out.println("Verdadeiro");
		}
		
		if(true){
			System.out.println("Falso");
		}
		
	}
}
