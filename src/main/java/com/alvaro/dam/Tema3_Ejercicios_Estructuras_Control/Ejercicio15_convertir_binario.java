package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio15_convertir_binario {

	public static void main(String[] args) {
		
		int numero = 0, exp = 0, digito = 0;
        int binario = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero = entrada.nextInt();
        
        while(numero!=0){
                digito = numero % 2;           
                binario = (int) (binario + digito * Math.pow(10, exp));                                                   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario " + binario);
    }

	}

