package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio5_triangulo_rectangulo {
	public static void main(String[] args) {
		int i, j, k;
		int altura = 0;
		int espacios = altura - 1;
		int asteriscos = 1;
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Dime el ancho del triangulo");
	    altura = entrada.nextInt();
	    
	        for (i = 0; i < altura; i++) {
	            for (j = 0; j < espacios; j++)  {
	                System.out.print(" ");
	            }
	            for (k = 0; k < asteriscos; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            
	            asteriscos ++;
	            espacios --;
	            
	        }
		}
	}
	