package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control.copy;
import java.util.Scanner;

public class Ejercicio1_media {
	public static void main(String[] args) {
		
		int num = 0;
		double numeros, suma = 0, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos numeros quieres introducir?");
		num = entrada.nextInt();
		
		for(int i = 0; i<num; i++) {
			System.out.println("Introduce un numero");
			numeros = entrada.nextDouble();
			suma = suma + numeros;
		}
		
		media = suma/num;
			System.out.println("La media total es: " + media);
		
	}

}
