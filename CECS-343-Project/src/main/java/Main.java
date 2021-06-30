/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cecs.pkg343.project;

public class Main{
    public static void main(String[] args){
        //Sanity Check
        System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();


         UserInterface us = new UserInterface();
         us.interact();



    }
}