import java.util.Map;

public class C0040System03 {

    public static void main(String[] args) {

        //Obtener todas las variables de ambiente del sistema.
        // Las variables de ambiente se guardan en un diccionario:

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        //Obtener las variables de entorno del sistema
        System.out.println("------ Listando variables de entorno del sistema ------");
            //Imprimimos cada key y su valor:
        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        //Obtener una variable del sistema en concreto.
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);

    }
}


