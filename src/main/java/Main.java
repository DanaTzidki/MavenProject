import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.Files.*;


public class Main {
    public static void main(String[] args) throws IOException {
        /*Creating a list for the converting result*/
        ArrayList<String> myList = new ArrayList<String>();
        System.out.println("Welcome to currency conventer");
        /*This veriable is used for repeating/not repeating the program*/
        int x=0 ;
        /*This String is used */
        String again;
        /*Taking input from user in order to convert*/
        /*It has to be used at list once*/
        do {
            System.out.println("Please chose an option 1/2");
            System.out.println("1.Dollars to Shekels");
            System.out.println("2.Shekels to Dollars");
            Scanner s = new Scanner(System.in);
            int MyCoin1 = 0;
            /*Trying to get an int for user*/
            try {
                MyCoin1 = s.nextInt();
                /*If user insert not an int or not 1 2/*/
            } catch (InputMismatchException e )
             {}
            while ((MyCoin1 != 1) && (MyCoin1 != 2)) {
                System.out.println("Invalid choice." + " please try again");
                Scanner s1 = new Scanner(System.in);
                  try{  MyCoin1 = s1.nextInt();}catch (Exception e1){}
                }
            /*Getting an amount from user*/

            System.out.println("Please enter an amount to convert");
            Scanner s2 = new Scanner(System.in);
            double amount = 0.0;
            /*This variable is used to get in/out of a loop
            for case user will not insert a double*/
            int b = 0;
            try {
                amount = s2.nextDouble();
                b++;
            } catch (InputMismatchException e) {
                while (b == 0) {
                    System.out.println("Please enter a number");
                    Scanner s3 = new Scanner(System.in);
                    try {
                        amount = s3.nextDouble();
                        b++;
                    } catch (InputMismatchException e1) {
                    }
                }
            }
            Factory factory = new Factory();
            switch (MyCoin1) {
                /*Case user insert 1 it used the Factory class to create
                a USD object for the calculation */
                case 1:
                    Coin usd = factory.getCoinInstance(Coins.USD);
                    double CalculatedAmountD = usd.calculate(amount);
                    Result result = new Result();
                    /*Adding the result object to the result ArrayList*/
                    myList.add(result.result(Coins.ILS, CalculatedAmountD));
                    /*Printing the results*/
                    System.out.println(amount + "  Dollars=" + CalculatedAmountD + "Shekels");
                    break;
                      /*Case user insert 1 it used the Factory class to create
                aN ILS object for the calculation */
                case 2:
                    Coin ils = factory.getCoinInstance(Coins.ILS);
                    double CalculatedAmountI = ils.calculate(amount);
                    Result result1 = new Result();
                    /*Adding the result object to the result ArrayList*/
                    myList.add(result1.result(Coins.USD, CalculatedAmountI));
                    /*Printing the results*/
                    System.out.println(amount + "  Shekels=" + CalculatedAmountI + " Dollars");
                    break;
            }
            System.out.println("would you like to start over?");
            /*It must be used at least once , or in case user will insert wrong input,
            it will repeat  */
            do {
                System.out.println("Please chose Y for yes or N for no");
                Scanner s3 = new Scanner(System.in);
                /*Case user chose not to continue*/

                again = s3.next();
                if ((again.equalsIgnoreCase("n"))) {
                    x = 2;
                    System.out.println("Thanks for using our currency converter");
                    System.out.println("Here is your converting results:  ");
                    /*Creating a file for the result*/
                    String path="resultsFile.txt";
                    /*Printing all results to screen*/

                    for(int i=0;i< myList.size();i++)
                    {
                        System.out.print(myList.get(i));
                        System.out.println();}
                    /*Wrting results to the file*/
                    writeString(Paths.get(path), "results"+myList);
                    /*Case user chose to continue*/
                } else if (again.equalsIgnoreCase("y")) {
                    x = 1;
                    /*Case user insert wrong input(not y or n)*/
                } else {
                    x = 0;
                }}
                while (x == 0) ;
        }
        /*case user chose n , the program will run again*/
        while (x==1);}}


















