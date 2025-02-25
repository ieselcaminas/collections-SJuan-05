package EstructurasBasicas;

import java.util.HashMap;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {

        HashMap<String, Integer> contactos = new HashMap<>();

        contactos.put("Aaron",694441927);
        contactos.put("Ramon",666666666);
        contactos.put("Antonio",633952600);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del telefono: ");
        String nombre = sc.nextLine();

        System.out.println(contactos.get(nombre));

    }
}
