package TREES.LEC1;

public class AVL_main {
    public static void main(String[] args) {
        AVL tree=new AVL();
        for(int i=0;i<1000;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}
