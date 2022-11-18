package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio18_muestra_figura {

public static void main(String[] args) {
	
	int altura=0;
	int numeroespacios, numeroasteriscos;
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduce una altura");
    altura = entrada.nextInt();
	
    for (numeroespacios=altura, numeroasteriscos=1; numeroasteriscos<=(altura*2)-1;numeroespacios--, numeroasteriscos+=2){
        //Espacios
        for (int i=0; i<numeroespacios;i++){
            System.out.print(" ");
        }
        //Asteriscos
        for (int j=numeroasteriscos; j!=0;j--){
            System.out.print(8);
        }
        System.out.println("");
    }
}
}
