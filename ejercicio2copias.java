package ejercicio2copias;
//Importa la librería Scanner para leer datos 
import java.util.Scanner;
public class ejercicio2copias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Variable entera para guardar el número de copias
		        int ncopias;

		        // Variable decimal para guardar el costo 
		        double costo;

		        Scanner leer = new Scanner(System.in);

		        // Solicita el número de copias
		        System.out.print("Número de copias: ");

		        // Guarda el número en la variable ncopias
		        ncopias = leer.nextInt();

		        // Si el número de copias es menor o igual a 100
		        if (ncopias <= 100)

		            // Cada copia cuesta 0.50
		            costo = ncopias * 0.50;

		        else

		            // Si el número de copias está entre 101 y 200
		            if (ncopias > 100 && ncopias <= 200)

		                // Las primeras 100 copias cuestan 0.50 y las demás cuestan 0.35
		                costo = 100 * 0.50 + (ncopias - 100) * 0.35;

		            else

		                // Si el número de copias está entre 201 y 500
		                if (ncopias > 200 && ncopias <= 500)

		                    // Las primeras 100 cuestan 0.50, Las otras 100 cuestan 0.35 y Las restantes cuestan 0.25
		                    costo = 100 * 0.50 + 100 * 0.35 + (ncopias - 200) * 0.25;

		                else

		                    // Si el número de copias es mayor a 50
		                    costo = 100 * 0.50 + 100 * 0.35 + 300 * 0.25 + (ncopias - 500) * 0.20;

		        // Muestra el costo total con 2 decimales
		        System.out.printf("Importe = $%.2f\n", costo);
	}
}
