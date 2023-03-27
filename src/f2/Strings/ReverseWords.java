package f2.Strings;
//
import java.util.Scanner;

//public class ReverseWords {
//    public static void main(String[] args) {
//        Scanner s= new Scanner(System.in);
//        String input = s.nextLine();
//        String ans="";
//
//    }
//}
public class ReverseWords {

    public static String reverseEachWord(String str){
        int n =str.length();
        String ans = "";
        int start=0;
        int i=0;
        for(; i<n;i++){
            if(str.charAt(i)==' '){
                String reverse="";
                int end=i-1;
                for (int j =start;j<=end;j++){
                    reverse = str.charAt(j)+reverse;
                }
                ans=reverse+" ";
                start = i+1;
            }
        }
        int end=i-1;
        String reverse="";
        for(int j=start;j<=end;j++){
            reverse=str.charAt(j)+reverse;
        }
        ans+=reverse;
        return ans;
















//        String ans="";
//        int start=0;
//        int i=0;
//        for(;i<str.length();i++){
//            if(str.charAt(i)==' '){
//                //Reverse Current Word
//                int end=i-1;
//                String reverse="";
//                for(int j=start;j<=end;j++){
//                    reverse=str.charAt(j)+reverse;
//                }
//                //Add it final String(ans)
//                ans+=reverse+" ";
//                start=i+1;
//            }
//        }
//        int end=i-1;
//        String reverse="";
//        for(int j=start;j<=end;j++){
//            reverse=str.charAt(j)+reverse;
//        }
//        ans+=reverse;
//        return ans;
    }


    public static void main(String args[]) {
        String str="abc def ghi jkl";
        System.out.println(reverseEachWord(str));
    }
}

//          int end=input.length();
////        String ans="";
////        int i=input.length()-1;
////        for(;i>=0;i--){
////            if(input.charAt(i)==' '){
////                ans=ans+input.substring(i+1,end)+" ";
////                end=i;
////            }
////        }
////        ans=ans+input.substring(i+1,end)+" ";
////        System.out.println(ans);
