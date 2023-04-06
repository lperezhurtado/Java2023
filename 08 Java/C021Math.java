

public class C021Math {
    public static void main(String[] args) {

        // Ejemplo del método abs()
        int x = -5;
        int absX = Math.abs(x); // Devuelve el valor absoluto de x (es decir, sin signo)
        System.out.println("El valor absoluto de " + x + " es " + absX);

        // Ejemplo del método pow()
        double base = 2.0;
        int exponente = 3;
        double potencia = Math.pow(base, exponente); // Devuelve la base elevada al exponente
        System.out.println(base + " elevado a la " + exponente + " es " + potencia);

        // Ejemplo del método sqrt()
        double y = 25.0;
        double raizCuadradaY = Math.sqrt(y); // Devuelve la raíz cuadrada de y
        System.out.println("La raíz cuadrada de " + y + " es " + raizCuadradaY);

        // Ejemplo del método random()
        double numeroAleatorio = Math.random(); // Devuelve un número aleatorio entre 0 y 1
        System.out.println("Número aleatorio entre 0 y 1: " + numeroAleatorio);

        // Ejemplo del método ceil()
        double decimal = 3.3;
        double enteroSuperior = Math.ceil(decimal); // Devuelve el entero superior más cercano al decimal
        System.out.println("El entero superior de " + decimal + " es " + enteroSuperior);

        // Ejemplo del método floor()
        double decimal2 = 3.9;
        double enteroInferior = Math.floor(decimal2); // Devuelve el entero inferior más cercano al decimal
        System.out.println("El entero inferior de " + decimal2 + " es " + enteroInferior);

        // Ejemplo del método round()
        double decimal3 = 4.5;
        long redondeado = Math.round(decimal3); // Devuelve el número redondeado al entero más cercano
        System.out.println("El número " + decimal3 + " redondeado es " + redondeado);

    }
}
