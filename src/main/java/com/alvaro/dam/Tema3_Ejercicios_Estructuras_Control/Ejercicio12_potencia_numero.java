package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;

import java.util.Scanner;

public class Ejercicio12_potencia_numero {

	public static void main(String[] args) {
		
		int base= 0, potencia= 0;
		int result = 1;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la base");
		base = entrada.nextInt();
		System.out.println("Introduce la potencia");
		potencia = entrada.nextInt();
		
		if(base>0) {
			while (potencia != 0) {
				result = result * base;
				potencia--;
			}
			System.out.println("Resultado: " + result);	
		} else if(base<0) {
			while (potencia != 0) {
				result = 1/(result * base);
				potencia--;
			}
			System.out.println("Resultado: " + result);
			
		} else {
			System.out.println("El resutaldo es: 1");
		}
		
	}
}
