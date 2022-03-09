public  class ILS extends Coin{
    static final double value = 0.28;

    @Override
    public    double getValue() {return value;
    }

    @Override
    public  double calculate(double a) {
      double c=a*value;
      return c;
    }


}
