package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control.copy;

public class Ejercicio2_numeros_pares {

	public static void main(String[] args) {
		
		int i, pares;
		
		System.out.println("Los numeros pares de 1 al 100");
		
		for(i=0; i<=100; i++) {
			pares = i++;
			System.out.println(pares);	
		}
	}
}
