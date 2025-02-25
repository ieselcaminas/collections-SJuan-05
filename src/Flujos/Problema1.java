package Flujos;

import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[] args) {

        List<Person> personas = new ArrayList<Person>();
        Person p = new Person("Aaron","Garcia", 2004);
        personas.add(p);

        p = new Person("Julio","Peris", 2003);
        personas.add(p);

        p = new Person("Cristina","Escudero", 2002);
        personas.add(p);

        p = new Person("Javier","Morales", 1969);
        personas.add(p);

        long cuantas = personas.
                        stream().
                        filter(persona -> persona.getBirthYear() < 1970).
                        count();

        System.out.println(cuantas);

    }
}
