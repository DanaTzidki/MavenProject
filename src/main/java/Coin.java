public abstract class Coin implements ICalculate {
public  abstract double   getValue();

    @Override
    public double calculate(double a) {
        return getValue();
    }
}