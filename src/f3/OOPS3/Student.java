package f3.OOPS3;

public class Student implements PrintInterface{
    int rollNo;
    public Student(int rollNo){
        this.rollNo=rollNo;
    }
    @Override
    public void print() {
        System.out.println(rollNo);
    }
}
