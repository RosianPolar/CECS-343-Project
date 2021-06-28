package main;
import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.FilenotFoundException;
import java.io.IOException;

public class ExpenseInputScreen extends Expense{
  private double newExpenseInfo;
  
  public void display(){
    try {
        FileWriter ex = new FileWriter ("expense.txt");
        Scanner scan = new Scanner (System.in);
        char control = 'n';
        do {
          System.out.println ("Please enter the expense amount in number: ");
            while (scan.hasNextDouble())
            {
             newExpenseInfo = scan.nextDouble ();
            }
              ex.write(newExpenseInfo);
            System.out.println ("Would you like to add more expenses? " + 
                                "\n 'Y/y' or for Yes and 'N/n' to leave the Expense Input Screen")?
              while (scan.hasNextLine ())
              {
                control = scan.nextLine().charAt(0);
              }
           } while (control!= 'n' || control!= 'N';)
        } catch (FileNotFoundException e){
          e.printStackTrace ();    
        } catch (IOException e) {
          e.printStackTrace ();
    }
  
  }
  
}
  
}
