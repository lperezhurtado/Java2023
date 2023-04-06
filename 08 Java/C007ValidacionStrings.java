public class C007ValidacionStrings {
    public static void main(String[] args) {

        String curso = null;
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "Java";
        }

        //Validacion de tamaño

        boolean esVacio = curso.length() == 0;
        System.out.println("esVAcio= " + esVacio);

        //Tambien se puede hacer con isEMpty()

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVAcio= " + esVacio);

        //Validación de elemento en blanco. Debe de no ser NULL, EMPTY, espacios raros.

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco= " + esBlanco);

        if(esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso de ".concat(curso));
        }
    }
}
