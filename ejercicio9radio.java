package ejercicio9radio;
import java.util.Scanner; 

public class ejercicio9radio {

    static Scanner leer = new Scanner(System.in);
    
    // Encapsulan los datos para que nadie fuera de la clase los altere directamente
    private int vol, estac, encen;

    public ejercicio9radio() { 
        encen = 0;  // El radio inicia apagado (0)
        vol = 3;    // El volumen del radio es 3
        estac = 1;  // Inicia sintonizado en la estación 1
    }

    public void funcionar() {
        int menu = 0; // Variable para guardar la opción elegida
        do {
            // Muestra las opciones visuales 
            System.out.println("\n MENU \n1.-Encender \n2.-Apagar \n3.-Sintonizar \n4.-Subir Volumen \n5.-Bajar Volumen \n6.-Abandonar");
            System.out.print("¿Que accion desea ejecutar?: ");
            menu = leer.nextInt(); // Lee el número ingresado por el usuario

            // Estructura para decidir qué método ejecutar
            switch (menu) {
                case 1: encender(); break;    // Llama al método para prender
                case 2: apagar(); break;      // Llama al método para apagar
                case 3: sintonizar(); break;  // Llama al método para buscar estación
                case 4: subir_vol(); break;   // Llama al método para subir volumen
                case 5: bajar_vol(); break;   // Llama al método para bajar volumen
                case 6: System.out.println("ADIOS"); break;
                default: System.out.println("Opción no válida"); // error 
            }
        } while (menu != 6); // Se repite infinitamente hasta que el usuario elija el 6
    }

    private void bajar_vol() {
        // Si está apagado (0), no hace nada
        if (encen == 0) { 
            System.out.println("IMPOSIBLE, Radio Apagada");
            return; // Corta la ejecución del método 
        }
        int opc = 1;
        // Mientras el volumen sea mayor a cero 
        while (vol > 0 && opc == 1) {
            pintar_lineas(); // Dibuja la barra de volumen actual
            System.out.print("\n¿bajar mas? 1=SI  2=NO: ");
            opc = leer.nextInt();
            if (opc == 1) {
                vol--; // Resta 1 al volumen actual
            }
        }
        // Si el volumen llegó a 0, muestra que ya no hay sonido
        if (vol == 0) {
            pintar_lineas();
        }
    }

    private void subir_vol() {
        //  El radio debe estar encendido para subir volumen
        if (encen == 0) { 
            System.out.println("IMPOSIBLE, Radio Apagada");
            return;
        }
        int opc = 1;
        // Mientras el volumen no supere el límite (10)
        while (vol < 10 && opc == 1) {
            pintar_lineas();
            System.out.print("\n¿subir mas? 1=SI  2=NO: ");
            opc = leer.nextInt();
            if (opc == 1) {
                vol++; // Suma 1 al volumen
            }
        }
        // Aviso de que se llegó al tope max
        if (vol == 10) {
            System.out.println("Volumen Máximo");
            pintar_lineas();
        }
    }

    // Cambia la variable encen a 1 
    private void encender() {
        encen = 1;
        System.out.println("Radio Encendida");
    }

    // Cambia la variable encen a 0 
    private void apagar() {
        encen = 0;
        System.out.println("Radio Apagada");
    }

    private void sintonizar() {
        if (encen == 0) { // Solo sintoniza si hay energía
            System.out.println("IMPOSIBLE, Radio Apagada");
            return;
        }
        System.out.print("Ingrese estación: ");
        estac = leer.nextInt(); // Guarda el número en el atributo estac
        System.out.println("Estación actual: " + estac);
    }

    private void pintar_lineas() {
        System.out.print("Volumen [" + vol + "]: ");
        // Ciclo for que imprime tantas veces como indique la variable 'vol'
        for (int i = 0; i < vol; i++) {
            System.out.print("|");
        }
        System.out.println(); // Salto de línea 
    }

    public static void main(String[] args) {
        // Se crea el objeto 'miRadio' 
        ejercicio9radio miRadio = new ejercicio9radio(); 
        
        // Se llama al método para que el objeto empiece a trabajar
        miRadio.funcionar(); 
    }
} 