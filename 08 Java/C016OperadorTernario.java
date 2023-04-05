public class C016OperadorTernario {
    public static void main(String[] args) {

        //Sintaxis Operador ternario:
        // variable = condicion ? valorSiTrue : ValorSiFalse;

        String variable = 7 == 5 ? "Sí, es verdadero" : "Es falso";
        System.out.println("Variable = " + variable);

        //Equivalente a:
        if( 7 == 5){
             variable = "Sí, es verdadero";
        }else{
            variable = "Es falso";
        }



    }
}
