package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TenantList {
    private ArrayList<Tenant> tenantList;

    public void display(){
        //Retrieving all Tenants Stored.
        try {
            File myObj = new File("listOfTenants.txt");
            Scanner scan = new Scanner(myObj);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                String[] tenant = data.split(",");
                tenantList.add(new Tenant(tenant[0], Integer.parseInt(tenant[1])));
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        System.out.println("Displaying the list of all Tenants:\n");
        for(Tenant t : tenantList){
            System.out.print("AptNo: "+ t.getAptNumber() + " : " + t.getName());
        }
    }
}