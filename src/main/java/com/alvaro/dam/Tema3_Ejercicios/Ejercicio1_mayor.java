package com.alvaro.dam.Tema3_Ejercicios;
import java.util.Scanner;
public class Ejercicio1_mayor {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Introduce un numero");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = entrada.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num2>num1) {
				System.out.println(num2 + " es mayor que " + num1);
		} else {
			System.out.println(num1 + " es igual que " + num2);
			}
		}
}