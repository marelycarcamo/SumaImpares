/*
 * sumen todos los valores impares desde 0 hasta n, donde n es ingresado por el usuario.
 */
package cl.sumaImpar;

import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		
		int i = 0;
		int n, suma = 0;
		int nroImpar = 0;
		
		System.out.println("Ingrese N: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (nroImpar <= n) {
			suma = suma + nroImpar;
			nroImpar = (i * 2 + 1);
			i++;
		}
		System.out.println(suma);
		sc.close();
	}

}
