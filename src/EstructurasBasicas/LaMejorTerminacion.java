package EstructurasBasicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LaMejorTerminacion {
    public static void main(String[] args) {

        String [] boletos = {"1111","2222","3333","2222","1111","1111"};

        HashMap<Integer, Integer> terminaciones = new HashMap<>();

        int ultimoNumero;
        Integer valor;

        for (String boleto : boletos) {

            ultimoNumero = Integer.parseInt("" + boleto.charAt(3));
            valor = terminaciones.get(ultimoNumero);

            if (valor == null) {

                terminaciones.put(ultimoNumero, 1);
            } else {

                terminaciones.put(ultimoNumero, valor + 1);
            }
        }

        System.out.println(terminaciones);

    }
}
