import java.util.Arrays;


public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] meses = {"Enero", "febrero","marzo", "Abril",
				"mayo", "junio", "julio", "agosto", "septiembre", 
				"octubre", "noviembre",
				"diciembre"};
		
		
		System.out.println(meses[2]);
		System.out.println(meses.length);
		
		for (int i = 0; i < meses.length; i++) {
			System.out.println(meses[i]);	
		}
		//meses[11]= "december";
		//meses[12]= "otro";
		//System.out.println(meses[12]);
		System.out.println("====000000=================");
		
		for (String mes : meses) {//el primer parametr 
			//siempre va en singular pasa saber que es lo que lo que ssta haciendo 
			System.out.println(mes.toUpperCase());
		}
		int []nums= new int [5];
		nums [0]=1;
		nums [1]=2;
		nums [2]=3;
		nums [3]=4;
		nums [4]=5;
		
		System.out.println("====================================");

		for(int num: nums) {
			System.out.println(num);
			
		}
		
		nums =Arrays.copyOf(nums, 7);///cambia la longitud del array
		nums[5]=32;
		System.out.println(nums.length);//7

	}//main

}//clase
