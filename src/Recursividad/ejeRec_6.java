package Recursividad;

import java.util.Scanner;

public class ejeRec_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el valor binario a contar: ");
        int number = console.nextInt();
        counter(Integer.toBinaryString(number));

    }

    public static long counter (String x){
        return 0;
    }
}
