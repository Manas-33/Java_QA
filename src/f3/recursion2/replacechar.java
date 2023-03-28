package f3.recursion2;

import java.util.Scanner;

public class replacechar {


    public static String replaceChar(String s, char a,char b) {

        if(s.length()==0){
            return s;
        }

        String smallOutput=replaceChar(s.substring(1),a,b);
        if(s.charAt(0)==a){
            return b+smallOutput;
        }else{
            return s.charAt(0)+smallOutput;
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        scan.nextLine();
        String s=scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
//        System.out.println(replaceChar("abcxdxex",'x','y'));
//        String s= "Dean";
//        System.out.println(s.substring(1));


    }



}
