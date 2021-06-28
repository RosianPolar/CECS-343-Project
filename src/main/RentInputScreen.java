package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.*;
public class RentInputScreen extends RentRow{
    private float rentPaid; String renterName; int month; int aptNo; 
    private String rent[];
       
    public void addRent()
            
    {
        String[]rent = {"AptNo  ","Jan    ","Feb  "," Mar   ","Apr   ","May   ","Jun   ","Jul   ","Aug   ","Sep   ","Oct ","Nov ","Dec"};
        int[]apt={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        float[][]array = new float[21][13];
        for(int i = 0; i<20;i++)
        {
            for(int j = 0; j<13;j++)
            {
                array[i][j] = 0;
                
            }
        }
            Scanner scanny = new Scanner(System.in);
            System.out.println("Enter the month that you wish to pay rent for: ");
            month = scanny.nextInt();
            System.out.println("Enter the apt #: ");
            aptNo = scanny.nextInt();
            System.out.println("enter rent paid: ");
            rentPaid = scanny.nextInt();
            array[aptNo-1][month] = rentPaid;
        try {
            
            PrintWriter rf = new PrintWriter("C:\\Users\\Damar\\Documents\\NetBeansProjects\\CECS-343-Project\\CECS-343-Project\\src\\main\\java\\rentRecord.txt");
            for(int i =0; i < 13;i++)
            {
                rf.print(rent[i]);
                //rf.print("\t");
            }rf.print("\n");
            for(int i = 0; i<20;i++)
        {       rf.print(apt[i]);
                //rf.print("\t");
            for(int j = 0; j<13;j++)
            {
                
                rf.print(array[i][j]);
                //rf.print("\t");
            }rf.print("\n");
        }rf.close();
            
          }
        catch (IOException e) {
            System.out.println("FILE NOT FOUND ");
            e.printStackTrace();
        }
        
    }
    
}
