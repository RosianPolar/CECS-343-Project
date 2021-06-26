import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
public class RentInputScreen {
    String n;
    private String newRentInfo;
    public void addRent()
    {
        try {
            FileWriter rf = new FileWriter("rentRecord.txt");
            Scanner scanny = new Scanner(System.in);
            
            while(scanny.hasNextLine())
            {
                newRentInfo = scanny.nextLine();
            }   rf.write(newRentInfo);
            
           
        }
        catch (IOException ex) {
            System.out.println("FILE NOT FOUND ");
        }
        
    }
    
}
