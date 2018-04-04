package conceitos;

public class Vetores {

	public static void main(String[] args) {
		
		int [] array = new int[10];
		int [] vetor = new int[2];
		char[] letras = new char[3];
		int[][] matriz = new int[4][4];

		array[0] = 0;
		array[1] = 2;
		array[2] = 4;
		array[3] = 6;
		array[4] = 8;
		array[5] = 10;
		array[6] = 12;
		array[7] = 14;
		array[8] = 16;
		array[9] = 18;
		
		vetor[0] = 1;
		vetor[1] = 2;
		
		letras[0] ='A';
		letras[1] ='B';
		letras[2] ='C';
		
		
		for(int i=0;i<10;i++){
			System.out.println("Indice "+i+" valor "+ 
						array[i]);
		}
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				matriz[i][j]=i+j ;
			}
		}
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
