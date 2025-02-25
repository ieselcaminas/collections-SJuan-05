package EstructurasBasicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static int numeroAlumnos(Scanner entrada) {

        String pregunta = entrada.nextLine();
        int nAlumnos = Integer.parseInt(pregunta);
        return nAlumnos;
    }

    public static ArrayList<Double> leerAlturas(int nAlumnos, Scanner entrada) {

        ArrayList<Double> alturas = new ArrayList();
        double altura;

        for (int i = 0; i < nAlumnos; i++) {

            altura = entrada.nextDouble();

            alturas.add(altura);

        }

        return alturas;
    }

    public static double calcularMedia(ArrayList<Double> alturas) {

        double media = 0;
        for (int i = 0; i < alturas.size(); i++) {

            media += alturas.get(i);

        }

        media = media / alturas.size();

        return media;
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas, double media) {

        int contadorSuperior = 0;

        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > media) {

                contadorSuperior++;
            }
        }

        return contadorSuperior;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas, double media) {

        int contadorInferior = 0;

        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < media) {

                contadorInferior++;
            }
        }

        return contadorInferior;
    }

    public static String mostrarResultados(int nAlumnos, ArrayList<Double> alturas, double media, int contadorSuperior, int contadorInferior) {

        String resultado = "Número de alumnos: " + nAlumnos + " |  Alturas de los alumnos: " + alturas + " |  Media de alturas: " + media + " |  Alumnos superiores a la media: " + contadorSuperior + " |  Alumnos inferiores a la media: " + contadorInferior;

        return resultado;
    }

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de alumnos que hay: ");
        int nAlumnos = numeroAlumnos(entrada);

        System.out.println("Ingrese la altura de cada alumno: ");
        ArrayList<Double> alturas = leerAlturas(nAlumnos, entrada);

        double media = calcularMedia(alturas);
        int contadorSuperior = calcularAlumnosAlturaSuperior(alturas, media);
        int contadorInferior = calcularAlumnosAlturaInferior(alturas, media);


        String resultados = mostrarResultados(nAlumnos,alturas,media,contadorSuperior,contadorInferior);

        System.out.println(resultados);
    }
}
