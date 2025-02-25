package InterfazComparable;

import java.util.ArrayList;

public class Problema1 {
    public static void main(String[] args) {

        ArrayList<Human> humanos = new ArrayList<>();

        Human humano = new Human("Julio", 1000.12);
        humanos.add(humano);

        humano = new Human("Aaron", 2000.22);
        humanos.add(humano);

        humano = new Human("Cristina", 3000.32);
        humanos.add(humano);

        humanos.stream().
                sorted().
                forEach(System.out::println);
    }
}
