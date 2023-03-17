package arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		numeros[0] = 7;
		numeros[1] = 8;
		numeros[2] = 10;
		numeros[3] = 12;
		numeros[4] = 7;
		numeros[5] = 14;
		numeros[6] = 21;
		numeros[7] = 28;
		numeros[8] = 32;
		numeros[9] = 45;

		for (int i = numeros.length-1; i >=0; i--) {
			System.out.println(numeros[i]);
		}
	}

}
