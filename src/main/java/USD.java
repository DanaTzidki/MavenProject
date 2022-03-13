import java.util.ArrayList;
/*This class used the final double value of Shekels (
converting from Dollar)
 */
public class USD extends Coin {
    final double value=3.52;
    @Override
    public   double getValue(){
        return value;
    }
/*This method does the calculation from Dollars to Shekels*/

    @Override
    public  double calculate(double a) {
      double c= a*value;
      return c;
    }
    }




