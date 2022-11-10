package com.alvaro.dam.Tema3_Ejercicios;
import java.util.Scanner;
public class Ejercicio3_votar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		
		if (edad>=18) {
			System.out.println("Tienes " + edad  + " años " + " eres mayor de edad puedes votar");
		} else {
			System.out.println("Tienes " + edad + " años " + " aun no tienes edad para votar");
		}
	}

}
