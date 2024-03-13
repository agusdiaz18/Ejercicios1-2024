package practica0;

public class metodos {
	/*
	 * Escribir un metodo static void imprimirSuma(int a, int b) que al igual que el
	 * ejercicio 3 imprima la suma de los dos par´ametros. Modificar el programa de
	 * dicho ejercicio para que utilice este metodo.
	 */
	public static void imprimirSuma(int a, int b) {
		int suma = a + b;
		System.out.println("la suma es: " + suma);
	}

	/*
	 * An´alogamente al ejercicio anterior, escribir un m´etodo static void
	 * imprimirPromedio(int a, int b) que imprima el promedio de los dos par´ametros
	 */
	public static void imprimirPromedio(int a, int b) {
		int promedio = (a + b) / 2;
		System.out.println("el promedio de ambos numeros es: " + promedio);
	}

	/*
	 * Escribir un metodo static void ponerNota(double x, double y) que toma dos
	 * n´umeros decimales y los promedia. En caso que el promedio sea mayor o igual
	 * a 7, deber´a imprimir ‘‘Promocionado’’, si es mayor o igual a 4 pero menor
	 * que 7, imprime ‘‘Aprobado’’ y si es menor que 4 imprime ‘‘Debe recuperar’’.
	 * Probarla llam´andola desde el main con distintos n´umeros. Luego, pedirle
	 * ambos n´umeros al usuario (usando nextFloat() del Scanner) para pas´arselos a
	 * ponerNota
	 */
	public static void ponerNota(double x, double y) {
		double promedio = (x + y) / 2;
		if (promedio >= 7) {
			System.out.println("promocionado");
		}

		else if (promedio >= 4 && promedio < 7) {
			System.out.println("aprobado");
		} else {
			System.out.println("debe recuperar");
		}
	}

	/*
	 * Escribir un metodo static void imprimirFecha(int dia, int mes, int anio) que
	 * imprime la fecha pasada como par´ametro en formato del estilo “5 de Julio de
	 * 2030”.
	 */
	public static void imprimirFecha(int dia, int mes, int anio) {
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		String mesNombre = meses[mes - 1];
		System.out.println(dia + " de " + mesNombre + " de " + anio);
	}

	/*
	 * Escribir un metodo static int sumatoria(int n) que devuelve la sumatoria de
	 * los numeros desde 1 hasta n
	 */
	public static int sumatoria(int n) {
		int sumatoria = 0;
		for (int i = 1; i <= n; i++) {
			sumatoria = sumatoria + i;
		}
		return sumatoria;
	}

	/*
	 * Escribir un m´etodo static int sumatoriaPares(int n) que devuelve la
	 * sumatoria de los numeros pares desde 2 hasta n.
	 */
	public static int sumatoriaPares(int n) {
		int sumatoria = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				sumatoria = sumatoria + i;
			}
		}
		return sumatoria;
	}

	/*
	 * Escribir un m´etodo static double potencia(double x, int a) que toma un
	 * n´umero racional x y un entero a y calcula x a .
	 */
	public static double potencia(double x, int a) {
		return Math.pow(x, a);
	}
/*Escribir un m´etodo static double factorial(int n) que toma un entero positivo n y calcula
n! (el factorial de n) que se define como el producto de todos los naturales desde 1 hasta n. Por
ejemplo 5! = 5 × 4 × 3 × 2 × 1 = 120. Ojo: por definici´on, el factorial de 0, es 1 (0! = 1).

 * */
	public static double factorial(int n) {
		
	}
}
