package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio14_descomponer_numero_factores_primos {

	public static void main (String [ ] args) {
		
		int numero;
        int num =2;
        
		Scanner entrada = new Scanner(System.in);
        
		System.out.println("Escribe un numero para sacar sus factores primos");
        numero = entrada.nextInt();

         while(numero!=1)
         {
              while(numero%num==0)
              {
                   System.out.println(num);
                   numero /= num;
              }
              num++;
         }
    }
}
