package f1.lecture8;

public class Function2 {
    public static int  sum(int a, int b) {
        int ans=0;
        ans=a+b;
        return ans;
    }

//    public static void printEvenNumbers() {
//        for(int i=2;i<=100;i+=2){
//            System.out.println(i);
//        }
//    }
    public static void printNumbersEven(int a, int b) {
        if(a%2!=0){
            a++;
        }
        for(int i=a;i<=b;i+=2){
            System.out.println(i);
        }
}
    public static void main(String[] args) {
        int a=45;
        int b=67;
        System.out.println(sum(a,b));
        printNumbersEven(a,b);
    }

}
