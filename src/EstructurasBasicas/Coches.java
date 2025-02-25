package EstructurasBasicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Coches {
    public static ArrayList<String> marcasCoche(ArrayList<String> lista) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese marcas de coche, si no introduce nada finalizará: ");

        while(true){

            String pregunta = sc.nextLine();

            if (pregunta.isEmpty()){

                break;

            } else {

                lista.add(pregunta);

            }
        }

        return lista;

    }

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista = marcasCoche(lista);

        for (String mostrar : lista){

            System.out.println(mostrar);

        }
    }
}
