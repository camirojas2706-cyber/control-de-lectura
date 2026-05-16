package ejercicio6juegorestale;
import java.util.Scanner;
import java.util.Random;  // Importa la clase Random para generar números aleatorios
public class ejercicio6juegorestale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner leer = new Scanner(System.in);
		        Random aleatorio = new Random();

		        String nombre; // Variable para guardar el nombre del jugador
		        int x, n, c;   // x: resta del usuario, n: número actual, c: resta de la computadora

		        // Solicita y lee el nombre
		        System.out.print("Nombre: ");
		        nombre = leer.next();

		        // Genera un número aleatorio entre 10 y 50 
		        n = aleatorio.nextInt(41) + 10;
		        System.out.println("Número generado: " + n);

		        // Ciclo: el juego continúa mientras el número sea mayor a 0
		        while (n != 0) {
		            
		            // Turno del Jugador
		            System.out.print(nombre + " resta: ");
		            x = leer.nextInt();

		            //  solo se puede restar 1, 2 o 3
		            while (x < 1 || x > 3) {
		                System.out.print("No válido " + nombre + " resta: ");
		                x = leer.nextInt();
		            }

		            // Resta el valor al número total
		            n -= x;
		            System.out.println("Número= " + n);

		            // Verifica si el usuario ganó 
		            if (n == 0) {
		                System.out.println("GANÓ " + nombre);
		            } 
		            else {
		                // Turno de la Computadora (solo si n todavía es mayor a 0)
		                
		                // La computadora calcula su resta usando el residuo de 4
		                c = n % 4;
		                
		                // Si el residuo es 0, la computadora resta 2
		                if (c == 0) {
		                    c = 2;
		                }

		                // Resta el valor calculado al número total
		                n -= c;
		                System.out.println("Compu. resta: " + c);
		                System.out.println("Número= " + n);

		                // Verifica si la computadora ganó
		                if (n == 0) {
		                    System.out.println("GANÓ la computadora");
		                }
		            }
		        } // Fin del ciclo 
		        
		        leer.close(); // Cierra el scanner
	}
}
