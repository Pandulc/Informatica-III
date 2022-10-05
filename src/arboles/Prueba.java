package arboles;

public class Prueba {
    public static void main(String[] args) {
        BinaryTree arbol = new BinaryTree(50);

        System.out.println("Datos sin ordenar:");
        for (int i = 0; i < 7; i++) {
            int number = (int) (Math.random()*100) + i;
            System.out.print(number + "\t");
            arbol.add(number);
        }

        System.out.println();

        try {
            Integer x = arbol.search(9);
            System.out.println("El elemento encontrado es " + x);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        arbol.printfTree();
    }
}
