package com.company;


import java.util.Scanner;
import java.lang.System;
import java.text.SimpleDateFormat;


public class dealership {
    private String  Location, SellerLastName, SellerFirstName, BuyerLastName, BuyerFirstName;
    private String date;
    private String VehicleRegistration;
    Scanner ss = new Scanner(System.in);


    //Setters and Getters
    public String getLocation() {
        return Location;
    }

    public String setLocation(String Location) {

        System.out.print("Please enter location: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco1 = ss.nextLine();
        System.out.println();

        this.Location = loco1;
        return Location;
    }

    public String getSellerLastName() {
        return this.SellerLastName;
    }

    public String setSellerLastName(String SellerLastName) {
        System.out.print("Please enter Seller's Last Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco2 = ss.nextLine();
        System.out.println();

        this.SellerLastName = loco2;

        return SellerLastName;
    }

    public String getSellerFirstName() {

        return SellerFirstName;
    }

    public String setSellerFirstName(String SellerFirstName) {
        System.out.print("Please enter Seller's First Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco3 = ss.nextLine();
        System.out.println();

        this.SellerFirstName = loco3;
        return SellerFirstName;
    }

    public String getBuyerFirstName() {
        return BuyerFirstName;
    }

    public String setBuyerFirstName(String BuyerFirstName) {
        System.out.print("Please enter Buyer's First Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco4 = ss.nextLine();
        System.out.println();

        this.BuyerFirstName = loco4;
        return  BuyerFirstName;
    }

    public String getBuyerLastName() {
        return BuyerLastName;
    }

    public String setBuyerLastName(String BuyerLastName) {
        System.out.print("Please enter Buyer's Last Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco5= ss.nextLine();
        System.out.println();

        this.BuyerLastName = loco5;
        return  BuyerLastName;
    }

    //public String getdate() {
      //  return date;
    //}

    //public String setdate(String date) {
        //System.out.print("Please enter Date: ");
        //Scanner reader = new Scanner(System.in);  // Reading from System.in
        //String loco5= ss.nextLine();
        //System.out.println();

       // this.BuyerLastName = loco5;
        //this.date = date;
        //return date;
    //}

    public String getVehicleRegistration() {
        return VehicleRegistration;
    }

    public String setVehicleRegistration(String VehicleRegistration) {
        System.out.print("Please enter Vehicle Registration: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco6= ss.nextLine();
        System.out.println();

        this.VehicleRegistration = loco6;
        return VehicleRegistration;
    }
}
