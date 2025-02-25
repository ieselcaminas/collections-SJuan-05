package Flujos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(6);
        numeros.add(-2);
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(8);

        numeros.stream().
                filter(num -> num >=1 && num <=5).
                forEach(System.out::println);

    }
}
