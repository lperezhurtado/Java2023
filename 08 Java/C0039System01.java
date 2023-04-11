import java.util.Properties;

public class C0039System01 {

    public static void main(String[] args) {

        //Obtener el nombre del usuario del sistema.
        String usuario = System.getProperty("user.name");
        System.out.println("El nombre del usuario del sistema es: " + usuario);

        //Ruta del HOME.
        String home = System.getProperty("user.home");
        System.out.println("La ruta del Home es: " + home);

        //Ruta del WorkSpace.
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        //Versión de Java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);


        String lineSeparator = System.getProperty("line.separator");
        //String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator:" + lineSeparator + "Una línea nueva ...");

        Properties p = System.getProperties();
        //System.out.println(p);
        p.list(System.out);
    }
}


