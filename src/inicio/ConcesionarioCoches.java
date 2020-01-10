package inicio;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcesionarioCoches {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Object[]> coches;

    public static void main(String[] args) {
        int opcion = 0;
        coches = new ArrayList();
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
                    System.out.println("Introduzca la matrícula que desea buscar");
                    String matriculaBuscar = teclado.next();
                    buscarCoche(matriculaBuscar);
                    break;
                case 4:
                    System.out.println("Introduzca la matrícula que desea borrar");
                    String matriculaBorrar = teclado.next();
                    eliminarCoches(matriculaBorrar);
                    break;
                case 5:
                    System.out.printf("EL coste acumulado es: %.2f%n", calcularCostes());
                    break;
                case 6:
                    if (coches.isEmpty()) {
                        System.out.println("La lista está vacía");
                    } else {
                        coches.clear();
                        System.out.println("Lista borrada");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce opción válida");
                    break;

            }
        } while (opcion != 7);

    }

    public static double calcularCostes() {
        double costes = 0.0;
        for (Object[] elemento : coches) {
            double costeIndividual = (double) elemento[2];
            costes += costeIndividual;
        }
        return costes;
    }

    public static void eliminarCoches(String matriBorrada) {
        Object[] borrado = null;
        for (int i = 0; i < coches.size(); i++) {
            Object[] elemento = coches.get(i);
            if (elemento[3].equals(matriBorrada)) {
                borrado = coches.remove(i);
                break;
            }
        }
        if (borrado != null) {
            System.out.println("Coche borrado correctamente");
        } else {
            System.out.println("Coche no encontrado");
        }
    }

    public static void buscarCoche(String matricula) {
        for (Object[] matrix : coches) {

            if (matrix[3].equals(matricula)) {
                for (Object item : matrix) {
                    System.out.print(item + " ");
                }
                System.out.println();
                break;
            }
        }
    }

    public static void listarCoches() {
        if (!coches.isEmpty()) {
            for (Object[] elemento : coches) {
                for (Object item : elemento) {
                    System.out.print(item + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("La lista está vacía.");
        }
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
        Object[] unCoche = {modelo, cv, coste, matricula};
        boolean existe = false;
        for (Object[] elemento : coches) {
            if (elemento[3].equals(matricula)) {
                existe = true;
                break;
            } else {
                existe = false;
            }
        }
        if (existe) {
            System.out.println("El coche no se puede agregar ya existe");
        } else {
            coches.add(unCoche);
        }


    }
}

