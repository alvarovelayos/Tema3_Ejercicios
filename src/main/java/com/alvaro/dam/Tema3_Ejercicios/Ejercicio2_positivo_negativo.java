package com.alvaro.dam.Tema3_Ejercicios;
import java.util.Scanner;
public class Ejercicio2_positivo_negativo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un numero");
		num = entrada.nextInt();
		
		if(num >=0) {
			System.out.println(num + " es un numero positivo");
		} else {
			System.out.println(num + " es un numero negativo");
		}

	}

}
