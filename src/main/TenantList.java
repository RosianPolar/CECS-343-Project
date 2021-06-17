package main;

import java.util.ArrayList;

public class TenantList {
    private ArrayList<Tenant> tenantList;

    public void display(){
        System.out.println("Displaying the list of all Tenants:\n");
        for(Tenant t : tenantList){
            System.out.print("AptNo: "+ t.getAptNumber() + " : " + t.getName());
        }
    }
}