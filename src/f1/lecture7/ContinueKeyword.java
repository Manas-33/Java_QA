package f1.lecture7;

public class ContinueKeyword {
    public static void main(String[] args) {

        int n=5;
        for (int i=1;i<=n;i++){
            if (i==4) {
                continue;
            }
            System.out.println(i);
        }


//        int i=1;
//        int n=5;
//        while(i<=n){
//            i++;
//            if (i==4){
////                break;
//                continue;
//            }
////            i++;
//            System.out.println(i);
//        }
    }
}
