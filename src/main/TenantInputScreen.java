package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TenantInputScreen extends Tenant{
        private String newTenantFName;
        private float newTenantAptNo;


        public void addTenant() {
                try {
                        FileWriter fw = new FileWriter("listOfTenants.txt");
                        Scanner scan = new Scanner(System.in);
                        String control = "";
                        do {
                                System.out.println("Please enter the Tenant's Full Name \n");
                                while(scan.hasNextLine())
                                {
                                        newTenantFName = scan.nextLine();
                                }
                                System.out.println("Please enter the Tenant's Apartment Number: ");
                                while(scan.hasNextFloat())
                                {
                                        newTenantAptNo = scan.nextFloat();
                                }
                                        String currTenantAptNo = String.valueOf(newTenantAptNo);
                                        fw.write(newTenantFName);
                                        fw.write(currTenantAptNo);
                                System.out.println("Would you like to add another Tenant? " +
                                        "\n 'Y/y' or ANY key BUT 'N/n' to add | 'N/n' to quit the Tenant Input Screen");
                                while(scan.hasNextLine())
                                {
                                        control = scan.nextLine();
                                        control = control.toLowerCase();
                                }
                        } while (control!= "n");
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

}