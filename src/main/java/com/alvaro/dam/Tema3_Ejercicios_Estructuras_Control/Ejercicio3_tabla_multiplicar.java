package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control.copy;
import java.util.Scanner;

public class Ejercicio3_tabla_multiplicar {
	
	public static void main(String[] args) {
		
		int num = 0, i, tabla = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero del 1 al 10");
		num = entrada.nextInt();
		
		System.out.println("La tabla del " + num);
		
		if(num <= 10) {
			
			for(i=1; i<=10; i++) {
				tabla = num * i;
				System.out.println(num + " X " + i + " = " + tabla);
			}
			
		} else {
			System.out.println("Los numeros tienen que estar entre el 1 y el 10");
		}
	}

}
