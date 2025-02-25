package EstructurasBasicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TelefonosII {
    public static void main(String[] args) {

        HashMap<String, List<Integer>> contactos = new HashMap<>();
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(3333333);
        listaNumeros.add(2222222);
        listaNumeros.add(1111111);
        contactos.put("Aaron", listaNumeros);

        listaNumeros = new ArrayList<>();
        listaNumeros.add(6666666);
        listaNumeros.add(5555555);
        listaNumeros.add(4444444);
        contactos.put("Antonio", listaNumeros);

        listaNumeros = new ArrayList<>();
        listaNumeros.add(7777777);
        listaNumeros.add(8888888);
        listaNumeros.add(9999999);
        contactos.put("Ramon", listaNumeros);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el contacto y le mostraremos todos sus números");
        String pregunta = sc.nextLine();

        System.out.println(contactos.get(pregunta));
    }
}
