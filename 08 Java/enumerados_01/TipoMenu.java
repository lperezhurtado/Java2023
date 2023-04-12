package enumerados_01;

public enum TipoMenu {
    DESAYUNO("Desayuno"),
    ALMUERZO("Almuerzo"),
    CENA("Cena");

    private final String nombre;

    TipoMenu(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

/*
En este ejemplo, el enumerado TipoMenu define las opciones de menú que ofrecemos: "Desayuno",
"Almuerzo" y "Cena". Cada opción de menú tiene un nombre (nombre) que se define en el constructor
del enumerado y se puede acceder a él a través del método getNombre().

Ahora, podemos crear una clase OpcionMenu que utiliza el enumerado TipoMenu para definir cada
opción de menú y agregar otros atributos y métodos necesarios:
 */