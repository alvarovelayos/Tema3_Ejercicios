package com.alvaro.dam.Tema3_Ejercicios;

import java.util.Scanner;

public class Ejercicio8_vocal_consonante {
	
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	char letra;
	
	System.out.println("Introduce una letra");
	letra = entrada.next().charAt(0);
	
	switch(letra) {
	
	case 'a':
		System.out.println(" vocal");
		break;
	case 'e':
		System.out.println(" vocal");
		break;
	case 'i':
		System.out.println(" vocal");
		break;
	case 'o':
		System.out.println(" vocal");
		break;
	case 'u':
		System.out.println(" vocal");
		break;
	case 'A':
		System.out.println(" vocal");
		break;
	case 'E':
		System.out.println(" vocal");
		break;
	case 'I':
		System.out.println(" vocal");
		break;
	case 'O':
		System.out.println(" vocal");
		break;
	case 'U':
		System.out.println(" vocal");
		break;
		default:
			System.out.println(" es una consonante");
	}
		
}
}
