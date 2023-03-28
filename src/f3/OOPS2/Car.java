package f3.OOPS2;

public abstract class Car extends Vehicle{
    int numDoors;
//    int maxSpeed;
    int numGears;

    public Car(int numDoors,int maxSpeed){
        super(maxSpeed);
        System.out.println("Car Constructor");
        this.numDoors=numDoors;
    }
    public Car(){
        System.out.println("Car's Constructor");
        numDoors=4;
        numGears=5;
    }
    public void print() {
        super.print();
        System.out.println("Car: "+ "numDoors "+numDoors+" numGears "+numGears);
    }

    @Override
    public boolean isMotorized() {
        return true;
    }
    //    public void print() {
//        super.print();
//        super.maxSpeed=23;
//        System.out.println("Car: "+ "colour "+getColour()+" maxspeed car "+maxSpeed+" doors "+numDoors+" maxspeed vehicle "+super.maxSpeed);
//    }
}
