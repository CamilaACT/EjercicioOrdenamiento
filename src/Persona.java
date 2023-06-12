import java.util.Comparator;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    @Override
    public int compareTo(Persona otraPersona) {
        return Integer.compare(this.edad, otraPersona.edad);
    }
    //Un valor negativo: Indica que el objeto actual es menor que otroObjeto.
    //Cero: Indica que el objeto actual es igual a otroObjeto.
    //Un valor positivo: Indica que el objeto actual es mayor que otroObjeto.

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
