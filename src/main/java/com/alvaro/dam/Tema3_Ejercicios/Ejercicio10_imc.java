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
		
		 imc = peso/(altura)2;
		
		System.out.println("IMC:" + imc);

	if(imc<18.5) {
		System.out.println("Peso inferior al normal");
	} else if (imc>=18.5 & imc<24.9){
		System.out.println("Peso normal");
	} else if (imc>= 25.0 & imc<29.9) {
		System.out.println("Peso superior al normal");
	} else if (imc>30) {
			System.out.println("Tienes obesidad");
		} 
	}
}