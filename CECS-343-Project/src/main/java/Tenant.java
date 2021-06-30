/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cecs.pkg343.project;

public class Tenant{
    private String name;
    private int aptNumber;

    public Tenant(){
        name = "";
        aptNumber = 0;
    }

    public Tenant(String n, int apn ){
        name = n;
        aptNumber = apn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(int aptNumber) {
        this.aptNumber = aptNumber;
    }
}

