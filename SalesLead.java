package com.company;
import java.util.Scanner;
import java.lang.System;

public class SalesLead {
    private String salesLeadID;
    private String salesLeadFirstName;
    private String salesLeadLastName;
    private String salesLeadNumber;
    private String salesLeadeMail;
    Scanner ab = new Scanner(System.in);

    public String getSalesLeadeMail() {return salesLeadeMail;}

    public String setSalesLeadeMail (String _SalesLeadMail) {

        System.out.print("Please enter email: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco7 = ab.nextLine();
        System.out.println();

        this.salesLeadeMail = loco7;
        return salesLeadeMail;}

    public String getsalesLeadID() {return salesLeadID;}
    public String setsalesLeadID (String _salesLeadID) {
        System.out.print("Please enter Employees Sales Lead Number: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco8 = ab.nextLine();
        System.out.println();


        this.salesLeadID = loco8;
        return salesLeadID;}

    public String getsalesLeadFirstName() {return salesLeadFirstName;}
    public String setsalesLeadFirstName (String _salesLeadFirstName) {
        System.out.print("Please enter Sales Leads First Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco9 = ab.nextLine();
        System.out.println();


        this.salesLeadFirstName = loco9;
        return salesLeadFirstName;}

    public String getsalesLeadLastName() {return salesLeadLastName;}
    public String setsalesLeadLastName(String _salesLeadLastName) {

        System.out.print("Please enter Sales Lead Last Name: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco10 = ab.nextLine();
        System.out.println();


        this.salesLeadLastName = loco10;
        return salesLeadLastName;}





    public String getsalesLeadNumber() {return salesLeadNumber;}
    public String setSalesLeadNumber(String _salesLeadNumber) {

        System.out.print("Please enter Customers Sales Lead Number: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String loco11 = ab.nextLine();
        System.out.println();


        this.salesLeadNumber = loco11;

        return salesLeadNumber;}




}
