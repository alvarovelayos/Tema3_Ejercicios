package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio9_multiplos_tres_cinco {

	public static void main(String[] args) {
		
		  int num = 0, almacena3 = 0, almacena5 = 0, almacena = 0;
	        
	        Scanner entrada = new Scanner(System.in);
	        
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Introduce un numero: ");
	            num = entrada.nextInt();
	            
	            if(num % 3 == 0){
	                almacena3 = almacena3 + 1;
	            }
	            if(num % 5 == 0) {
	            	almacena5 = almacena5 + 1;
	            }
	            if (num == 5 || num == 3) {
	            	almacena = almacena +1;
	            }
	        }
	       
	        	System.out.println(almacena3 + " multiplos de 3 ");
	        	System.out.println(almacena5 + " multiplos de 5 ");
	        	System.out.println(almacena + " no son multiplos de nada");
	    }
	}
