package f3.OOPS3;

public class Transport implements PrintInterface{
    int maxSpeed;
    String company;


    public Transport(int maxSpeed,String company){
        this.maxSpeed=maxSpeed;
        this.company=company;
    }

    public void print(){
        System.out.println(maxSpeed+" "+company);
    }
}
