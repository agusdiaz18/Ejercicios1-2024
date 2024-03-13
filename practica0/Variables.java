package practica0;

import java.util.Scanner;

public class Variables {
	//Escribir el programa “¡Hola, mundo!”.
	
	public static void saludo() {
		System.out.println("hola mundo");
	}
//Escribir un programa que te pregunte tu nombre y a continuacion imprima un saludo del estilo
	//“Hola nombre”
	
	public static void nombre() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese su nombre");
		String nombre= scan.next();
		System.out.println("hola "+ nombre);
		scan.close();
		
	}
	//Escribir un programa que te pregunte por dos numeros, y a continuacion imprima un mensaje
	//del estilo “La suma es: ” y el valor de la suma de ambos numeros. 
	public static void SumaDeNumeros() {
		Scanner scan= new Scanner(System.in);
		System.out.println("ingrese un numero");
		int numero1 = scan.nextInt();
		System.out.println("ingrese otro numero");
		int numero2= scan.nextInt();
		scan.close();
		int suma= numero1 + numero2;
		System.out.println("la suma es: " + suma);
	}
	/*Escribir un programa que te pregunte por dos n´umeros, y a continuaci´on imprima un mensaje
del estilo “El promedio es: ” y el valor del promedio de ambos numeros.*/
	public static void promedio() {
		Scanner scan= new Scanner(System.in);
		System.out.println("ingrese un numero");
		int numero1 = scan.nextInt();
		System.out.println("ingrese otro numero");
		int numero2= scan.nextInt();
		scan.close();
		int promedio = (numero1 + numero2)/2;
		System.out.println("el promedio es: " + promedio);
	}
}
