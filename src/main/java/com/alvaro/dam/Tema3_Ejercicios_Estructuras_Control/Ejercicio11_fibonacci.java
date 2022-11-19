package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio11_fibonacci {
	public static void main(String[] args) {
		
		int a = 0, b = 1, c, num, i;
	    
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Introduce un numero: ");
        num = entrada.nextInt();
       
        for (i = 0; i < num; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
 }

}
