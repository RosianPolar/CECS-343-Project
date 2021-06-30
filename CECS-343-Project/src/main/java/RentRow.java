/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cecs.pkg343.project;

public class RentRow{

    int aptNo;
    float[] rent ;
    float rentPaid;
    // The array represents each month of the year and what rent was paid for each month.
    // The array is [12] because we store 12 months AND the aptNo here.

    public RentRow(){
        aptNo = 0;
        rent = new float[12];
    }

    public RentRow(int apn, float[] rarray){
        aptNo = apn;
        rent = rarray;
    }

    public int getAptNo() {
        return aptNo;
    }

    public void setAptNo(int aptNo) {
        this.aptNo = aptNo;
    }

    public float[] getRent() {
        return rent;
    }

    public void setRent(float[]rent) {
        this.rent = rent;
    }
}
