package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class RentRecord{
    public void display(){
        System.out.println("apt\t"+"Jan\t"+"Feb\t"+"Mar\t"+"Apr\t"+"May\t"+"Jun\t"+"Jul\t"+"Aug\t"+"Sep\t"+"Oct\t"+"Nov\t"+"Dec\t");
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
            Scanner read = new Scanner(new BufferedReader(new FileReader("C:\\Users\\Damar\\Documents\\NetBeansProjects\\CECS-343-Project\\CECS-343-Project\\src\\main\\java\\rentRecord.txt")));
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
            System.out.println("yearly renttotal:$ " + total+"\n");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        return 0.0f;
    }

}
