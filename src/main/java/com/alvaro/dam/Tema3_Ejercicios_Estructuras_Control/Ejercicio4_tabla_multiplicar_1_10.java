package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;

import java.util.Scanner;

public class Ejercicio4_tabla_multiplicar_1_10 {

	public static void main(String[] args) {
		
		int multiplicando = 0, multiplicador = 0;

		while(multiplicando <=10) {
			
			while(multiplicador <= 10) {
				int producto = multiplicando * multiplicador;
				System.out.println(multiplicando + " X " + multiplicador + " = " + producto);
				multiplicador++;
			}
			System.out.println("");
			multiplicador = 1;
			multiplicando++;
		}
			
	
	}
}
	
