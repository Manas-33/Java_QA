package f3.OOPS3;



public class Print {
    public static<T> void printArray(T arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//    public static<T extends Transport> void printMethod(T arr[]){ We write T extends Transport because not all classes have a print method
        // which we can bound by extending it to Transport class.
        // It can accept the class Transport and all the Sub classes of Transport
    public static<T extends PrintInterface> void printMethod(T arr[]){// So here by using interface this method becomes more open
        for (int i = 0; i < arr.length; i++) {
           arr[i].print();
        }
    }
    public static void main(String[] args) {


//        Integer arr[]=new Integer[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=3*i+2;
//        }
//        printArray(arr);
//
//        String aS[]=new String[5];
//        for (int i = 0; i < aS.length; i++) {
//            aS[i]="ab";
//        }
//        printArray(aS);

        Transport v[]=new Transport[5];
        for (int i = 0; i < v.length; i++) {
            v[i]=new Transport(10*i+1,"a");
        }
        printArray(v);
        printMethod(v);
        Student s[]= new Student[5];
        for (int i = 0; i < s.length; i++) {
            s[i]=new Student(3*i+1);
        }
        printMethod(s);


    }
}
