public class Result {
    /*This methods gets the current coin and the results
    of the calculation, and returns a string to be used in the arrayList
     */
    public String result(Coins coins, double b){
        switch (coins){

            case ILS -> {
                return "Dollars to Shekels  "+b;
            }
            case USD -> {
            return  "Shekels to Dollars  "+b;}
            default -> {
            }
        }
            return null;

        }
        }
