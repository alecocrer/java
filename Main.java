import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


// se crea la clase main
public class Main {
    public static void main(String[] args) {
        // Se crea los atributos de tipo string: nombres y apellidos con sus respectivos valores.
        String[] nombres = {"Carlos", "Ana", "Luis", "Maria", "Jorge", "Lucia", "Pedro", "Sofia", "Jose", "Elena"};
        String[] apellidos = {"Garcia", "Martinez", "Rodriguez", "Lopez", "Hernandez", "Gonzalez", "Perez", "Sanchez", "Ramirez", "Cruz"};

        Random random = new Random();

        // Se crea la lista para almacenar los objetos persona
        List<persona> personas = new ArrayList<>();

        // Se crean 5 objetos persona con nombres y apellidos aleatorios y se le agregan a la lista
        for (int i = 0; i < 5; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            persona persona = new persona(nombre, apellido);
            personas.add(persona);
        }

        // Realizamos el primer ordenamiento: por orden
        Collections.sort(personas, Comparator.comparing(persona::getNombre));
        System.out.println("Ordenado por nombre:");
        for (persona persona : personas) {
            System.out.println(persona);
        }

        // Realizamos el segundo ordenamiento: por apellido
        Collections.sort(personas, Comparator.comparing(persona::getApellido));
        System.out.println("\nOrdenado por apellido:");
        for (persona persona : personas) {
            System.out.println(persona);
        }

        // Realizamos el tercer ordenamiento: inversamente por apellido
        Collections.sort(personas, Comparator.comparing(persona::getApellido).reversed());
        System.out.println("\nOrdenado inversamente por apellido:");
        for (persona persona : personas) {
            System.out.println(persona);
        }
    }
}
