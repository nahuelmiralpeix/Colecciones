package inicio;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcesionarioCoches {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Object[]>coches;
    public static void main(String[] args) {
        int opcion=0;
        coches= new ArrayList();
        do {
            System.out.printf("1-Agregar coche%n" +
                    "2-Listar coche%n" +
                    "3-Buscar coche%n" +
                    "4-Eliminar coche%n" +
                    "5-Calcular costes%n" +
                    "6-Vaciar coches%n" +
                    "7-Salir%n" +
                    "Que desea hacer?%n");
            opcion=teclado.nextInt();
        }while (opcion!=7);

    }
    public static void agragarCoche(){

        System.out.println("introducir modelo");
        String modelo=teclado.next();
        System.out.println("introducir caballos");
        int cv=teclado.nextInt();
        System.out.println("introducir coste");
        double coste=teclado.nextDouble();
        System.out.println("introducir matricula");
        String matricula=teclado.next();
        Object[] unCoche = {modelo, cv, coste, matricula};
        boolean existe= false;
        for (Object[] elemento :coches) {
            if (elemento[3].equals(matricula)){
                existe=true;
                break;
            }else{
                existe=false;
            }
        }
        if (existe){
            System.out.println("El coche no se puede agregar");
        }else{
            coches.add(unCoche);
        }


    }
}
