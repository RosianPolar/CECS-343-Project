package main;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TenantInputScreen extends Tenant{
        private String newTenantFName;
        private int newTenantAptNo;


        public void addTenant() throws IOException {
                try {
                       
                        PrintWriter rf = new PrintWriter (new FileWriter("main/listOfTenants", true));
                        Scanner scan = new Scanner(System.in);
                        String control = "";
                        do {
                                System.out.println("Please enter the Tenant's Full Name \n");
                                
                                
                                        newTenantFName = scan.nextLine();
                                
                                        System.out.println("Please enter the Tenant's Apartment Number: ");
                                
                                
                                        newTenantAptNo = scan.nextInt();
                                
                                        String currTenantAptNo = Integer.toString(newTenantAptNo);
                                        rf.write("\n");
                                        rf.write(newTenantFName);
                                        rf.write(", ");
                                        rf.write(currTenantAptNo);
                                        //rf.write("\t");

                                        
                                        System.out.println("Would you like to add another Tenant? " +
                                        "\n 'Y/y' or ANY key BUT 'N/n' to add | 'N/n' to quit the Tenant Input Screen");
                                
                                        scan.nextLine();
                                        control = scan.nextLine();
                                        control = control.toLowerCase().substring(0,1);
                                
                        } while (!control.equals("n")); rf.close();
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
        }

}
