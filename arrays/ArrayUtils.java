package arrays;

import java.util.Arrays;

public class ArrayUtils {


	public static void main(String[] args) {

		int[] numeros = {1, 3, 5, 7, 9};
		System.out.println(Arrays.toString(numeros));

		desplazarIzquierdad(numeros);
		
		System.out.println(Arrays.toString(numeros));
		
	}
	
	
	public static void desplazarDerecha(int[] numbers) {
		if (numbers.length>0) {
			int ultimo = numbers[numbers.length-1];
			
			for(int i = numbers.length-2; i>=0; i--) {
				numbers[i+1]=numbers[i];
			}
			numbers[0]=ultimo;
		}
	}
	
	
	public static void desplazarIzquierdad(int[] nums) {
		if (nums.length>0) {
			
			int primero = nums[0];
			
			for(int i =1; i<nums.length; i++) {
				nums[i-1]=nums[i];
			}
			nums[nums.length-1]=primero;
			
		}
	}

}


