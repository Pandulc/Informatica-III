package Recursividad;

import java.util.Scanner;

public class ejeRec_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Ingrese el valor a calcular su factorial");
        int number = console.nextInt();
        int factorial = factorial(number);
        System.out.println("El factorial de " + number + " es: " + factorial);
    }
    public static int factorial (int x){
        if(x == 1){
            System.out.println("Cuando llegamos al caso base, en este caso: " + x +
                    " retornamos el caso base y completamos los pasos recursivos: x * (x - 1)");
            return x;
        }
        else{
            System.out.println("Llamamos a la funcion recursiva en un caso que sabemos resolver: "
                    + x + " y un caso mas simple que el original: " + (x-1));
            return x * factorial(x-1);
        }
    }
}
