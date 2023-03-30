package f4.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
    static class PairN<T, U> {
        T minimum;
        U maximum;

        public PairN(T minimum, U maximum) {
            this.minimum = minimum;
            this.maximum = maximum;
        }

    }
    public static BinaryTreeNode<Integer> takeInput(){

        System.out.println("Enter root data");
        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();

        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild= takeInput();
        BinaryTreeNode<Integer> rightChild= takeInput();
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
    public static BinaryTreeNode<Integer> takeBetterInput(boolean isRoot,int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }else {
            if (isLeft){
                System.out.println("Enter left child of "+parentData);
            }else {
                System.out.println("Enter right child of "+parentData);
            }
        }

        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();

        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild= takeBetterInput(false, rootData,true);
        BinaryTreeNode<Integer> rightChild= takeBetterInput(false,rootData,false);
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
    public static  void printTree(BinaryTreeNode<Integer> root){

        if(root==null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }
    public static  void printTreeDetailed(BinaryTreeNode<Integer> root){

        if(root==null){
            return;
        }
        System.out.print(root.data);
        if(root.left!=null){
            System.out.print(" L : "+root.left.data);
        }
        if(root.right!=null){
            System.out.print(", R : "+root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }
    public static int getSum(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }

        return getSum(root.right)+getSum(root.left)+root.data;
    }
    public static int noOfNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int left=noOfNodes(root.left);
        int right=noOfNodes(root.right);
        return right+left+1;
    }
    public static int largestnode(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int x=largestnode(root.left);
        int y=largestnode(root.right);
        return Math.max(root.data,Math.max(x,y));

    }
    public static void preOrder(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if(root==null){
            return 0;
        }
        int count= (root.data>x) ? 1:0;
        if(root.left!=null){
            count+=countNodesGreaterThanX(root.left,x);
        }
        if(root.right!=null){
            count+=countNodesGreaterThanX(root.right,x);
        }
        return count;
    }
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static int noOfLeafs(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return noOfLeafs(root.left)+noOfLeafs(root.right);
    }
    public static void printKth(BinaryTreeNode<Integer> root,int k){
        if(root==null){
            return ;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        printKth(root.left, k-1);
        printKth(root.right, k-1);
    }
    private static void changeDepth(BinaryTreeNode<Integer> root, int level){
        if(root==null){
            return;
        }
        root.data=level;
        changeDepth(root.left,level+1);
        changeDepth(root.right,level+1);

    }

    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        changeDepth(root,0);
    }
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        return isNodePresent(root.left, x) || isNodePresent(root.right, x);

    }
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        if(root.left==null && root.right!=null){
            System.out.println(root.right.data);
        }else if(root.right==null && root.left!=null){
            System.out.println(root.left.data);
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);

    }
    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        if(root.left==null&&root.right==null){
            return null;
        }
        root.left=removeLeaves(root.left);
        root.right=removeLeaves(root.right);
        return root;
    }
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }

        boolean isLeftBalanced=isBalanced(root.left);
        boolean isRightBalanced=isBalanced(root.right);
        return isLeftBalanced&&isRightBalanced;
    }
    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){

        if(root==null){
            int height=0;
            boolean isBal=true;
            BalancedTreeReturn ans= new BalancedTreeReturn();
            ans.height=height;
            ans.isBalanced=isBal;
            return ans;
        }

        BalancedTreeReturn leftoutput=isBalancedBetter(root.left);
        BalancedTreeReturn rightoutput=isBalancedBetter(root.right);

        int height =1+ Math.max(leftoutput.height,rightoutput.height);
        boolean isBal= Math.abs(leftoutput.height - rightoutput.height) <= 1;

        if(!leftoutput.isBalanced||!rightoutput.isBalanced){
            isBal=false;
        }
        BalancedTreeReturn ans =new BalancedTreeReturn();
        ans.height=height;
        ans.isBalanced=isBal;
        return ans;

    }
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int leftH=height(root.left);
        int rightH=height(root.right);
        int ld=diameterOfBinaryTree(root.left);
        int rd=diameterOfBinaryTree(root.right);
        return 1+Math.max(leftH+rightH,Math.max(ld,rd));
    }
    private static Pair diameterHelper(BinaryTreeNode<Integer> root) {
        if(root==null){
            Pair pair=new Pair(0,0);
            return pair;
        }
        Pair leftPair=diameterHelper(root.left);
        Pair rightPair=diameterHelper(root.right);

        int leftD= leftPair.diameter;
        int rightD= rightPair.diameter;

        int distance=leftPair.height+rightPair.height+1;

        int diameter =Math.max(leftD,Math.max(rightD,distance));
        int height=Math.max(leftPair.height,rightPair.height)+1;

        return new Pair(diameter,height);
    }

    public static int diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root){
        Pair p=diameterHelper(root);
        return p.diameter;
    }

    public static BinaryTreeNode<Integer> inputLevelWise() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Root data: ");
        int rootData=s.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren=new LinkedList<>();
        pendingChildren.add(root);
        while(!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> temp=pendingChildren.poll();
            System.out.println("Enter Left child of"+temp.data);
            int left=s.nextInt();
            if(!(left ==-1)){
                BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<>(left);
                temp.left=leftChild;
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter Right child of"+temp.data);
            int right=s.nextInt();
            if(!(right ==-1)){
                BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<>(right);
                temp.left=rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {

        Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>();
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){

            BinaryTreeNode<Integer> frontNode=pendingNodes.poll();

            if(frontNode==null){
                System.out.println();
                if(!pendingNodes.isEmpty()){
                    pendingNodes.add(null);
                }
            }else{
                System.out.print(frontNode.data+ ":L:");
                if (frontNode.left!=null){
                    pendingNodes.add(frontNode.left);
                    System.out.print(frontNode.left.data+ ",R:");
                }else{
                    System.out.print(-1+",R:");
                }
                if (frontNode.right!=null){
                    pendingNodes.add(frontNode.right);
                    System.out.println(frontNode.right.data);
                }else{
                    System.out.println(-1);
                }
            }
        }
    }
    private static BinaryTreeNode<Integer> buildTreeHelperPre(int[]preOrder,int preStart,int preEnd, int[]inOrder,int inStart,int inEnd){
        if(preStart>preEnd||inStart>inEnd){
            return null;
        }
        int rootVal=preOrder[preStart];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootVal);
        int k=0;
        for (int i = inStart; i <=inEnd ; i++) {
            if(rootVal==inOrder[i]){
                k=i;
                break;
            }
        }
        root.left=buildTreeHelperPre(preOrder,preStart+1,preStart+(k-inStart),inOrder,inStart,k-1);
        root.right=buildTreeHelperPre(preOrder,preStart+(k-inStart)+1,preEnd,inOrder,k+1,inEnd);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreePre(int[] preOrder, int[] inOrder) {

        int n=preOrder.length;
        int preStart=0;
        int preEnd=n-1;
        int inStart=0;
        int inEnd=n-1;
        return buildTreeHelperPre(preOrder,preStart,preEnd,inOrder,inStart,inEnd);
    }
    private static BinaryTreeNode<Integer> buildTreeHelperPO(int[]postOrder,int postStart,int postEnd, int[]inOrder,int inStart,int inEnd){
        if(postStart>postEnd||inStart>inEnd){
            return null;
        }
        int rootVal=postOrder[postEnd];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootVal);
        int k=0;
        for (int i = inStart; i <=inEnd ; i++) {
            if(rootVal==inOrder[i]){
                k=i;
                break;
            }
        }
        root.left=buildTreeHelperPO(postOrder,postStart,postStart+(k-inStart)-1,inOrder,inStart,k-1);
        root.right=buildTreeHelperPO(postOrder,postStart+(k-inStart),postEnd-1,inOrder,k+1,inEnd);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreePO(int[] postOrder, int[] inOrder) {

        int n=postOrder.length;
        int postStart=0;
        int postEnd=n-1;
        int inStart=0;
        int inEnd=n-1;
        return buildTreeHelperPO(postOrder,postStart,postEnd,inOrder,inStart,inEnd);
    }
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer>temp = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootLeft=root.left;
        root.left=temp;
        temp.left=rootLeft;
        insertDuplicateNode(rootLeft);
        insertDuplicateNode(root.right);

    }
    public static PairN<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
       if(root==null){
           return new PairN<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
       }
       PairN<Integer,Integer>leftPair=getMinAndMax(root.left);
       PairN<Integer,Integer>rightPair=getMinAndMax(root.right);
       int minimum=Math.min(root.data,Math.min(leftPair.minimum, rightPair.minimum));
       int maximum=Math.max(root.data,Math.max(leftPair.maximum, rightPair.maximum));
       return new PairN<>(minimum,maximum);
    }

    public static void printLevelTraversal(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while(!pendingNodes.isEmpty()){

            BinaryTreeNode<Integer> frontNode=pendingNodes.poll();

            if(frontNode==null){
                System.out.println();
                if(!pendingNodes.isEmpty()){
                    pendingNodes.add(null);
                }
            }else{
                System.out.print(frontNode.data+" ");
                if (frontNode.left!=null){
                    pendingNodes.add(frontNode.left);

                }
                if (frontNode.right!=null){
                    pendingNodes.add(frontNode.right);

                }
            }
        }
    }
    private static void print(BinaryTreeNode<Integer> root, int k,String s){
        if(root==null){
            return;
        }
        int rootData=root.data;
        s=s+root.data+"";
        if(k==root.data&&root.left==null&&root.right==null){
            System.out.println(s);
            return;
        }
        print(root.left,k-rootData,s);
        print(root.right,k-rootData,s);
    }

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        String s="";
        print(root,k,s);
    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        //Your code goes here
        print(root,node,k);
    }
    private static int print(BinaryTreeNode<Integer> root, int node, int k) {
        //If tree is empty return -1
        if (root==null)
            return -1;

        int rootData=root.data;
        if (rootData==node)
            {
                printNodesAtDistanceK(root, k);
                return 0;
            }

            int leftSubTreeDist=0,rightSubTreeDist=0;

            leftSubTreeDist=print(root.left,node,k);
            if (leftSubTreeDist!=-1)
            {
                if(leftSubTreeDist+1==k)
                {
                    System.out.println(rootData);
                }
                else
                {
                    rightSubTreeDist=k-(leftSubTreeDist+1)-1;
                    printNodesAtDistanceK(root.right, rightSubTreeDist);
                }
                return leftSubTreeDist+1;
            }

            rightSubTreeDist=print(root.right,node,k);
            if (rightSubTreeDist!=-1)
            {
                if(rightSubTreeDist+1==k)
                {
                    System.out.println(rootData);
                }
                else
                {
                    leftSubTreeDist=k-(rightSubTreeDist+1)-1;
                    printNodesAtDistanceK(root.left, leftSubTreeDist);
                }
                return rightSubTreeDist+1;
            }
            return -1;
    }
    private static void printNodesAtDistanceK(BinaryTreeNode<Integer> root, int k) {
                if (root==null || k<0)
                    return;

                if (k == 0)
                {
                    System.out.println(root.data);
                    return;
                }

                printNodesAtDistanceK(root.left,k-1);
                printNodesAtDistanceK(root.right,k-1);
    }

    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return null;
        }
        if(root.data==x){
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
        }
        ArrayList<Integer> leftOut=nodeToRootPath(root.left,x);
        if(leftOut!=null){
            leftOut.add(root.data);
            return leftOut;
        }
        ArrayList<Integer> rightOut=nodeToRootPath(root.right,x);
        if(rightOut!=null){
            rightOut.add(root.data);
            return rightOut;
        }
        return null;

    }

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> rootRight=new BinaryTreeNode<>(3);
        root.left=rootLeft;
        root.right=rootRight;
        BinaryTreeNode<Integer> twoRight=new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> threeLeft=new BinaryTreeNode<>(5);
        rootLeft.right=twoRight;
        rootRight.left=threeLeft;

//        System.out.println(largestnode(root));
//        BinaryTreeNode<Integer> root=takeBetterInput(true,0,true);

//        printTreeDetailed(root);
//        System.out.println(noOfNodes(root));
//        System.out.println(getSum(root));
        mirrorBinaryTree(root);
        printTreeDetailed(root);

    }

}
