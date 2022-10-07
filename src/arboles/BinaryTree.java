package arboles;

public class BinaryTree {
    private Node<Integer> raiz;

    private Integer depth;
    public BinaryTree(Integer data) {
        this.raiz = new Node<>(data);
        this.depth = 0;
    }

    public void add(Integer x) {
        if (x < raiz.getElement()) {
            if (raiz.getLeft() == null) {
                raiz.setLeft(new Node<>(x));
            } else {
                add(x, raiz.getLeft());
            }
        } else {
            if (raiz.getRight() == null) {
                raiz.setRight(new Node<>(x));
            } else {
                add(x, raiz.getRight());
            }
        }
    }

    private void add(Integer x, Node<Integer> node) {
        if (x < node.getElement()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node<>(x));
            } else {
                add(x, node.getLeft());
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new Node<>(x));
            } else {
                add(x, node.getRight());
            }
        }
    }

    public void addNoRep(Integer x) throws Exception {
        if (x < raiz.getElement()) {
            if (raiz.getLeft() == null) {
                raiz.setLeft(new Node<>(x));
            } else {
                addNoRep(x, raiz.getLeft());
            }
        } else if (x > raiz.getElement()) {
            if (raiz.getRight() == null) {
                raiz.setRight(new Node<>(x));
            } else {
                addNoRep(x, raiz.getRight());
            }
        } else {
            throw new Exception("El elemento ya esta en el arbol");
        }
    }

    private void addNoRep(Integer x, Node<Integer> node) throws Exception {
        if (x < node.getElement()) {
            if (node.getLeft() == null) {
                node.setLeft(new Node<>(x));
            } else {
                addNoRep(x, node.getLeft());
            }
        } else if (x > raiz.getElement()) {
            if (node.getRight() == null) {
                node.setRight(new Node<>(x));
            } else {
                addNoRep(x, node.getRight());
            }
        } else {
            throw new Exception("El elemento ya esta en el arbol");
        }
    }

    public void delete (Integer x) throws Exception {
        if (x.equals(raiz.getElement())){
            if(raiz.getLeft() == null && raiz.getRight() == null) raiz = null;
            else if (raiz.getRight() == null) raiz = raiz.getLeft();
            else if (raiz.getLeft() == null) raiz = raiz.getRight();
            else{
                Node<Integer> aux = raiz.getLeft();
                raiz = raiz.getRight();
                Node<Integer> aux2 = raiz.getLeft();
                if(aux2 != null){
                    while(aux2.getLeft() != null){
                        aux2 = aux2.getLeft();
                    }
                    aux2.setLeft(aux);
                }
                else raiz.setLeft(aux);
            }

        }
        else if (x < raiz.getElement() && raiz.getLeft() != null) raiz.setLeft(delete(x, raiz.getLeft()));
        else if (x > raiz.getElement() && raiz.getRight() != null) raiz.setRight(delete(x, raiz.getRight()));
        else throw new Exception("El elemento no esta en el arbol");
    }

    private Node<Integer> delete (Integer x, Node<Integer> node) throws Exception {
        if (x.equals(node.getElement())){
            if(node.getLeft() == null && node.getRight() == null) node = null;
            else if (node.getRight() == null) node = node.getLeft();
            else if (node.getLeft() == null) node = node.getRight() ;
            else{
                Node<Integer> aux = node.getLeft();
                node = node.getRight();
                Node<Integer> aux2 = node.getLeft();
                if(aux2 != null){
                    while(aux2.getLeft() != null){
                        aux2 = aux2.getLeft();
                    }
                    aux2.setLeft(aux);
                }
                else node.setLeft(aux);
            }
        }
        else if (x < node.getElement() && node.getLeft() != null) node.setLeft(delete(x, node.getLeft()));
        else if (x > node.getElement() && node.getRight() != null) node.setRight(delete(x, node.getRight()));
        else throw new Exception("El elemento no esta en el arbol");
        return node;
    }

    public Integer depth (){
        int depthl = 0;
        if(raiz.getLeft() != null){
            depth(raiz.getLeft(), depthl+1);
        }
        if(raiz.getRight() != null){
            depth(raiz.getRight(), depthl+1);
        }
        return depth;
    }

    private Integer depth (Node<Integer> node, Integer depthl){
        if(node.getLeft() != null){
            depth(node.getLeft(), depthl+1);
        }
        if(node.getRight() != null){
            depth(node.getRight(), depthl+1);
        }
        else{
            if(depth < depthl) depth = depthl;
        }
        return depth;
    }

    public Integer search(Integer x) throws Exception {
        if (x.equals(raiz.getElement())) return raiz.getElement();
        else if (x < raiz.getElement() && raiz.getLeft() != null) return search(x, raiz.getLeft());
        else if (x > raiz.getElement() && raiz.getRight() != null) return search(x, raiz.getRight());
        else throw new Exception("El elemento no esta en el arbol");
    }

    private Integer search(Integer x, Node<Integer> node) throws Exception {
        if (x.equals(node.getElement())) return node.getElement();
        else if (x < node.getElement() && node.getLeft() != null) return search(x, node.getLeft());
        else if (x > node.getElement() && node.getRight() != null) return search(x, node.getRight());
        else throw new Exception("El elemento no esta en el arbol");
    }

    public void printfTree() {
        System.out.println("Arbol de menor a mayor:");
        if (raiz.getLeft() != null) {
            printfTree(raiz.getLeft());
        }

        System.out.print(raiz.getElement() + "\t");

        if (raiz.getRight() != null) {
            printfTree(raiz.getRight());
        }
    }

    private void printfTree(Node<Integer> node) {
        if (node.getLeft() != null) {
            printfTree(node.getLeft());
        }

        System.out.print(node.getElement() + "\t");

        ///////////////////////////////////
        if (node.getRight() != null) {
            printfTree(node.getRight());
        }
    }


    public Node<Integer> getRaiz() {
        return raiz;
    }

    public void setRaiz(Node<Integer> raiz) {
        this.raiz = raiz;
    }
}
