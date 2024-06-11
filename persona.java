

// se publica la clase persona, con los atributos nombre y apellido

public class persona {
    private String nombre;
    private String apellido;

    // se le define un constructor
    public persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // se le define los getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    // por último, se aplica el método toString para una mejor impresión de los objetos persona
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
