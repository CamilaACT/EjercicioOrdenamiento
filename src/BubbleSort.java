import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    private List<Persona> personas;
    private List<Persona> personaslista;
    private List<Persona> personaslistainsersion;

    public BubbleSort () {
        this.personas = new ArrayList<Persona>();
        this.personaslista = new ArrayList<Persona>();
        this.personaslistainsersion = new ArrayList<Persona>();
    }
    public void Burbuja(){
        personaslista.addAll(personas);
        Persona personaactual;
        Persona personasiguiente;
        int n = personaslista.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                personaactual = personaslista.get(j);
                personasiguiente = personaslista.get(j + 1);
                if (personaactual.compareTo(personasiguiente)>0) {
                    personaslista.set(j, personasiguiente);
                    personaslista.set(j + 1, personaactual);
                }
            }
        }
    }

    public void Insersion(){
        personaslistainsersion.addAll(personas);
        int n = personaslistainsersion.size();
        for (int i = 1; i < n; ++i) {
            Persona key = personaslistainsersion.get(i);
            int j = i - 1;

            // Mueve los elementos de la lista que son mayores que key, una posición adelante
            while (j >= 0 && personaslistainsersion.get(j).compareTo(key) > 0) {
                personaslistainsersion.set(j + 1, personaslistainsersion.get(j));
                j = j - 1;
            }
            personaslistainsersion.set(j + 1, key);
        }

    }

    public void QuemarDatos(){
        personas.add(new Persona("Camila",28));
        personas.add(new Persona("Camila1",57));
        personas.add(new Persona("Camila2",1));
        personas.add(new Persona("Camila3",18));
        personas.add(new Persona("Camila4",8));
    }

    public List<Persona> getPersonaslista() {
        return personaslista;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    @Override
    public String toString() {
        return "BubbleSort{" +
                "personas=" + personas +
                ", personaslista=" + personaslista +
                '}';
    }
}
