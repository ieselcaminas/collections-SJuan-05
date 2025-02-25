package EstructurasBasicas;

import java.net.Inet4Address;
import java.util.HashMap;

public class Botin {
    public static void main(String[] args) {

        int nParticipantes = 3;
        String [] billetes = {"20", "50", "20", "50", "100", "20"};

        HashMap<Integer, String> resultado = new HashMap<>();

        for (int i = 0; i < billetes.length; i++) {

            int leTocaA = i % nParticipantes;
            String valor = resultado.get(leTocaA);

            if (valor == null) {

                resultado.put(leTocaA, billetes[i]);
            }else{

                resultado.put(leTocaA, valor + " , " + billetes[i]);
            }
        }

        System.out.println(resultado);
    }
}
