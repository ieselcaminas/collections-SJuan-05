package Flujos;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Problema3 {
    public static void main(String[] args) {

        ArrayList<Person> personas = new ArrayList<>();

        Person p = new Person("Aaron", "Garcia", 2004);
        personas.add(p);

        p = new Person("Julio", "Peris", 2003);
        personas.add(p);

        p = new Person("Cristina", "Escudero", 2002);
        personas.add(p);

        p = new Person("Javier", "Morales", 1969);
        personas.add(p);

        personas.stream().
                map(persona -> persona.getLastName()).
                distinct().
                sorted().
                forEach(apellido -> System.out.println(apellido));
    }
}