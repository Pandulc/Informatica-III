package recursividad;

import java.util.Scanner;

public class ejeRec_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Ingrese el primer factor");
        int factor1 = console.nextInt();
        System.out.println("Ingrese el segundo factor");
        int factor2 = console.nextInt();
        int product = product(factor1, factor2);
        System.out.println("El resultado del producto es: " + product);
    }

    public static int product (int a, int b){
        if(b == 1){
            return a;
        }
        else{
            return a + product(a,b-1);
        }
    }
}
