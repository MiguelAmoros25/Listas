package com.amoros.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

    public List<String> lista01 = new ArrayList<>();

    public void  crearLista() {
        //Crea lista ´Lista01´ con List y ArrayList
        // List<String> lista01 = new ArrayList<>();

        //Agregar elementos a la lista ¨Lista01¨
        lista01.add("Computadora");
        lista01.add("Mouse");

        //Imprimir los elementos a la lista ´Lista01´
        for (String item : lista01 ) {
            System.out.println("" + item);
        }
    }
    //Metodo para devolver
    public void tamanioLista() {
        System.out.println("El tamaño de la lista es de " +
                lista01.size() + "elementos");
    }

    public void estaVacia() {
        if (lista01.isEmpty()) {
            System.out.println("La lista esta vacia ");
        }
    }

    public  void buscarElemento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el elemnto que desewa buscar en la lista: ");
        String elemento = scanner.next();

        if(lista01.contains(elemento)) {
            System.out.println("Elemeto ");
        }
    }
    public  void eliminar() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("¿Que desea eliminar\n" +
                "1. Un elemento de la lista\n" +
                "2. Toda la lista \n");
        int opcion = scanner.nextInt();

        switch ((opcion)) {
            case 1:
                System.out.println("Ingrese la palabra que desea eliminar: ");
                String elemento = scanner.nextLine();

                if (lista01.remove (elemento)){
                    System.out.println("El elemento " + elemento + "fue eliminado de la lista ");
                }else {
                    System.out.println("El elemento no se encuentra dentro de la lista, por lo tanto no no es posible eliminarlo : (");

                }
                break;
            case 2:
                lista01.clear();
                System.out.println("Los elemnetos de la lista fueron eliminados");
                break;
        }
        public void compararListas() {
            List<String> lista2 = new ArrayList<>();
            List<String> lista3 = new ArrayList<>();

            lista2.add("Rojo");
            lista3.add("Rojo");

            if (lista2.equals(lista3)) {
                System.out.println("Las listas son identicas");
            }else {
                System.out.println("Las listas son diferentes");
            }
        }
    }
}