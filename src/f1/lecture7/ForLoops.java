package f1.lecture7;

public class ForLoops {
    public static void main(String[] args) {
        int n=5;
//        int i=1;//initialisation
//        while(i<=n){//condition
//            System.out.println(i);
//            i++;//loop step


//        for (int i=1,j=1;i<=n;i++,j+=20){//(initialisation;condition;loop step)
//            System.out.println(i+" "+j);

        for (int i=1,j=1;i<=n && j<=60;i++,j+=20){//(initialisation;condition;loop step)
            System.out.println(i+" "+j);
        }
    }
}
