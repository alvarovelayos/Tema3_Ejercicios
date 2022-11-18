package com.alvaro.dam.Tema3_Ejercicios_Estructuras_Control;
import java.util.Scanner;

public class Ejercicio20_juego_adivina_numero {

	 public static void main(String[] args) {
		 
		    Scanner scanner = new Scanner(System.in);
		    int numeroAleatorio;
		    int intento;
		    int contador = 10;
		    // Obtención de número aleatorio
		    numeroAleatorio = (int) (Math.random()*100+1);
		    System.out.println("Intenta adivinar un numero aleatorio entre el 1 y 100. "
		        + "Tienes 10 intentos.");
		    System.out.println(numeroAleatorio);
		    // Realización del ciclo do-while
		    do {
		      System.out.println("Numero contador: " + contador);
		      System.out.print("Introduce el numero que creas posible: ");
		      intento = scanner.nextInt();
		      if (intento > numeroAleatorio) {
		        System.out.println("El numero que buscas es menor, te quedan "
		            + (contador-1) + " intentos: ");
		      } else if (intento < numeroAleatorio){
		        System.out.println("El numero que buscas es mayor, te quedan "
		            + (contador-1) + " intentos: ");
		      } else {
		        System.out.print("¡CORRECTO! "+ numeroAleatorio + " era el numero que estabas "
		            + "buscando, has necesitado " + (10 - (contador-1)) +" intentos.");
		      }
		      contador--;
		    } while (intento != numeroAleatorio && contador > 0);
		    if (contador == 0) {
		      System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
		    }
		  }
}
