/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// cecs.pkg343.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RentRecord{
    public void display(){
        try {
            File myObj = new File("C:\\Users\\Damar\\Documents\\NetBeansProjects\\CECS-343-Project\\CECS-343-Project\\src\\main\\java\\rentRecord.txt");
            Scanner scan = new Scanner(myObj);
            System.out.println(scan.nextLine());
            System.out.println(scan.nextLine());

            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                //String[] rent = data.split(",");
                System.out.println(data);
            }
            System.out.println();
            getSumOfRent();

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    public float getSumOfRent(){
        try {
            File myObj = new File("main/rentRecord");
            Scanner scan = new Scanner(myObj);
            scan.nextLine();
            scan.nextLine();

            int totalRent = 0;
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                String[] rent = data.split(",");

                int yearlyRent = Integer.parseInt(rent[0]) * -1;
                for(String s : rent){
                    yearlyRent += Integer.parseInt(s.replaceAll(" ", ""));
                }

                totalRent += yearlyRent;
                // System.out.println("Yearly rent of AptNo: " + rent[0]
                //        + ": " + yearlyRent);
            }
            scan.close();
           // System.out.println("Total rent: " + totalRent);
           // System.out.println();
            return Float.parseFloat(String.valueOf(totalRent));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        return 0.0f;
    }

}