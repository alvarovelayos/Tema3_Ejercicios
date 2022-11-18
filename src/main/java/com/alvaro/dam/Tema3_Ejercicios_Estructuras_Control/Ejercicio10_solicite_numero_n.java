package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio10_solicite_numero_n {

	public static void main(String[] args) {
	        
		int num = 0, altura = 0, i =0;
		
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Introduce un numero");
	    altura = entrada.nextInt();
	    
	    for (num=1; num<=altura; num++) { 
	    	for(i=1; i<=num; i++) {
	    		System.out.print(i);
	    	}
	    	System.out.println(" ");
	    }
	}
}