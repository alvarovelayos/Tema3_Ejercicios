package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio7_numero_negativo {
	
	public static void main(String[] args) {
		
		int num=0;
		int numAnterior=0;
		int salida = 0;
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Introduce un numero");
			num = entrada.nextInt();
			
			if(num == numAnterior) {
				numAnterior = num;
				salida = salida + 1;
			}
		} while (num > 0);
		
		numAnterior = num;
	 if (salida>0) {
		 System.out.println("Si");
	 } else {
		 System.out.println("No");
	 }
	}
}
