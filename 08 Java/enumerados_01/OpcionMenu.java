
/*
En este ejemplo, la clase OpcionMenu define cuatro atributos (nombre, descripcion, precio y tipoMenu)
con sus correspondientes métodos de acceso. La opción de menú utiliza el enumerado TipoMenu para
indicar a qué tipo de menú pertenece (tipoMenu).
 */

package enumerados_01;

public class OpcionMenu {
    private String nombre;
    private String descripcion;
    private double precio;
    private TipoMenu tipoMenu;

    public OpcionMenu(String nombre, String descripcion, double precio, TipoMenu tipoMenu) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipoMenu = tipoMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoMenu getTipoMenu() {
        return tipoMenu;
    }
}
