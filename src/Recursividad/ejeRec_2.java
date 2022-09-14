package Recursividad;

import java.util.Scanner;

public class ejeRec_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Ingrese la base");
        int number = console.nextInt();
        System.out.println("Ingrese el exponente");
        int exponent = console.nextInt();
        int pow = pow(number, exponent);
        System.out.println("El resultado de la potenciacion es: " + pow);

    }

    public static int pow (int b, int e){
        if(e == 1){
            return b;
        }
        else{
            return b * pow(b,e-1);
        }
    }
}
