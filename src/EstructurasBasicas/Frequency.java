package EstructurasBasicas;

import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        String [] numeros = {"uno", "dos", "tres", "dos", "uno"};

        int contador;

        HashMap<String, Integer> frecuencia = new HashMap<>();

        for (int i = 0; i < numeros.length; i++) {

            String numero = numeros[i];

            Integer valor = frecuencia.get(numero);

            if (valor == null) {

                frecuencia.put(numero, 1);
            } else{

                frecuencia.put(numero, ++valor);
            }
        }

        System.out.println(frecuencia);
    }
}
