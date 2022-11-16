package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio6_menu {
	
	public static void main(String[] args) {
		int opcion;
		
		System.out.println("Elige una de las siguientes opciones");
		System.out.println("1-) Tabla de multiplicar");
		System.out.println("2-) Producto por sumas");
		System.out.println("3-) Mostrar numeros comprendidos");
		System.out.println("4-) Salir");
		
		Scanner entrada = new Scanner(System.in);
		opcion = entrada.nextInt();
		
		switch(opcion){
		case 1:
			System.out.println("Tabla de multiplicar");
			int num = 0, i, tabla = 0;
			
			Scanner entradaMultiplicar = new Scanner(System.in);
			
			System.out.println("Introduce un numero del 1 al 10");
			num = entradaMultiplicar.nextInt();
			
			System.out.println("La tabla del " + num);
			
			if(num <= 10) {
				
				for(i=1; i<=10; i++) {
					tabla = num * i;
					System.out.println(num + " X " + i + " = " + tabla);
				}
				
			} else {
				System.out.println("Los numeros tienen que estar entre el 1 y el 10");
			}
			break;
		case 2:
			System.out.println("Productos por sumas");
			
			int num1, num2, suma;
			
			Scanner entradaSuma = new Scanner(System.in);
			System.out.println("Introduce el primer numero");
			num1 = entradaSuma.nextInt();
			System.out.println("Introduce el segundo numero");
			num2 = entradaSuma.nextInt();
			
			suma = num1 + num2;
			
			System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
			break;
		case 3:
			System.out.println("Mostrar numeros comprendidos");
			
			int nume1, nume2 = 0;
			
			Scanner entradaComprendidos = new Scanner(System.in);
			System.out.println("Introduce el primer numero");
			nume1 = entradaComprendidos.nextInt();
			
			
			while (nume1>=nume2) {
				System.out.println("Introduce el segundo numero");
				nume2 = entradaComprendidos.nextInt();
			}
			
			System.out.println("Los numeros comprendidos entre " + nume2 + " " + nume1);
			
			while (nume2 >= nume1) {
				System.out.println(nume2);
				nume2 = nume2 -1;
			}
			
			
			
			break;
		case 4:
			System.out.println("Hasta pronto.......");
			break;
			default:
				System.out.println("La opcion elegida no esta disponible escriba del 1 al 4");
			
		}
		
	}
	
}
