package com.alvaro.dam.Tema3_Ejercicios;
import java.util.Scanner;

public class Ejercicio13_ordena_tres_numeros {
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		int a, b, c;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero");
		num2 = entrada.nextInt();
		System.out.println("Introduce el tercer numero");
		num3 = entrada.nextInt();
		
		a = num1;
		b = num2;
		c = num3;
		
		if(num1 > num2 && num2 > num3) {
			a = num1;
			b = num2;
			c = num3;
		} else if (num1 > num3 && num3 > num2){
			a = num1;
			b = num3;
			c = num2;
		} else if(num2 > num1 && num1 > num3){
			a = num2;
			b = num1;
			c = num3;
		} else if (num2 > num3 && num3 > num1) {
			a = num2;
			b = num3;
			c= num1;
		} else if (num3 > num1 && num1 > num2) {
			a = num3;
			b = num1;
			c = num2;
		} else if (num3 > num2 && num2 > num1) {
			a = num3;
			b = num2;
			c = num1;
		}
		System.out.println("Numeros ordenados " + a + " " + b + " " + c);

	}
}