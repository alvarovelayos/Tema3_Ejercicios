package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;

import java.util.Scanner;

public class Ejercicio8_lee_numeros_hasta_cinco_ceros {

	public static void main(String[] args) {
		
	int num = 0;
	int cantidadCeros = 0;
	int suma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while (cantidadCeros != 5) {
			System.out.println("Introduce un numero");
			num = entrada.nextInt();
			
			if(num == 0) {
				cantidadCeros = cantidadCeros + 1;
			}
			suma = suma + num;
		}
		
		System.out.println("La suma total de los numeros introducidos es: " + suma);

	}

}