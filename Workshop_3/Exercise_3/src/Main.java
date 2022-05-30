import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> ranNum = new ArrayList<>();
        Random random = new Random();
        int num = 0;
        int i = 0;



        while(true){
            System.out.println("Ingrese un número");
            num = sc.nextInt();
            if (ranNum.contains(num) == true){
                break;
            }
            ranNum.add(num);
            //i++;
        }

        System.out.println(ranNum);

        Menu(ranNum);
    }

    public static void quicksort(Integer[] A, int izq, int der) {

        int pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho

    }

    private static void buble(Integer[] arreglo) {
        for (int x = 0; x < arreglo.length; x++) {
            // Aquí "y" se detiene antes de llegar
            // a length - 1 porque dentro del for, accedemos
            // al siguiente elemento con el índice actual + 1
            for (int y = 0; y < arreglo.length - 1; y++) {
                int elementoActual = arreglo[y],
                        elementoSiguiente = arreglo[y + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }
    }

    private static void Menu(ArrayList<Integer> ranNum){
        System.out.println("¿Cón que métodos quiere que ordenemos la lista?");
        System.out.println("\t1. Método de la burbuja");
        System.out.println("\t2. QuickSort");

        Integer[] ranNum2 = ranNum.stream().toArray(Integer[]::new);

        int opc = sc.nextInt();

        switch (opc){
            case 1:
                buble(ranNum2);
                Print(ranNum,ranNum2);
                break;
            case 2:
                quicksort(ranNum2, 0 , ranNum.size()-1);
                Print(ranNum,ranNum2);
                break;
            default:
                System.out.println("Valor incorrecto!!!");
                Menu(ranNum);
                break;
        }
    }

    private static void Print(ArrayList<Integer> ranNum, Integer[] ranNum2){
        int size = ranNum.size();
        ranNum.clear();
        for(int i = 0; i < size;i++){
            ranNum.add(ranNum2[i]);
        }
        System.out.println(ranNum);
    }
}
