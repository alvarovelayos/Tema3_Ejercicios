package com.alvaro.dam.Tema3_Ejercicios;
import java.util.Scanner;

public class Ejercicio7_estado_civil {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Introduce una de las siguientes letras s, c, d, v");
		letra = entrada.next().charAt(0);
		
		switch (letra) {
		case 's':
			System.out.println("Su estado civil es soltero");
			break;
		case 'c':
			System.out.println("Su estado civil es casado");
			break;
		case 'd':
			System.out.println("Su estado civil es divorciado");
			break;
		case 'v':
			System.out.println("Su estado civil es viudo");
			break;
			default:
				System.out.println("Error no existe esa opcion pruebe con s, c, d, v");
			
		}
		
		
		
	}
}
