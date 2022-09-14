package Recursividad;

import java.util.Scanner;

public class ejeRec_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        int factor1 = console.nextInt();
        System.out.println("Ingrese el divisor");
        int factor2 = console.nextInt();
        int result = 0;
        result = subtraction(factor1, factor2);
        System.out.println("El resultado del cociente es: " + result);
    }

    public static int subtraction(int a, int b) {
        if(a<b){
            return 0;
        }
        else{
            return 1 + subtraction(a-b,b);
        }
    }
}
