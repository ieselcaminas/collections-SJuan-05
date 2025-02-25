package EstructurasBasicas;

import java.util.Stack;

public class ExpresionesAritmeticas {

    public static boolean esDigito(String cadena){

        char primerCaracter = cadena.charAt(0);
        return Character.isDigit(primerCaracter);
    }

    public static int calculo(String cadena){

        String [] split = cadena.split(" ");
        Stack<Integer> pila = new Stack<>();
        int numero;
        Integer n1;
        Integer n2;

        for (int i = 0; i < split.length; i++) {

            if (esDigito(split[i])) {

                numero = Integer.parseInt(split[i]);
                pila.push(numero);
            }else{
                n2 = pila.pop();
                n1 = pila.pop();

                if (split[i].equals("+")){

                    pila.push(n1 + n2);
                } else if (split[i].equals("-")){

                    pila.push(n1 - n2);
                } else if (split[i].equals("*")){

                    pila.push(n1 * n2);
                } else if (split[i].equals("/")){

                    pila.push(n1 / n2);
                }
            }
        }

        return pila.pop();
    }

    public static void main(String[] args) {

        String cadena = "5 1 2 + 4 * + 3 -";
        System.out.println(calculo(cadena));

    }
}
