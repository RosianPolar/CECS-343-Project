package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class RentRecord{
    public void display(){
        
        try {
            File myObj = new File("main/rentRecord");
            Scanner scan = new Scanner(myObj);
            System.out.println(scan.nextLine());
            System.out.println(scan.nextLine());
            
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                String[] rent = data.split(",");
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
        float total = 0;
        try {
            Scanner read = new Scanner(new BufferedReader(new FileReader("main/rentRecord")));
            while(read.hasNext())
            {
                if(read.hasNextFloat())
                {
                    total += read.nextFloat();
                }
                else
                    read.next();   
            }
                
            read.close();
            System.out.println("yearly rent total: $" + total+"\n");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        return 0.0f;
    }

}
