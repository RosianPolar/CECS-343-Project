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
            while (scan.hasNextFloat())
            {
                dateMonth = scan.nextFloat();
            }
            System.out.println ("Please enter the day for this expense: e.g. 16 for 16th of a given month");
            while (scan.hasNextFloat())
            {
                dateDay = scan.nextFloat();
            }
            System.out.println ("Please enter name of the payee for this transaction");
            while (scan.hasNextLine())
            {
                payee = scan.nextLine();
            }
            System.out.println ("Please enter the expense amount in number: ");
            while (scan.hasNextFloat())
            {
             amount = scan.nextFloat();
            }
            System.out.println ("Please enter name of the category for this transaction");
            while (scan.hasNextLine())
            {
                category = scan.nextLine();
            }

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
  

