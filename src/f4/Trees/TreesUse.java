package f4.Trees;

import f3.Queues.QueueEmptyException;
import f3.Queues.QueueLL;
import java.util.Scanner;


public class TreesUse {
    public static void printTree1(TreeNode<Integer>root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer>child=root.children.get(i);
            printTree1(child);
        }
    }
    public static void printTree2(TreeNode<Integer>root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" : ");
        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer>child=root.children.get(i);
            printTree2(child);
        }
    }
    public static int noOfNodes(TreeNode<Integer>root){
        int count =1;
        for (int i = 0; i < root.children.size(); i++) {
            count+=noOfNodes(root.children.get(i));
        }
        return count;
    }
    public static int sumOfAllNode(TreeNode<Integer> root){
        int sum=0;
        for (int i = 0; i < root.children.size(); i++) {
            sum+=sumOfAllNode(root.children.get(i));
        }
        return sum +root.data;
    }

    public static TreeNode<Integer> takeInput() throws QueueEmptyException {
        Scanner s=new Scanner(System.in);
        QueueLL<TreeNode<Integer>> pendingNodes=new QueueLL<>();
        System.out.println("enter the root data");
        int rootData=s.nextInt();
        if(rootData==-1){
            return null;
        }
        TreeNode<Integer>root=new TreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer>front=pendingNodes.dequeue();
            System.out.println("Enter the no of children for: "+front.data);
            int numChild=s.nextInt();
            for (int i = 0; i < numChild; i++) {
                System.out.println("enter the "+i+"th child data for: "+front.data);
                int childData=s.nextInt();
                TreeNode<Integer>childNode=new TreeNode<>(childData);
                front.children.add(childNode);
                pendingNodes.enqueue(childNode);
            }
        }
        return root;
    }
    public static void printLevelWise(TreeNode<Integer> root)  {
        if (root == null) {
            return;
        }
        QueueLL<TreeNode<Integer>> pendingNodes=new QueueLL<>();
        TreeNode<Integer> nullNode=new TreeNode<>(Integer.MIN_VALUE);
        pendingNodes.enqueue(root);
        pendingNodes.enqueue(nullNode);
        System.out.println(root.data);
        while (pendingNodes.size()!=1) {

            TreeNode<Integer>front=null;
            try{
                front=pendingNodes.dequeue();
            }catch(QueueEmptyException e){

            }
            if (front == nullNode) {
                pendingNodes.enqueue(nullNode);
                System.out.println();
                continue;
            }
            for (int i = 0; i < front.children.size(); i++) {
                System.out.print(front.children.get(i).data+" ");
                pendingNodes.enqueue(front.children.get(i));
            }


        }

    }
    public static int numNodeGreater(TreeNode<Integer> root,int x){
        int count =0;
        if(root==null){
            return 0;
        }
        if(root.data>x){
            count++;
        }
        for(TreeNode<Integer>child:root.children){
            count=count+numNodeGreater(child,x);
        }
        return count;
    }
    public static int getHeight(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int ans=0;
        for (TreeNode<Integer> child:root.children){
            int childHeight=getHeight(child);
            if(childHeight>ans){
                ans=childHeight;
            }
        }
        return ans+1;
    }
    public static int countLeafNodes(TreeNode<Integer> root){
        if (root == null) {
            return 0;
        }
        if (root.children.size() == 0) {
            return 1;
        }
        int count =0;
        for(TreeNode<Integer>child:root.children){
            count+=countLeafNodes(child);
        }
        return count;

    }
    public static void printPostOrder(TreeNode<Integer> root){
        if (root == null) {
            return;
        }
        for (TreeNode<Integer>child: root.children){
            printPostOrder(child);
        }
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        TreeNode<Integer>root=new TreeNode<>(4);
        TreeNode<Integer>node1=new TreeNode<>(2);
        TreeNode<Integer>node2=new TreeNode<>(3);
        TreeNode<Integer>node3=new TreeNode<>(1);
        TreeNode<Integer>node4=new TreeNode<>(5);
        TreeNode<Integer>node5=new TreeNode<>(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);

//        printTree2(root);
//        System.out.println(noOfNodes(root));
        printLevelWise(root);

    }
}
