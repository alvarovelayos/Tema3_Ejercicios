package com.alvaro.dam.Tema3_Ejercicios;
import java.util.Scanner;
public class Ejercicio5_dia_semana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int diaSemana;
		
		System.out.println("Introduce un numero entre 1 y 7");
		diaSemana = entrada.nextInt();
		
		switch (diaSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4: 
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			default:
				System.out.println("Error los días de la semana van del 1 al 7");
		}

	}

}
