package EstructurasBasicas;

import java.util.Stack;

public class Parentesis {
    public static boolean bienParentizado(Stack<String> parentizado){

        boolean siOno = false;
        String frase = "([Hola])";
        char parentesis;

        for (int i = 0; i < frase.length(); i++) {
            parentesis = frase.charAt(i);

            if (parentesis == '(' || parentesis == '{' || parentesis == '[') {
                parentizado.push(String.valueOf(parentesis));
            } else if (parentesis == ')') {
                if (parentizado.isEmpty()) {
                    return false;
                }

                parentizado.pop();

                if (parentesis != ')') {
                    return false;
                }
            } else if (parentesis == '}') {
                if (parentizado.isEmpty()) {
                    return false;
                }

                parentizado.pop();

                if (parentesis != '}') {
                    return false;
                }
            } else if (parentesis == ']') {
                if (parentizado.isEmpty()) {
                    return false;
                }

                parentizado.pop();

                if (parentesis != ']') {
                    return false;
                }
            }
        }

        if (parentizado.isEmpty()) {
            siOno = true;
        }

        return siOno;
    }

    public static void main(String[] args) {

        Stack<String> parentizado = new Stack<>();
        boolean parentizados = bienParentizado(parentizado);
        if (parentizados) {
            System.out.println("Esta bien parentizado");
        } else {
            System.out.println("Esta mal parentizado");
        }
    }
}
