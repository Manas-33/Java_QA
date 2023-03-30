package f4.BinaryTrees;

public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
    public BinaryTreeNode(T data){
        this.data=data;
    }

//    public static void printTree(BinaryTreeNode<Integer> root){
//        System.out.println(root.data);
//        if(root.left==null){
//            return;
//        }
//        if(root.right==null){
//            return;
//        }
//        printTree(root.left);
//        printTree(root.right);
//    }

}
