
public class MatrizDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [][]= {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14}
		};
	
	System.out.println(matriz[1][3]);
	
		for (int ren=0; ren <matriz.length;ren++) {///escribe todos los numeros de lamatri. 
			for(int col=0; col<matriz[ren].length;col++) {
				System.out.println(matriz[ren][col]+ ", ");
				
			}
			System.out.println();//da un salto de linea
		}
	}//main

}
