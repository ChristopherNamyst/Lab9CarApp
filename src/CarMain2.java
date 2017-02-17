
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by christophernamyst on 2/16/17.
 */
public class CarMain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //THIS CALLS THE NO-ARGUMENT CONSTRUCTOR
        Car Car1 = new Car();

        ///ASK YOUR USER HOW MANY CARS THEY WILL INPUT///
        System.out.print("Welcome to my Automobile Information Application. How many cars do you have to enter? ");
        int numUsers = scan.nextInt();

        ///ANOTHER STATEMENT BY PROGRAM////
        System.out.println("OK, Let's get started, shall we...");
        System.out.println();

        ///CREATE THE ARRAYLIST
        ArrayList<Car> carList = new ArrayList<>();

        ///MAKE AND STORE THE REQUIRED # OF CARS///
        for (int i = 0; (i < numUsers); i++) {

            ///GET INFO///
            System.out.println("To start, what is the make of the car? ");
            String make = scan.next();

            ///ASK FOR THE MODEL OF THE CAR///
            System.out.println("And the model of the car? ");
            String model = scan.next();

            ///ASK FOR THE YEAR OF THE CAR///
            System.out.println("How about the year? ");
            int year = scan.nextInt();

            System.out.println("Lastly, please tell me the price of the car. ");
                Double price = scan.nextDouble();

                ///CREATE A NEW INSTANCE///
                Car c = new Car(make, model, year, price);

                ///ADD IT TO THE ARRAY LIST///
                carList.add(c);

            }
            ///LETTTING USER KNOW INPUT IS COMING///
            System.out.println("Thank you for your input. Here is your chart:  ");


            ///GO THRU USERS///
            for (Car c : carList) {
                ///AND OUTPUT THEM///
                System.out.println(c);
                System.out.println();

            }


        }
    }

