package f4.BST;

import com.sun.source.tree.BinaryTree;
import f3.LinkedList.Node;
import f4.BinaryTrees.BinaryTreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

class BSTSubtreeReturn{
    int min;
    int max;
    boolean isBST;
    int height;
}
class PassNode<T> {
    T head;
    T tail;
}

public class BSTUse {
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;
        } else if (root.data<k) {
            return searchInBST(root.right,k);
        }
        return searchInBST(root.left,k);
    }
    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            elementsInRangeK1K2(root.left,k1,k2);
            System.out.print(root.data+" ");
            elementsInRangeK1K2(root.right,k1,k2);
        } else if (root.data>k2) {
            elementsInRangeK1K2(root.left,k1,k2);
        }else if(root.data<k1){
            elementsInRangeK1K2(root.right,k1,k2);
        }
    }
    private static BinaryTreeNode<Integer> constructBSTHelper(int[] arr, int si,int ei){
        if(ei<si){
            return null;
        }
        int mid=si+ei/2;
        BinaryTreeNode <Integer> root =new BinaryTreeNode<>(arr[mid]);
        root.left=constructBSTHelper(arr,si,mid-1);
        root.right=constructBSTHelper(arr,mid+1,ei);
        return root;
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return constructBSTHelper(arr,0,n-1);
    }
    private static int minimum(BinaryTreeNode<Integer> root) {
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int leftMin=minimum(root.left);
        int rightMin=minimum(root.right);
        return Math.min(root.data,Math.min(rightMin,leftMin));
    }
    private static int maximum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax=maximum(root.left);
        int rightMax=maximum(root.right);
        return Math.max(root.data,Math.max(leftMax,rightMax));
    }
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftMax=maximum(root.left);
        if(leftMax>=root.data){
            return false;
        }
        int rightMax=minimum(root.right);
        if(rightMax<root.data){
            return false;
        }
        boolean isLeftBST=isBST(root.left);
        boolean isRightBST=isBST(root.right);
        return isLeftBST&&isRightBST;
    }
    public static isBSTReturn isBSTImproved(BinaryTreeNode<Integer> root){
        if(root==null){
            isBSTReturn ans=new isBSTReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
            return ans;
        }
        isBSTReturn leftAns=isBSTImproved(root.left);
        isBSTReturn rightAns=isBSTImproved(root.right);
        int min = Math.min(root.data,Math.min(leftAns.min, rightAns.min));
        int max = Math.min(root.data,Math.max(leftAns.max, rightAns.max));
        boolean isBST=true;
        if(leftAns.max>=root.data){
            isBST=false;
        }
        if(rightAns.max<root.data){
            isBST=false;
        }
        if(!leftAns.isBst){
            isBST=false;
        }
        if(!rightAns.isBst){
            isBST=false;
        }
        isBSTReturn ans=new isBSTReturn(min,max,isBST);
        return ans;
    };

    public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root){
        PassNode<Node<Integer>> passNode=new PassNode<>();
        return passNode.head;
    }
    public static PassNode<Node<Integer>> constructLinkedListHelper (BinaryTreeNode<Integer>root){
        if(root==null){
            return new PassNode<Node<Integer>>();
        }
        if(root.left==null&&root.right==null){
            PassNode<Node<Integer>> passNode=new PassNode<>();
            passNode.head=new Node<>(root.data);
            passNode.tail=null;
            return passNode;
        }
        PassNode<Node<Integer>> passNodeLeft=constructLinkedListHelper(root.left);
        PassNode<Node<Integer>> passNodeRight=constructLinkedListHelper(root.right);
        PassNode<Node<Integer>> passNode=new PassNode<>();
        Node<Integer>newNode=new Node<>(root.data);

        if(passNodeLeft.head==null){
            passNode.head=newNode;
        }else{
            passNode.head=passNodeLeft.head;
        }
        if(passNodeLeft.tail==null){
            passNode.head.next=newNode;
            passNode.tail=newNode;
        }else{
            passNodeLeft.tail.next=newNode;
            passNode.tail=newNode;
        }
        if(passNodeRight.head!=null) {
            passNode.tail.next = passNodeRight.head;
            passNode.tail = passNodeRight.head;
        }
        if(passNodeRight.tail!=null){
            passNode.tail=passNodeRight.tail;
        }
        return passNode;
    }
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root==null){
            return -1;
        }
        if(root.data>a&& root.data>b){
            return getLCA(root.left,a,b);
        }
        if(root.data<=a&& root.data<=b) {
            return getLCA(root.right, a, b);
        }
            return root.data;
    }

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        helperLargerNodes(root,0);
    }
    private static int helperLargerNodes(BinaryTreeNode<Integer> root, int sum) {
        if(root==null){
            return sum;
        }
        sum=helperLargerNodes(root.right,sum);
        sum+=root.data;
        root.data=sum;
        return helperLargerNodes(root.left,sum);
    }
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if(root==null){
            return null;
        }

        ArrayList<Integer> output;

        if(root.data==data){
            output=new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }

        if(root.data<data){
            output=getPath(root.right,data);
            if(output!=null){
                output.add(root.data);
            }
            return output;

        }

        if(root.data>data){
            output=getPath(root.left,data);
            if(output!=null){
                output.add(root.data);
            }
            return output;
        }

        return null;
    }
    public static BSTSubtreeReturn largestBSTSubtreeHelper(BinaryTreeNode<Integer>root){
        if(root==null){
            BSTSubtreeReturn ans=new BSTSubtreeReturn();
            ans.height=0;
            ans.isBST=true;
            ans.min=Integer.MAX_VALUE;
            ans.max=Integer.MIN_VALUE;
            return ans;
        }
        BSTSubtreeReturn left=largestBSTSubtreeHelper(root.left);
        BSTSubtreeReturn right=largestBSTSubtreeHelper(root.right);
        if(!(right.isBST&&right.min>root.data)){
            right.isBST=false;
        }
        if(!(left.isBST)&&left.max>root.data){
            left.isBST=false;
        }
        BSTSubtreeReturn ans=new BSTSubtreeReturn();
        if(!left.isBST||left.max>root.data||root.data>right.min||!right.isBST){
            if(left.height> right.height){
                left.isBST=false;
                return left;
            }else{
                right.isBST=false;
                return right;
            }
        }
        ans.isBST=true;
        ans.min=Math.min(left.min,Math.min(right.min,root.data));
        ans.max=Math.max(left.max,Math.max(right.max,root.data));
        ans.height=Math.max(left.height, right.height)+1;
        return ans;
    }

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        return largestBSTSubtreeHelper(root).height;
    }

    public static int countNodes(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        if (root == null) {
            return;
        }
        int totalcount=countNodes(root);
        int count=0;
        Stack<BinaryTreeNode<Integer>>inorder=new Stack<>();
        Stack<BinaryTreeNode<Integer>>revInorder=new Stack<>();
        BinaryTreeNode<Integer>temp=root;
        while(temp!=null){
            inorder.push(temp);
            temp=temp.left;
        }
        temp=root;
        while(temp!=null){
            revInorder.push(temp);
            temp=temp.right;
        }
        while (count < totalcount - 1) {
            BinaryTreeNode<Integer>top1=inorder.peek();
            BinaryTreeNode<Integer>top2=revInorder.peek();

            if(top1.data+top2.data==s){
                System.out.println(top1.data+" "+top2.data);
                BinaryTreeNode<Integer>top=top1;
                inorder.pop();
                count++;
                if (top.right != null) {
                    top=top.right;
                    while(top!=null){
                        inorder.push(top);
                        top=top.left;
                    }
                }
                top=top2;
                revInorder.pop();
                count++;
                if(top.left!=null){
                    top=top.left;
                    while (top != null) {
                        revInorder.push(top);
                        top=top.right;
                    }
                }

            } else if (top1.data+top2.data>s) {
                BinaryTreeNode<Integer>top=top2;
                revInorder.pop();
                count++;
                if (top.left != null) {
                    top=top.left;
                    while (top != null) {
                        revInorder.push(top);
                        top=top.right;
                    }
                }
            }else{
                BinaryTreeNode<Integer>top=top1;
                inorder.pop();
                count++;
                if(top.right!=null){
                    top=top.right;
                    while (top != null) {
                        inorder.push(top);
                        top=top.left;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
    BST b=new BST();
    b.insert(5);
    b.insert(2);
    b.insert(7);
    b.insert(1);
    b.insert(3);
    b.insert(6);
    b.insert(8);

    b.printTree();

    System.out.println(b.isPresent(5));
//    b.deleteData(5);
    System.out.println(b.isPresent(5));
}


}
