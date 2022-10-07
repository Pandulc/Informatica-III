package arboles;

public class Prueba {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(50);
        int delete = 0;

        System.out.println("Datos sin ordenar:");
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random()*100) + i;
            if(i == (int) (Math.random() * 10)) delete = number;
            System.out.print(number + "\t");
            tree.add(number);
        }

        System.out.println();

        try {
            Integer x = tree.search(9);
            System.out.println("El elemento encontrado es " + x);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Profundidad: " + tree.depth());

        System.out.println("Antes de delete");

        tree.printfTree();

        System.out.println();

        try {
            System.out.println("Elemento a delete: " + delete);
            tree.delete(delete);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Despues de delete");

        tree.printfTree();

    }
}
