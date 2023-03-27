package f1.lecture4;

public class ScopeOfVariables {
    public static void main(String[] args) {

        int i = 1;
        while (i<=5) {
            int j = 10;
            System.out.println(j);
            i++;
            j++;
            //THIS J'S VALUE WILL INCREASE TO 11 FOR A SINGLE LOOP AND AGAIN WILL BE 10

        }
        System.out.println(i);

//        System.out.println(j);


//        int a = 10;
//        if (a>=10) {
//            int b = 10;
//            System.out.println(b);
//
//        } else {
//            int b = 15;
//            System.out.println(b);
//        }

    }
}
