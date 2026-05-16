package ejercicio8diferencias;
import java.util.Scanner;
public class ejercicio8diferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner leer = new Scanner(System.in);
		        
		        // Variables para almacenar los dos números que tienen la mayor diferencia
		        int a = 0, b = 0;

		        // Solicita la cantidad de números que desea ingresar
		        System.out.print("n: ");
		        int n = leer.nextInt();

		        // Crea un arreglo de enteros con el tamaño 'n' 
		        int arreglo[] = new int[n];

		        // Ciclo para llenar el arreglo con los números 
		        System.out.println("Dame los " + n + " números:");
		        for (int i = 0; i < n; i++) {
		            arreglo[i] = leer.nextInt(); // Guarda cada número en su posición
		        }

		        // Variable para llevar el registro de cuál ha sido la diferencia más grande
		        int diferencia = 0;

		        System.out.println("Diferencia entre consecutivos: ");
		        
		        //  Encontrar el valor de la diferencia más grande
		        for (int x = 0; x < (n - 1); x++) {
		            // Calcula el valor absoluto de la resta entre dos números
		            int calculoDiferencia = Math.abs(arreglo[x] - arreglo[x + 1]);
		            
		            // Imprime la diferencia actual
		            System.out.println(calculoDiferencia);

		            // Si la diferencia recién calculada es mayor a la que teníamos guardada, se actualiza
		            if (calculoDiferencia > diferencia) {
		                diferencia = calculoDiferencia;
		            }
		        }

		        // Identificar qué números generaron esa diferencia mayor
		        for (int x = 0; x < (n - 1); x++) {
		            // Volvemos a calcular la diferencia entre los mismos pares
		            int calculoDiferencia2 = Math.abs(arreglo[x] - arreglo[x + 1]);
		            
		            // Si esta diferencia es igual a la máxima encontrada 
		            if (calculoDiferencia2 == diferencia) {
		                // Guardamos los dos números originales en las variables a y b
		                a = arreglo[x];
		                b = arreglo[x + 1];
		            }
		        }

		        // Muestra el resultado final
		        System.out.println("La diferencia mayor es " + diferencia + " y está entre el " + a + " y el " + b);
		        
		        leer.close(); //cierra el scanner
		    }
	}
