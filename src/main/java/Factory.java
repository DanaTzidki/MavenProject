public class Factory {


    public  Coin  getCoinInstance(Coins coins) {
        switch (coins){case USD -> {
            return new USD();
        }

            case ILS -> {
            return new ILS();}
            default ->{}
            }



        return null;
    }

    }












