package inicio;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class ConsecionarioCochesHastables {
    static Scanner teclado = new Scanner(System.in);
    static Hashtable<String, Object[]> coches;

    public static void main(String[] args) {
        int opcion = 0;
        coches = new Hashtable();
        do {
            System.out.printf("1-Agregar coche%n" +
                    "2-Listar coche%n" +
                    "3-Buscar coche%n" +
                    "4-Eliminar coche%n" +
                    "5-Calcular costes%n" +
                    "6-Vaciar coches%n" +
                    "7-Salir%n" +
                    "Que desea hacer?%n");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    agregarCoche();
                    break;
                case 2:
                    listarCoches();
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        } while (opcion != 7);

    }

    public static void agregarCoche() {

        System.out.println("introducir modelo");
        String modelo = teclado.next();
        System.out.println("introducir caballos");
        int cv = teclado.nextInt();
        System.out.println("introducir coste");
        double coste = teclado.nextDouble();
        System.out.println("introducir matricula");
        String matricula = teclado.next();
        if (coches.containsKey(matricula)) {
            System.out.println("no puedo agregarlo");
        } else {
            Object[] unCoche = {modelo, cv, coste, matricula};
            coches.put(matricula, unCoche);
        }
    }

    public static void listarCoches() {
        Enumeration<Object[]> cochesRecuperados = coches.elements();
        while (cochesRecuperados.hasMoreElements()) {
            Object[] recuperado = cochesRecuperados.nextElement();
            for (Object item : recuperado) {
                System.out.println(item);
            }
        }
    }

    public static void buscarCoche(String matricula) {
        if (coches.containsKey(matricula)) {
            Object[] encontrado = coches.get(matricula);
        }
    }


}

