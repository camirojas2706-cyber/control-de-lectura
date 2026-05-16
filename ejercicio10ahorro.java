package ejercicio10ahorro; // Define el paquete al que pertenece la clase

public class ejercicio10ahorro {

    static class AHORRO {
        //  el saldo solo puede ser modificado por los métodos de esta clase
        private int cantidad;

        AHORRO(int inicial) {
            //  verifica si el monto de apertura es válido
            if (inicial >= 0) {
                // Asigna el valor del parámetro al atributo 
                this.cantidad = inicial;
            } else {
                // Si el usuario ingresa un número negativo, se aplica una regla de negocio
                this.cantidad = 150;
            }
        }
        public void ahorrar(int cant) {
            //  solo se permiten depósitos de cantidades positivas
            if (cant <= 0) {
                // Si la cantidad es 0 o menor, el método termina inmediatamente 
                return;
            } else {
                // suma 'cant' al valor actual de 'cantidad'
                this.cantidad += cant;
            }
        }

        public int retirar(int cant) {
            // Variable local para almacenar lo que vamos a devolver
            int x = 0;

            //  Si el usuario pide más dinero del que tiene ahorrado
            if (cant > cantidad) {
                // Guardamos el max disponible para entregarlo
                x = cantidad;
                // La cuenta se queda vacía
                this.cantidad = 0;
                // Devolvemos el total que había en la cuenta
                return x;
            } 
            // Si el usuario pide una cantidad válida y tiene saldo suficiente
            else if (cant > 0) {
                // Restamos el monto  del saldo total
                this.cantidad -= cant;
                // Devolvemos exactamente lo que la persona pidió
                return cant;
            } 
            // Si la cantidad solicitada no es lógica (cero o negativa)
            else {
                // No se hace ningún retiro y se devuelve cero
                return 0;
            }
        }
        
        public void mostrar_ahorro() {
            // Concatena texto con el valor del atributo cantidad
            System.out.println("Al momento tienes un ahorro de $" + this.cantidad + " pesos");
        }
    }
}
