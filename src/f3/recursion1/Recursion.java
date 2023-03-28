package f3.recursion1;

public class Recursion {

    public static int fact(int n) {
        if(n==0){return 1;}
        int smallOutput =fact(n-1);
        int output=n*smallOutput;

        return output;
    }

    public static int sumn(int n) {
        if(n==0){return 0;}
        int smallOutput =sumn(n-1);
        int output=n+smallOutput;

        return output;
    }

    public static int power(int x,int n) {
        if(n==0){return 1;}
        int smallOutput =power(x,n-1);
        int output=x*smallOutput;

        return output;
    }

    public static int noof(int n) {
        if(n==0){return 0;}
        int smallOutput =noof(n/10);
        int output=smallOutput+1;

        return output;
    }

    public static void printn(int n) {
        if(n==0){return;}
        printn(n-1);
        System.out.println(n);

    }

    public static int fibonacci(int n) {
        if(n==1||n==2){return 1;}
        int fib1=fibonacci(n-1);
        int fib2=fibonacci(n-2);
        int output=fib1+fib2;
        return output;
    }

    public static boolean isSorted(int a[]) {
        if(a.length==1){return true;}

        if(a[0]>a[1]){
            return false;
        }
        int smallArray[]=new int[a.length-1];
        for (int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        boolean sorted=isSorted(smallArray);
        return sorted;
    }


    public static int sum(int input[]) {

        if(input.length==1){return input[0];}

        int smallArray[]=new int [input.length-1];

        for (int i=1;i<input.length;i++) {
            smallArray[i - 1] = input[i];
        }

        int output=input[0]+sum(smallArray);
        return output;
    }

    public static boolean checkNumber(int input[], int x) {

        if(input[0]==x){return true;}

        int smallArray[]=new int [input.length-1];

        for (int i=1;i<input.length;i++) {
            smallArray[i - 1] = input[i];
        }
        boolean output=checkNumber(smallArray,x);
        return output;
    }

    public static boolean isSortedBetter(int []input,int startIndex){

        if(startIndex==input.length-1){return true;}

        if(input[startIndex]>input[startIndex+1]){return false;}

        boolean sorted=isSortedBetter(input, startIndex+1);
        return sorted;
    }

    public static boolean checkNumberBetter(int input[], int x, int startIndex) {

        if(startIndex== input.length){return false;}

        if(input[startIndex]==x){return true;}

        boolean output=checkNumberBetter(input,x,startIndex+1);
        return output;
    }

    public static int first(int input[], int x,int startIndex) {
        if(startIndex== input.length){return -1;}

        if(input[startIndex]==x){return startIndex;}

        int output=first(input,x,startIndex+1);
        return output;
    }

    public static int last(int input[], int x,int startIndex) {

        if(startIndex== input.length){return -1;}


        int k =last(input,x,startIndex+1);

        if(k!=-1){return k;
        }else {
            if(input[startIndex]==x) {
                return startIndex;
            }else{
                return -1;
            }
        }

    }

    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(sumn(10));
//        System.out.println(power(2,10));
//        System.out.println(noof(12213));
//        System.out.println(fibonacci(6));
//        printn(45);
        int[] one={5,5,5,6,9};
        System.out.println(isSortedBetter(one,0));
    }

}
