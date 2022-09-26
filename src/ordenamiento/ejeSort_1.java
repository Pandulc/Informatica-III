package ordenamiento;

import java.util.Scanner;

public class ejeSort_1 {
    public static void main(String[] args) {
        int option;
        int[] intArray = {9, 29, 82, 1, 5, 99, 13};

        do {
            option = menu();
            switch (option) {
                case 0:
                    break;
                case 1:
                    insertion(intArray);
                    break;
                case 2:
                    shell(intArray);
                    break;
                case 3:
                    System.out.println("Arreglo desordenado:\n");
                    for (int j : intArray) {
                        System.out.print(j + "   ");
                    }
                    System.out.println("\n");

                    quicksort(intArray, 0, intArray.length-1);

                    System.out.println("Arreglo ordenado:\n");
                    for (int k : intArray) {
                        System.out.print(k + "   ");
                    }
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida. Ingrese una opcion valida\n");
            }
        } while (option != 0);
    }

    public static int menu() {
        Scanner console = new Scanner(System.in);
        System.out.println("Elija el  metodo de ordenamiento a utilizar:\n1) Insercion\n2) Shell\n3) Quicksort\n0) Salir");
        return console.nextInt();
    }

    public static void insertion(int[] a) {
        int tmp;

        System.out.println("Arreglo desordenado:\n");
        for (int j : a) {
            System.out.print(j + "   ");
        }
        System.out.println("\n");
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                tmp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = tmp;
                for (int j = i - 1; j > 0; j--) {
                    if (a[j] < a[j - 1]) {
                        tmp = a[j - 1];
                        a[j - 1] = a[j];
                        a[j] = tmp;
                    }
                }
            }
        }
        System.out.println("Arreglo ordenado:\n");
        for (int j : a) {
            System.out.print(j + "   ");
        }
        System.out.println("\n");
    }

    public static void shell(int[] a) {

        System.out.println("Arreglo desordenado:\n");
        for (int j : a) {
            System.out.print(j + "   ");
        }

        int gap, i, j, temp;
        for (gap = a.length / 2; gap > 0; gap /= 2) {
            for (i = gap; i < a.length; i++) {
                for (j = i - gap; j >= 0 && a[j] > a[j + gap]; j -= gap) {
                    temp = a[j];
                    a[j] = a[j + gap];
                    a[j + gap] = temp;
                }
            }
        }

        System.out.println("Arreglo ordenado:\n");
        for (int k : a) {
            System.out.print(k + "   ");
        }
        System.out.println("\n");
    }

    public static void quicksort (int [] a, int lt, int rt){

        int temp;
        int i = lt;
        int j = rt;
        do {
            while ( a [j] > a [i] && j>i) j-- ;
            if ( i<j ) {
                temp=a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
            while ( a [i] < a [j] && i<j ) i++ ;
            if ( i<j ) {
                temp=a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            }
        } while ( i<j );
        if ( lt < j ) quicksort (a, lt, j-1 );
        if ( i < rt ) quicksort ( a, i+1, rt );

    }
}

