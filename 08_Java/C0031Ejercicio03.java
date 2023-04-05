

/*
Enunciado: Se requiere implementar un programa en Java que permita llevar un registro de los ingresos y egresos de un negocio. El programa debe mostrar un menú con las siguientes opciones:

Registrar ingreso
Registrar egreso
Ver saldo actual
Salir del programa
Cuando se selecciona la opción 1, el programa debe solicitar al usuario que ingrese la cantidad de dinero que se ha recibido y una descripción del ingreso. Luego, debe sumar el valor ingresado al saldo actual.

Cuando se selecciona la opción 2, el programa debe solicitar al usuario que ingrese la cantidad de dinero que se ha gastado y una descripción del gasto. Luego, debe restar el valor del egreso al saldo actual.

Cuando se selecciona la opción 3, el programa debe mostrar el saldo actual.

Cuando se selecciona la opción 4, el programa debe salir del menú y mostrar un mensaje de despedida.

 */

        import java.util.Scanner;

        public class C0031Ejercicio03 {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double saldo = 0;
                int opcion = 0;

                while (opcion != 4) {
                    System.out.println("Menú principal");
                    System.out.println("1. Registrar ingreso");
                    System.out.println("2. Registrar egreso");
                    System.out.println("3. Ver saldo actual");
                    System.out.println("4. Salir");

                    System.out.print("Ingrese una opción: ");
                    opcion = input.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese la cantidad de dinero recibido: ");
                            double ingreso = input.nextDouble();
                            input.nextLine(); // Consumir el salto de línea después de ingresar la cantidad
                            System.out.print("Ingrese una descripción del ingreso: ");
                            String descripcionIngreso = input.nextLine();
                            saldo += ingreso;
                            System.out.println("El ingreso de " + ingreso + " ha sido registrado exitosamente.");
                            break;
                        case 2:
                            System.out.print("Ingrese la cantidad de dinero gastado: ");
                            double egreso = input.nextDouble();
                            input.nextLine(); // Consumir el salto de línea después de ingresar la cantidad
                            System.out.print("Ingrese una descripción del gasto: ");
                            String descripcionEgreso = input.nextLine();
                            if (egreso > saldo) {
                                System.out.println("No hay suficiente saldo para registrar este gasto.");
                            } else {
                                saldo -= egreso;
                                System.out.println("El egreso de " + egreso + " ha sido registrado exitosamente.");
                            }
                            break;
                        case 3:
                            System.out.println("El saldo actual es de " + saldo);
                            break;
                        case 4:
                            System.out.println("Gracias por utilizar el programa.");
                            break;
                        default:
                            System.out.println("Opción inválida. Por favor ingrese una opción del 1 al 4.");
                            break;
                    }
                }
                input.close();
            }
        }



/*
Explicación:
El programa comienza declarando una variable double llamada "saldo" que inicialmente
tiene un valor de cero. Luego, se define una variable entera "opcion" que se utiliza
para almacenar la opción seleccionada por el usuario en el menú.

 */