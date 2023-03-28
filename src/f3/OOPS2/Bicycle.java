package f3.OOPS2;

public abstract class Bicycle extends Vehicle{
    public Bicycle(int maxSpeed) {
        super(maxSpeed);
    }
    public Bicycle(){
        System.out.println("Bicycle's Constructor");
    }

    @Override
    public boolean isMotorized() {
        return false;
    }
}
