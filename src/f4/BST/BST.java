package f4.BST;

import f3.LinkedList.Node;
import f4.BinaryTrees.BinaryTreeNode;
import f4.BinaryTrees.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BSTDeleteReturn{
    BinaryTreeNode<Integer>root;
    boolean deleted;
    public BSTDeleteReturn(BinaryTreeNode<Integer> root,boolean deleted){
        this.root=root;
        this.deleted=deleted;
    }
}
public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;
    private static boolean isPresentHelper(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        if(x<root.data){
            return isPresentHelper(root.left,x);
        }else{
            return isPresentHelper(root.right,x);
        }
    }
    public boolean isPresent (int x){
        return isPresentHelper(root,x);
    }
    public void insert(int x){
        root=insertHelper(root,x);
        size++;
    }
    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x) {
        if(root==null){
            BinaryTreeNode<Integer> newRoot=new BinaryTreeNode<>(x);
            return newRoot;
        }
        if(x>root.data){
            root.right=insertHelper(root.right,x);
        }
        if(x<root.data){
            root.left=insertHelper(root.left,x);
        }
        return root;
    }

    public void remove(int data){
        BSTDeleteReturn output =deleteDataHelper(root,data);
        if(output.deleted){
            size--;
        }
    }
    private static int minimum (BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int leftMin=minimum(root.left);
        int rightMin=minimum(root.right);
        return Math.min(root.data,Math.min(leftMin,rightMin));
    }
    private BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
        if(root==null){
            return new BSTDeleteReturn(null,false);
        }
        if(root.data<x){
            BSTDeleteReturn outputRight=deleteDataHelper(root.right,x);
            root.right=outputRight.root;
            outputRight.root=root;
            return outputRight;
        }
        if(root.data>x){
            BSTDeleteReturn outputLeft=deleteDataHelper(root.left,x);
            root.left=outputLeft.root;
            outputLeft.root=root;
            return outputLeft;
        }
        if(root.right==null && root.left==null){
            return new BSTDeleteReturn(null,true);
        }
        if(root.right!=null&&root.left==null){
            return new BSTDeleteReturn(root.right,true);
        }
        if(root.right==null&&root.left!=null){
            return new BSTDeleteReturn(root.left,true);
        }
        int rightSmallest=minimum(root.right);
        root.data=rightSmallest;

        BSTDeleteReturn outputRight=deleteDataHelper(root.right,rightSmallest);
        root.right=outputRight.root;
        return new BSTDeleteReturn(root,true);


    }

    public int size (){
        return size;
    }
    public void printTree(){
        printTreeHelper(root);
    }
    private void printTreeHelper(BinaryTreeNode<Integer> node) {
        if(node==null){
            return;
        }
        System.out.print(node.data);
        if(node.left!=null){
            System.out.print("L:"+node.left.data);
        }
        if(node.right!=null){
            System.out.print(",R:"+node.right.data);
        }
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }


    public static ArrayList<BinaryTreeNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        return null;
    }
//    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
//        // Write your code here
//    }
//    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
//        // Write your code here
//    }

}
