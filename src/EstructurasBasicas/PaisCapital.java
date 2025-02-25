package EstructurasBasicas;

import java.util.HashMap;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {

        HashMap<String, String> paisCapital = new HashMap<>();
        paisCapital.put("Brasil", "Aaron");
        paisCapital.put("Germany", "Antonio");
        paisCapital.put("Francee", "Julio");
        paisCapital.put("Germanyy", "Morales");
        paisCapital.put("France", "Cristina");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un pais y le mostraremos su capital");
        String pais = sc.nextLine();

        System.out.println(paisCapital.get(pais));
    }
}
