package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio5_triangulo_rectangulo {
	public static void main(String[] args) {
		  
		int asteriscos = 1;
	    int espacios = ancho - 1;
	    int ancho;
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Dime el ancho del triangulo");
	    ancho = entrada.nextInt();
	    
	        for (int fila = 0; fila < ancho; fila++) {
	            for (int columnaEspacios = 0; columnaEspacios < espacios; columnaEspacios++)  {
	                System.out.print(" ");
	            }
	            for (int columnaAsteriscos = 0; columnaAsteriscos < asteriscos; columnaAsteriscos++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            
	            asteriscos ++;
	            espacios --;
	            
}
