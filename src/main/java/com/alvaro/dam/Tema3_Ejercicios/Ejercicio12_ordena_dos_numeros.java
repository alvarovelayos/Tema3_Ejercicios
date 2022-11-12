package com.alvaro.dam.Tema3_Ejercicios;
import java.util.Scanner;

public class Ejercicio12_ordena_dos_numeros {

	public static void main(String[] args) {
		
		int num1, num2;
		int a, b;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = entrada.nextInt();
		
		a = num1;
		b = num2;
		
		if(num1 > num2) {
			a = num1;
		} else if (num1 < num2){
			a = num2;
			b = num1;
		} 	
		
		
		System.out.println("Numeros ordenados " + a + " " + b);
	}
}
