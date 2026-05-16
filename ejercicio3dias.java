package ejercicio3dias;
// Importa la librería Scanner para leer datos 
import java.util.Scanner;
public class ejercicio3dias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Variables enteras para guardar el mes y el año
		        int mes = 0, año;

		        Scanner leer = new Scanner(System.in);

		        // Ciclo que se repetirá mientras el usuario no escriba 999
		        while (mes != 999) {

		            // Solicita el número del mes
		            System.out.print("Mes (mm): ");

		            // Guarda el número  en la variable mes
		            mes = leer.nextInt();

		            // Si el usuario escribe 999, el programa termina
		            if (mes != 999) {

		                // Solicita el año
		                System.out.print("Año (aaaa): ");

		                // Guarda el año 
		                año = leer.nextInt();

		                // Verifica si el mes es febrero y el año es bisiesto y si se divide en 4
		                if (mes == 2 && año % 4 == 0)

		                    // Febrero tendrá 29 días
		                    System.out.println("Febrero tiene 29 días");

		                else

		                    //  switch para determinar los días de cada mes
		                    switch (mes) {

		                        // Caso enero
		                        case 1:
		                            System.out.println("Enero tiene 31 días");
		                            break;

		                        // Caso febrero normal
		                        case 2:
		                            System.out.println("Febrero tiene 28 días");
		                            break;

		                        // Caso marzo
		                        case 3:
		                            System.out.println("Marzo tiene 31 días");
		                            break;

		                        // Caso abril
		                        case 4:
		                            System.out.println("Abril tiene 30 días");
		                            break;

		                        // Caso mayo
		                        case 5:
		                            System.out.println("Mayo tiene 31 días");
		                            break;

		                        // Caso junio
		                        case 6:
		                            System.out.println("Junio tiene 30 días");
		                            break;

		                        // Caso julio
		                        case 7:
		                            System.out.println("Julio tiene 31 días");
		                            break;

		                        // Caso agosto
		                        case 8:
		                            System.out.println("Agosto tiene 31 días");
		                            break;

		                        // Caso septiembre
		                        case 9:
		                            System.out.println("Septiembre tiene 30 días");
		                            break;

		                        // Caso octubre
		                        case 10:
		                            System.out.println("Octubre tiene 31 días");
		                            break;

		                        // Caso noviembre
		                        case 11:
		                            System.out.println("Noviembre tiene 30 días");
		                            break;

		                        // Caso diciembre
		                        case 12:
		                            System.out.println("Diciembre tiene 31 días");
		                            break;

		                        // Si el número del mes no existe
		                        default:
		                            System.out.println("Mes inexistente");
		                            break;
		                    }
		            }
		        }
	}

}
