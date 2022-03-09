public class Result {
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
