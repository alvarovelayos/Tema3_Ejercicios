package com.alvaro.dam.Tema3_Ejercicios;
import java.util.Scanner;

public class Ejercicio10_imc {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float peso, altura;
		float imc;
		
		System.out.println("Introduce tu peso");
		peso = entrada.nextFloat();
		
		System.out.println("Introduce la altura");
		altura = entrada.nextFloat();
		
		 imc = peso/altura;
		
		System.out.println("IMC:" + imc);
	}

}
