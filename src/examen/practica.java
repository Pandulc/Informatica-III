package examen;

public class practica {
    public static void main(String[] args) {
        int n = 7;
        recursiva(n);
        printeaAsteriscos(n);
    }

    static void recursiva(int n) {
        if (n == 1) System.out.print(n + "\t");
        else {
            if (n % 2 == 0) recursiva(n - 1);
            else {
                System.out.print(n + "\t");
                recursiva(n - 1);
            }
        }
    }

    static void printeaAsteriscos(int n) {
        if (n == 1) System.out.print("* ");
        else {
            System.out.print("* ");
            printeaAsteriscos(n - 1);
        }
    }
}
