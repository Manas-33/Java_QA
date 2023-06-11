package ls;
import java.util.*;
public class sameeElements {
    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }


    public static void main(String args[])
    {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }


//    public static void main(String[] args)
//    {
//        String input="Welcome to Java Session Session Session";  //Input String
//        String[] words=input.split(" ");  //Split the word from String
//        int wrc=1;    //Variable for getting Repeated word count
//        for(int i=0;i<words.length;i++) //Outer loop for Comparison
//        {
//            for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
//            {
//                if(words[i].equals(words[j]))  //Checking for both strings are equal
//                {
//                    wrc=wrc+1;    //if equal increment the count
//                    words[j]="0"; //Replace repeated words by zero
//                }
//            }
//            if(words[i]!="0")
//                System.out.println(words[i]+"--"+wrc); //Printing the word along with count
//            wrc=1;
//        }
//    }

}
