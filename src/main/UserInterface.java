package main;

import java.util.Scanner;

public class UserInterface{
    public UserInterface(){

    }

    public void interact(){
        System.out.print("Welcome to the Rental management program.\n" +
                "Please select an option to continue:\n" +
                "1) Display the Tenant List\n" +
                "2) Input a rental payment\n" +
                "3) Display the Expense Record\n" +
                "4) Display the Annual Summary\n" +
                "5) Display the Rent Record\n" +
                "6) Add a new Tenant\n" +
                "7) Quit\n");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        while (input > -999){
            switch(input){
                case 1:
                    System.out.println("Displaying the list of tenants:");
                    TenantList tl = new TenantList();
                    tl.display();
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Displaying the Expense Record:");
                    ExpenseRecord er = new ExpenseRecord();
                    er.display();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Displaying the Rent Record:");
                    RentRecord rr = new RentRecord();
                    rr.display();
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Thanks for using the Rental management program!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please input a number 1-7");
                    break;
            }
            System.out.println(
                    "Please select an option to continue:\n" +
                    "1) Display the Tenant List\n" +
                    "2) Input a rental payment\n" +
                    "3) Display the Expense Record\n" +
                    "4) Display the Annual Summary\n" +
                    "5) Display the Rent Record\n" +
                    "6) Add a new Tenant\n" +
                    "7) Quit");
            input = in.nextInt();
        }

    }
}