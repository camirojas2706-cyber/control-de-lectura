package ejercicio4palindromoo;
//Importa la librería Scanner para leer datos 
import java.util.Scanner;
public class ejercicio4palindromoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner leer = new Scanner(System.in);

		        // Variable para guardar la frase 
		        String frase;

		        // Solicita una frase 
		        System.out.print("Dame frase: ");

		        // Guarda la frase
		        frase = leer.nextLine();

		        // Ciclo que se repetirá hasta que el usuario escriba "finalizar"
		        while (!(frase.equals("finalizar"))) {

		            // Elimina los espacios de la frase original
		            String frase1 = quitaespacios(frase);

		            // Invierte la frase original
		            String b = inviertela(frase);

		            // Elimina los espacios de la frase invertida
		            String frase2 = quitaespacios(b);

		            // Compara la frase original sin espacios con la invertida sin espacios
		            if (frase1.equals(frase2))

		                // Si son iguales, es palíndroma
		                System.out.println(b + " => es frase palíndroma");

		            else

		                // Si no son iguales, no es palíndroma
		                System.out.println(b + " => no es frase palíndroma");

		            // Solicita otra frase
		            System.out.print("Dame frase: ");

		            // Guarda la frase
		            frase = leer.nextLine();
		        }
		    }

		    // Función para invertir una cadena
		    static String inviertela(String b) {

		        // Crea un objeto StringBuilder con la cadena original
		        StringBuilder invierte = new StringBuilder(b);

		        // Invierte la cadena y la convierte nuevamente en String
		        String cad2 = invierte.reverse().toString();

		        // cadena invertida
		        return cad2;
		    }

		    // Función para quitar espacios de una cadena
		    static String quitaespacios(String a) {

		        // Variable para guardar la nueva cadena sin espacios
		        String sinesp = "";

		        // Elimina espacios al inicio y final de la cadena
		        a = a.trim();

		        // Calcula longitud de la cadena
		        int longitud = a.length();

		        // Variable para recorrer la cadena
		        int i = 0;

		        // Ciclo para recorrer cada carácter
		        while (i < longitud - 1) {

		            // Extrae una letra de la cadena
		            String letra = a.substring(i, i + 1);

		            // Verifica si la letra NO es un espacio
		            if (!(letra.equals(" ")))

		                // Concatena la letra a la nueva cadena
		                sinesp = sinesp.concat(letra);

		            // Incrementa el contador
		            i++;
		        }

		        // Retorna la cadena sin espacios
		        return sinesp;
	}
}
