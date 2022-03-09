import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        System.out.println("Welcome to currency conventer");
        int x=0 ;
        int c=0;
        String again;
        do {
            System.out.println("Please chose an option 1/2");
            System.out.println("1.Dollars to Shekels");
            System.out.println("2.Shekels to Dollars");
            Scanner s = new Scanner(System.in);
            int MyCoin1 = 0;
            try {
                MyCoin1 = s.nextInt();
            } catch (Exception e) {
            }
            while ((MyCoin1 != 1) && (MyCoin1 != 2)) {
                System.out.println("Invalid choice." + " please try again");
                Scanner s1 = new Scanner(System.in);
                try {
                    MyCoin1 = s1.nextInt();
                } catch (Exception e) {
                }
            }
            System.out.println("Please enter an amount to convert");
            Scanner s2 = new Scanner(System.in);
            double amount = 0.0;
            int b = 0;
            try {
                amount = s2.nextDouble();
                b++;
            } catch (Exception e) {
                while (b == 0) {
                    System.out.println("Please enter a number");
                    Scanner s3 = new Scanner(System.in);
                    try {
                        amount = s3.nextDouble();
                        b++;
                    } catch (Exception e1) {
                    }
                }
            }
            Factory factory = new Factory();
            switch (MyCoin1) {
                case 1:
                    Coin usd = factory.getCoinInstance(Coins.USD);
                    double CalculatedAmountD = usd.calculate(amount);
                    Result result = new Result();
                    myList.add(result.result(Coins.ILS, CalculatedAmountD));
                    System.out.println(amount + "  Dollars=" + CalculatedAmountD + "Shekels");
                    break;
                case 2:
                    Coin ils = factory.getCoinInstance(Coins.ILS);
                    double CalculatedAmountI = ils.calculate(amount);
                    Result result1 = new Result();
                    myList.add(result1.result(Coins.USD, CalculatedAmountI));
                    System.out.println(amount + "  Shekels=" + CalculatedAmountI + " Dollars");
                    break;
            }
            System.out.println("would you like to start over?");
            do {
                System.out.println("Please chose Y for yes or N for no");
                Scanner s3 = new Scanner(System.in);
                again = s3.next();
                if ((again.equalsIgnoreCase("n"))) {
                    x = 2;
                    System.out.println("“Thanks for using our currency converter”.");
                    System.out.println("Here is your converting results  "+myList);
                } else if (again.equalsIgnoreCase("y")) {
                    x = 1;
                } else {
                    x = 0;
                }}
                while (x == 0) ;

        }




        while (x==1);}}


















