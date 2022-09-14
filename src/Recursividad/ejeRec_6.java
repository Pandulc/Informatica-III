package Recursividad;

import java.util.Scanner;

public class ejeRec_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el valor decimal: ");
        int number = console.nextInt();
        int quantity = counter(number);
        System.out.println("La cantidad de unos en la representacion binaria de " + number + " es: " + quantity);

    }

    public static int counter(int x) {
        if (x == 2) {
            return 1;
        }
        else if(x == 3){
            return 2;
        }
        else if (x % 2 == 1) {
            return 1 + counter(x/2);
        }
        else{
            return counter(x/2);
        }
    }
}
