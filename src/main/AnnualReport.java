package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnnualReport{
    public void display(){
        //todo Calculate all fields in the annual report



        try{
        File myObj = new File("main/annualReport");
        Scanner scan = new Scanner(myObj);
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

        while (scan.hasNextLine()) {
            String data = scan.nextLine();
            String[] expense = data.split(",");
            System.out.println(expense[0] + ":" + expense[1]);
        }
        System.out.println();
        scan.close();
    } catch (
    FileNotFoundException e) {
        System.out.println("File not found.");
        e.printStackTrace();
    }
    }
}