package ejercicio1triangulo;
// Importa la librería Scanner para poder leer datos 
import java.util.Scanner;
public class ejercicio1triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Declaración de variables enteras para los lados del triángulo
		        int a, b, c;

		        // Se crea el objeto Scanner para leer datos 
		        Scanner leer = new Scanner(System.in);

		        // Solicita el valor del lado a
		        System.out.print("a: ");

		        // Guarda el valor  en la variable a
		        a = leer.nextInt();

		        // Solicita el valor del lado b
		        System.out.print("b: ");

		        // Guarda el valor  en la variable b
		        b = leer.nextInt();

		        // Solicita el valor del lado c
		        System.out.print("c: ");

		        // Guarda el valor en la variable c
		        c = leer.nextInt();

		        // mira si NO se puede formar un triángulo
		        // Si c es mayor que la suma de a + b, no existe triángulo
		        if (c > (a + b))

		            // Muestra mensaje 
		            System.out.println("No es un triángulo.");

		        else

		            // Verifica si es un triángulo rectángulo y Se aplica el teorema de Pitágoras:
		            if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))

		                // Muestra mensaje indicando que es rectángulo
		                System.out.println("Es un triángulo rectángulo");

		            else

		                // Verifica si es un triángulo obtusángulo
		                if (Math.pow(c, 2) > Math.pow(a, 2) + Math.pow(b, 2))

		                    // Muestra mensaje 
		                    System.out.println("Es un triángulo obtusángulo");

		                else

		                    // Verifica si es un triángulo acutángulo
		                    if (Math.pow(c, 2) < Math.pow(a, 2) + Math.pow(b, 2))

		                        // Muestra mensaje 
		                        System.out.println("Es un triángulo acutángulo");
		    }
}
