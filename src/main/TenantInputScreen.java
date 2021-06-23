package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TenantInputScreen extends Tenant{
        private String newTenantInfo;


        public void addTenant() {

                try {

                        FileWriter fw = new FileWriter("listOfTenants.txt");
                        Scanner scan = new Scanner(System.in);
                        char control = 'n';
                        do {

                        System.out.println("Please enter the Tenant's Full Name and Apt No. as follows: \n"
                         + "John Doe, ###");
                        while(scan.hasNextLine())
                        {
                                newTenantInfo = scan.nextLine();
                        }
                                fw.write(newTenantInfo);
                        System.out.println("Would you like to add another Tenant? " +
                                "\n 'Y/y' or ANY key BUT 'N/n' to add | 'N/n' to quit the Tenant Input Screen");
                        while(scan.hasNextLine())
                        {
                                control = scan.nextLine().charAt(0);
                        }
                        } while (control!='n' || control!='N');
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

}