public class C022Arrays01 {
    public static void main(String[] args) {

        // Declaración de un array de enteros con tamaño fijo
        int[] numeros = new int[5];

        //Forma alternativa:
        int numeros2[] = new int[5];
        int[] números3={10, 20, 30, 40, 50};

        // Asignación de valores al array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Obtener la longitud del array
        int longitud = numeros.length;
        System.out.println("La longitud del array es: " + longitud);

        // Acceso a los valores del array
        System.out.println("El primer número es " + numeros[0]);
        System.out.println("El tercer número es " + numeros[2]);

        // Declaración e inicialización de un array de Strings
        String[] nombres = {"Juan", "María", "Pedro", "Lucía"};

        // Recorrido del array con un bucle for-each
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        // Declaración de un array de objetos
        Persona[] personas = new Persona[3];

        // Asignación de valores al array de objetos
        personas[0] = new Persona("Juan", 25);
        personas[1] = new Persona("María", 30);
        personas[2] = new Persona("Pedro", 40);

        // Acceso a los valores del array de objetos
        System.out.println("La edad de " + personas[1].getNombre() + " es " + personas[1].getEdad());

        // Modificar un elemento del array
        numeros[3] = 35;
        System.out.println("El cuarto número en el array es ahora: " + numeros[3]);

        // Declaración e inicialización de un array bidimensional
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Acceso a los valores de la matriz
        System.out.println("El valor en la posición (2,1) de la matriz es " + matriz[1][0]);

        // Buscar un elemento específico en un array
        int valorBuscado = 30;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El valor " + valorBuscado + " fue encontrado en el array.");
        } else {
            System.out.println("El valor " + valorBuscado + " no fue encontrado en el array.");
        }

    }

    // Clase Persona para el ejemplo de array de objetos
    private static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }
}

/*

 */