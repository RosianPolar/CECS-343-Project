import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.*;
import java.io.File;
public class RentInputScreen extends RentRow{
    private float rentPaid; String renterName; int month; int aptNo; float rent[];
    
       
    public void addRent()
            
    {
        float[]rent = new float[13];
        int temp[] = new int[100000000];
            for(int j = 0; j<12;j++)
            {
                rent[j] = 0;  
            }
        
            Scanner scanny = new Scanner(System.in);
            System.out.println("Enter the month that you wish to pay rent for: ");
            month = scanny.nextInt();
            System.out.println("Enter the apt #: ");
            aptNo = scanny.nextInt();
            System.out.println("enter rent paid: ");
            rentPaid = scanny.nextFloat();
            temp[0] = aptNo;
            rent[month-1] = rentPaid;
           
        try {

            PrintWriter rf = new PrintWriter (new FileWriter("main/rentRecord", true));
            rf.print(temp[0]);
            rf.print("\t");
            
            for(int j = 0; j<12;j++)
            {
                rf.print(rent[j]);
                rf.print("\t");
            }rf.print("\n");
            rf.close();
          }
        catch (IOException e) {
            System.out.println("FILE NOT FOUND ");
            e.printStackTrace();
        }
        
    }
    
}