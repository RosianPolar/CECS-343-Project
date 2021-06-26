import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
public class RentInputScreen extends RentRow{
    private int rentPaid; String renterName; int month; int aptNo; 
    private String rent[];
       
    public void addRent()
            
    {
        String[]rent = {"AptNo","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int[][]array = new int[20][12];
        for(int i = 0; i<19;i++)
        {
            for(int j = 0; j<12;j++)
            {
                array[i][j] = 0;
            
            }
        }
            Scanner scanny = new Scanner(System.in);
            System.out.println("Enter the month that you wish to pay rent for: ");
            month = scanny.nextInt();
            System.out.println("Enter the apt #: ");
            aptNo = scanny.nextInt();
            System.out.println("enter rent paid: ");
            rentPaid = scanny.nextInt();
            array[aptNo][month] = rentPaid;
        try {
            
            FileWriter rf = new FileWriter("rentRecord.txt");
            for(int i = 0; i<19;i++)
        {
            for(int j = 0; j<12;j++)
            {
                rf.write(array[i][j]);
            
            }
        }rf.close();
            
          }
        catch (IOException e) {
            System.out.println("FILE NOT FOUND ");
            e.printStackTrace();
        }
        
    }
    
}
