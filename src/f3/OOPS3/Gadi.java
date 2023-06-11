package f3.OOPS3;

public class Gadi extends Vahan implements VahanInterface, GadiInterface{
    @Override
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public int numGears() {
        return 0;
    }

}
