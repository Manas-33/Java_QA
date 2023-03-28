package f3.LinkedList;

import java.util.Scanner;

public class LinkedListUse {

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;//here the head is given address of the first node
                tail = currentNode;
            } else {
                //this condition is for the rest of the cases so all the other cases are connected to the next one.
//                Node<Integer> tail = head;
//                while (tail.next != null) {// the last node of the linked list will point to null
//                    tail = tail.next;//incrementing the tail
//                }
//                tail.next = currentNode;// attaching the last node to the new node
                tail.next=currentNode;
                tail=tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void printLL(Node<Integer> head) {
        System.out.println("Print " + head);
//        System.out.println(head.next);
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public static void increment(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    public static int length(Node<Integer> head) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static int findElementIndex(Node<Integer> head, int x) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (temp.data == x) {
                return count - 1;
            } else {
                temp = temp.next;
            }
        }
        return -1;
    }

    public static void insertElement(Node<Integer> head,int x,int i){
        Node<Integer> nextNode =head;
        Node<Integer> prev=head;
        int index=0;
        while(prev !=null){
            if(i==0){
                Node<Integer> currentNode=new Node<>(x);
                currentNode.next=head;
                head=currentNode;
                break;
            }
            index++;
            if(index-1==i-1){
                nextNode=prev.next;
                Node<Integer> currentNode=new Node<>(x);
                currentNode.next=nextNode;
                prev.next=currentNode;
            }
            prev = prev.next;
        }
    }

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        if(n==0||head==null){
            return head;
        }
        Node<Integer> fast=head;
        Node<Integer> slow=head;
        Node<Integer> initialHead=head;

        for (int i = 0; i < n; i++) {
            fast =fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        Node<Integer> temp=slow.next;
        slow.next=null;
        fast.next=initialHead;
        head=temp;
        return head;
    }

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        if(head==null){
            return head;
        }
        Node<Integer> temp=head;

        while(temp.next!=null){
            if(temp.data==(temp.next.data)){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }

    public static Node<Integer> reverseLinkedList(Node<Integer>head){
        Node<Integer> current=head;
        Node<Integer> prev=head;
        Node<Integer> forward=head;
        while(current!=null){
            forward=current.next;
            current.next=prev;
            prev=current;
            current=forward;
        }
        return head;
    }

    public static boolean isPalindrome(Node<Integer> head) {
        if(head==null){
            return true;
        }
        Node<Integer> fast =head;
        Node<Integer> slow =head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node<Integer> secondHead=slow.next;
        slow.next=null;
        secondHead=reverseLinkedList(secondHead);

        Node<Integer> firstSubList =secondHead;
        Node<Integer> secondSubList =secondHead;

        while(firstSubList!=null){
            if(firstSubList.data!=secondSubList.data){
                return false;
            }
            firstSubList=firstSubList.next;
            secondSubList=secondHead.next;
        }
        firstSubList=head;
        secondSubList=reverseLinkedList(secondHead);

        while(firstSubList.next!=null){
            firstSubList=firstSubList.next;
        }
        firstSubList.next=secondSubList;
        return true;
    }

    public static void printR(Node<Integer> head){
        if(head==null){
            return;
        }

        System.out.println(head.data);
        printR(head.next);
    }

    public static void printRR(Node<Integer> head){
        if(head==null){
            return;
        }
        printRR(head.next);
        System.out.println(head.data);

    }

    public static Node<Integer> insertRecur(Node<Integer>head , int elem, int pos){
        if(head==null && pos>0){
            return head;
        }
        if(pos==0){
            Node<Integer> newNode= new Node<>(elem);
            newNode.next=head;
            return newNode;
        }else{
            head.next=insertRecur(head.next,elem,pos-1);
            return head;
        }
    }

    public static Node<Integer> deleteNodeRecur(Node<Integer>head , int pos){
        if(head==null && pos>0){
            return head;
        }

        if(pos==0){
            return head.next;
        }
        head.next=deleteNodeRecur(head.next,pos-1);
        return head;
    }

    public static Node<Integer> reverseLinkedListRec(Node<Integer>head ){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> reverseHead= reverseLinkedListRec(head.next);
        head.next.next=head;
        head.next=null;

        return reverseHead;
    }
//    public static void deleteNode(Node<Integer> head,int pos){
//        Node<Integer> nextNode =head;
//        Node<Integer> prev=head;
//        int index=-1;
//        while(prev!=null){
//            index++;
//            if(pos==0){
//                head=head.next;
//                break;
//            }
//            if(index-1==pos){
//                prev.next=prev.next.next;
//            }
//            prev=prev.next;
//        }
//    }

    public static void main (String[]args){
//        Node<Integer> n1=new Node<>(10);
//        System.out.println(n1);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
//        System.out.println("Main "+head);
            Node<Integer> head = createLinkedList();
            head=insertRecur(head,20,3);
            printR(head);
        System.out.println();
            printR(reverseLinkedListRec(head));

//            printR(head);
//            printRR(head);
//        Node<Integer> head=takeInput();
//        printLL(head);
//        printLL(appendLastNToFirst(head,2));
//        System.out.println(isPalindrome(head));

//        System.out.println(findElementIndex(head, 21));
//        increment(head);
//        System.out.println(length(head));


        }
    }