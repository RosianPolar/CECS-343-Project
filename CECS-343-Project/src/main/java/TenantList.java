/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cecs.pkg343.project;

//package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TenantList {

    public void display(){
        //Retrieving all Tenants Stored.
        try {
            File myObj = new File("C:\\Users\\Damar\\Documents\\NetBeansProjects\\CECS-343-Project\\CECS-343-Project\\src\\main\\java\\listOfTenants.txt");
            Scanner scan = new Scanner(myObj);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                String[] tenant = data.split(",");
                System.out.println("aptNo " + tenant[0]);
            }
            System.out.println();
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
