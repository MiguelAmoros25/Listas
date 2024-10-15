import com.amoros.listas.Lista;
import java.util.Scanner;


public  class Main {
    public static void main (String[] args){


    }
    public static void menuLista() {

        System.out.println("1. Ver vista\n" +
                "2. Ver tamaño de la lista\n" +
                "3. Verificar si la lista esta vacia\n" +
                "4. Buscar elemneto de la lista\n" +
                "5.Eliminar elemento de la lista\n\n" +
                "Seleccione una opcion");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Lista.crearLista();
                break;

            case 2:
                Lista.tamanioLista();
                break;

            case 3:
                Lista.estaVacia();
                break;

            case 4:
                lista.burcarElemento();
                break;

            case 5:
                lista.eliminar();
                break;

            case 6:
                System.out.println("Comparar listas");
                break;

            case 7:
                System.out.println("Finalizar programa");
                break;

            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
    public static void menuLista() {
        Lista lista = new Lista();
        lista.crearLista();
    }
}