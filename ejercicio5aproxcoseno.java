package ejercicio5aproxcoseno;

import java.util.Scanner;

public class ejercicio5aproxcoseno {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        // Declaración de variables para el ángulo (x) y el error
        double x, error;

        // Solicita  el ángulo en grados
        System.out.print("x(grados): ");
        x = leer.nextFloat();

        // Convierte el ángulo  de grados a radianes
        x = (Math.PI * x / 180); 

        // margen de error permitido
        System.out.print("Error permitido: ");
        error = leer.nextFloat();

        // Calcula el valor real del coseno
        double resultado = Math.cos(x);

        // Imprime el valor real del coseno
        System.out.printf("Coseno (x) real = %.4f\n", resultado);

        // Llama al método para generar la tabla
        tabula(x, error, resultado);
        
        // Cierra el scanner
        leer.close();
    }
    
    static void tabula(double x, double err, double res) {
        // Imprime los encabezados de la tabla con tabulaciones para que queden alineados
        System.out.println("\n n \tCos(x) aprox. \tDiferencia");

        // suma: Acumulador de la serie y erra: Variable para calcular el error
        double suma = 1, erra;
        
        // n: El exponente y factorial / itera: Contador de ciclos realizados.
        int n = 2, itera = 0;

        // Calcula la diferencia inicial entre el valor real y la aproximación 
        erra = Math.abs(res - suma);

        // El ciclo se repite mientras la diferencia (error) sea mayor 
        while (erra >= err) {
            // Imprime los datos 
            System.out.printf(" %3d \t %.6f \t %.6f \n", itera, suma, erra);
            
            if (n % 4 == 0) {
                suma += Math.pow(x, n) / factorial(n);
            } else {
                // Si n no es múltiplo de 4 el término debe restarse
                suma += -Math.pow(x, n) / factorial(n);
            }

            // Actualiza el error absoluto comparando el valor real 
            erra = Math.abs(res - suma);
            
            // Incrementa el contador de vueltas
            itera++;
            
            // Salta al siguiente número par para el exponente
            n += 2;
        }

        // Imprime la última fila 
        System.out.printf(" %3d \t %.6f \t %.4f \n", itera, suma, erra);
    }

    static int factorial(int n) {
        // Inicializamos el resultado en 1
        int f = 1;
        
        // Ciclo que multiplica f por cada número consecutivo 
        for (int i = 1; i <= n; i++) {
            f *= i; // Equivale a: f = f * i
        }
        
        // Retorna el resultado
        return f;
    }
}