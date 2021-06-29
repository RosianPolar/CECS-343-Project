package main;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TenantInputScreen extends Tenant{


        public void addTenant() throws IOException {
                try {
                        FileWriter fw = new FileWriter("listOfTenants.txt");
                        Scanner scan = new Scanner(System.in);
                        String control;
                        do {
                                System.out.println("Please enter the Tenant's Full Name \n");

                                String newTenantFName = scan.nextLine();

                                System.out.println("Please enter the Tenant's Apartment Number: ");

                                int newTenantAptNo = scan.nextInt();

                                        String currTenantAptNo = Integer.toString(newTenantAptNo);
                                        fw.write(newTenantFName);
                                        fw.write(currTenantAptNo);
                                System.out.println("Would you like to add another Tenant? " +
                                        "\n 'Y/y' or ANY key BUT 'N/n' to add | 'N/n' to quit the Tenant Input Screen");

                                        scan.nextLine();
                                        control = scan.nextLine();
                                        control = control.toLowerCase().substring(0,1);

                        } while (!control.equals("n"));
                        fw.close();
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
        }

}