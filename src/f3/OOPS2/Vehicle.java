package f3.OOPS2;

public abstract class Vehicle {
    private String colour;
    int maxSpeed;
    public Vehicle(){
        System.out.println("Vehicle Constructor");
        maxSpeed=60;
    }
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle Constructor");
        this.maxSpeed=maxSpeed;
    }
    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    public void print() {

        System.out.println("Vehicle "+ "colour "+colour+" maxspeed "+maxSpeed);
    }

    public abstract boolean isMotorized();
    public abstract String getCompany();
}
