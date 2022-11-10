package com.alvaro.dam.Tema3_Ejercicios;

import java.util.Scanner;

public class Ejercicio4_par_impar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un numero");
		num = entrada.nextInt();
		
		if(num%2== 0) {
			System.out.println("El numero introducido es par"); 
		} else {
			System.out.println("El numero introducido es impar");
				
			}
			
		}

}
