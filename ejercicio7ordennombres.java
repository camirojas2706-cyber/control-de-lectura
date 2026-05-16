package ejercicio7ordennombres;
import java.util.Scanner;
public class ejercicio7ordennombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner leer = new Scanner(System.in);
		        int n;

		        // Solicita el tamaño del arreglo
		        System.out.print("n: "); 
		        n = leer.nextInt();
		        
		        // Define el arreglo de cadenas (String) con el tamaño 'n'
		        String a[] = new String[n]; 
		        
		        // Llama al método para llenar el arreglo
		        leerlos(a);  
		        
		        // Llama al método de ordenamiento (Burbuja)
		        ordenalos(a); 
		        
		        // Imprime el resultado 
		        System.out.println("Ordenados: ");
		        imprime(a);   
		        
		        leer.close(); // Cierra el scanner
		    }

		    static void leerlos(String [] a) {
		        // Se crea un scanner  para la lectura de texto
		        Scanner leer = new Scanner(System.in);
		        String nombre;
		        
		        System.out.println("Dame los " + a.length + " nombres: ");
		        
		        // Ciclo para recorrer cada posición del arreglo
		        for (int i = 0; i < a.length; i++) {
		            // Lee la línea completa escrita 
		            nombre = leer.nextLine(); 
		            // Convierte el nombre a mayúsculas
		            nombre = nombre.toUpperCase(); 
		            // Guarda el nombre en la posición 'i' del arreglo
		            a[i] = nombre; 
		        }
		        System.out.println();
		    }

		    static void ordenalos(String [] a) {
		        // i: interruptor de cambios, c: límite de comparación, x: índice de recorrido
		        int i = 1, c, x;
		        String t; // Variable temporal para el intercambio
		        
		        c = a.length;
		        
		        // hubo al menos un intercambio en la vuelta anterior
		        while (i > 0) {
		            i = 0;   // Reinicia el interruptor
		            c = c - 1; // el último elemento queda ordenado en cada vuelta
		            x = 0;   // Inicia desde el primer elemento
		            
		            // Recorre el arreglo comparando pares adyacentes
		            while (x < c) {
		                //  si la cadena actual es alfabéticamente menor o igual
		                if (a[x + 1].compareTo(a[x]) <= 0) {
		                    // Proceso de intercambio 
		                    t = a[x];
		                    a[x] = a[x + 1];
		                    a[x + 1] = t;
		                    
		                    // Marca que se realizó un cambio
		                    i++;
		                }
		                x++; // Pasa al siguiente par
		            }
		        }
		    }

		    
		    static void imprime(String [] a) {
		        // Recorre todo el arreglo desde la posición 0
		        for (int i = 0; i < a.length; i++) {
		            // Imprime cada nombre en una línea nueva
		            System.out.println(a[i]);
		        }
	}
}
