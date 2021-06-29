package main;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ExpenseInputScreen extends Expense{
  private Float dateMonth;
  private Float dateDay;
  private String payee;
  private Float amount;
  private String category;
  //get date, payee, amount, category
  /* Date    Payee       Amount      Category
------------------------------------------
      1/2,    City Water, 978,       Utilities
      2/15,   All State,  4840,      Insurance*/
  public void display() throws IOException {
    try
    {
        FileWriter ex = new FileWriter ("expense.txt");
        Scanner scan = new Scanner (System.in);
        String control = "";
        String newExpenseInfo;
        do {
            System.out.println ("Please enter the month for this expense: e.g. 3 for March");

            dateMonth = scan.nextFloat();

            System.out.println ("Please enter name of the payee for this transaction");

            payee = scan.nextLine();

            System.out.println ("Please enter the expense amount in number: ");

             amount = scan.nextFloat();
             scan.nextLine();

            System.out.println ("Please enter name of the category for this transaction");

            category = scan.nextLine();


            newExpenseInfo = dateMonth + "/" + dateDay + ", " + payee + ", " + amount + ", " + category;
            ex.write(newExpenseInfo);
            System.out.println ("Would you like to add more expenses? " + 
                                "\n 'Y/y' or for Yes and 'N/n' to leave the Expense Input Screen");
            while (scan.hasNextLine ())
            {
                control = scan.nextLine();
                control = control.toLowerCase().substring(0,1);
            }

           } while (!control.equals("n"));
        } catch (FileNotFoundException e){
          e.printStackTrace ();    
        }

  }
  
}
  

