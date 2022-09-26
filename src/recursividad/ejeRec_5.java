package recursividad;

public class ejeRec_5 {
    public static void main(String[] args) {
        int [] array  = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("El arreglo en orden es: ");
        for (int x: array) {
            System.out.print(x+"\t");
        }
        System.out.println("\n\nEl arreglo en orden inverso es: ");

        array = inverter(array, 0, array.length - 1);
        for (int x: array) {
            System.out.print(x+"\t");
        }
    }

    public static int[] inverter (int[] x, int left, int right){
        if(left<right){
            int tmp = x[left];
            x[left] = x[right];
            x[right] = tmp;
            return inverter(x, left+1, right-1);
        }
        return x;
    }
}
