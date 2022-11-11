package com.alvaro.dam.Tema3_Ejercicios;
import java.util.Scanner;
public class Ejercicio6_mes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Introduce un número del 1 al 12");
		mes = entrada.nextInt();
		
		
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("Tiene 31 días");
			break;
		case 2:
			System.out.println("Tiene 28 días");
			break;
		case 4, 6, 9, 11:
			System.out.println("Tiene 30 días");
			break;
			default:
				System.out.println("Error tienes que introducir un número entre el 1 y 12");
		}
	}
}

