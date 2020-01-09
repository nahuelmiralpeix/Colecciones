package inicio;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEntrada {
    static ArrayList<String> listaPalabras;
    public static void main(String[] args) {
        int tamanio;
        boolean completado;
        listaPalabras=new ArrayList<String>();
        agregarElemento("palabra uno");
        agregarElemento("palabra dos");
        agregarElemento("palabra tres");
        agregarElemento("palabra cuatro");
        agregarElemento("palabra cinco");

        //listaPalabras.remove(4);
        //borrarElemento("palabra uno");
        //recorrerArray();
        //listaPalabras.clear();
        //boolean encontrar=listaPalabras.contains("palabra uno");
        //System.out.println(encontrar);
        //borrarElemento("palabra dos");
        //tamanio=listaPalabras.size();
        //listaPalabras.set(0,"nueva palabra");
        //System.out.println(listaPalabras.indexOf("palabra tres"));
        //System.out.println(listaPalabras.isEmpty());
        //System.out.println(listaPalabras.lastIndexOf("palabra uno"));
        //System.out.println(tamanio);
        //recorrerCualquierArray(listaPalabras);
        //Collections.sort(listaPalabras);
        Collections.shuffle(listaPalabras);
        recorrerArray();

        /*for (int i = 0; i <listaPalabras.size() ; i++) {
            String palabraRecuperada=listaPalabras.get(i);
            System.out.println(palabraRecuperada);
        }
        for (String palabra:listaPalabras) {
            //System.out.println(palabra);
            if (palabra.equals("palabra tres")){
                System.out.println(palabra);
            }
        }*/

        /*tamanio=listaPalabras.size();
        System.out.println(completado);
        System.out.println(tamanio);
        String palabraRecuperada=listaPalabras.get(2);
        System.out.println(palabraRecuperada);*/
    }
    public static void agregarElemento(String palabra){
        if (listaPalabras.contains(palabra)){
            System.out.println("palabra ya existente, no se agregará");
        }else{
            listaPalabras.add(palabra);
        }
    }
    public static void recorrerArray(){
        for (String palabra:listaPalabras) {
            System.out.println(palabra);
        }
    }
    public static void recorrerCualquierArray(ArrayList lista){
        for (Object dato:lista) {
            System.out.println(dato);
        }
    }
    public static void borrarElemento(String elemento){
        if (listaPalabras.contains(elemento)) {
            for (int i = 0; i < listaPalabras.size(); i++) {
                if (elemento.equals(listaPalabras.get(i))) {
                    listaPalabras.remove(i);
                    break;
                }
            }
        }else{
            System.out.println("El elemento no está en la lista");
        }
    }
}
