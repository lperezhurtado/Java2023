public class C041ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if(args.length != 3){
            System.err.println("Por favor ingresar una operación " +
                    "(suma, resta, div o multi) y dos enteros");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            System.err.println("Cuidado a y b deben ser enteros, vuelva a intentar!");
            System.exit(-1);
        }
        switch(operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multi":
                resultado = a*b;
                break;
            case "div":
                if(b == 0){
                    System.err.println("No se puede dividir por zero!");
                    System.exit(-1);
                }
                resultado = (double)a/b;
                break;
            default:
                resultado = a+b;
        }

        System.out.println("Resultado de la operación '" + operacion + "' es: " +resultado);

        //Compilado con: javac .\C041ArgumentosLineaComandoCalculadora.java -encoding utf8
        //Ejecutar con: java .\C041ArgumentosLineaComandoCalculadora.java suma 3 4
    }
}
