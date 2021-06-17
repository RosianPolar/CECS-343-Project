package main;

public class Tenant{
    private String name;
    private int aptNumber;

    public Tenant(){
        name = "";
        aptNumber = 0;
    };

    public Tenant(String n, int apn ){
        name = n;
        aptNumber = apn;
    }

    public int getAptNumber(){
        return aptNumber;
    }
    public String getName(){
        return name;
    }
}