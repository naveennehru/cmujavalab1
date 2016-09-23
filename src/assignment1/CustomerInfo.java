/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.time.LocalDateTime; // program uses class LocalDateTime
import java.util.Random;  // program uses class Random
import java.util.Scanner; // program uses class Scanner

/**
 * This class performs the input data gathering, arithmetic operations and
 * output formatting
 * @author Naveen Nehru
 * @version 1.0
 * @since 04-Sep-2016
 */
public class CustomerInfo {
    //create input object to obtain integer,floating decimals inputs from command prompt
    Scanner input = new Scanner(System.in);
    //create input_string object to obtain string input from command prompt
    Scanner input_string = new Scanner(System.in);

    String custname, itemname1, itemname2, itemname3; //declaring customer name,item name as string
    int itemquantity1, itemquantity2, itemquantity3; //declaring item quantity as integer
    double price1, price2, price3; //declaring item price as double
    double total1, total2, total3, subtotal, salestax, total; //declaring individual item totals,subtotal,final total as double
    

    /**
     * method to gather input details
     */
    void getItemDetails() {

        System.out.print("Enter name of customer:");
        custname = input_string.nextLine(); // get customer name
        System.out.println("Enter name of product 1:");
        itemname1 = input_string.nextLine();  // get 1st item name
        System.out.println("Enter quantity of  product 1:");
        itemquantity1 = input.nextInt();  // get 1st item quantity
        System.out.println("Enter price of  product 1:");
        price1 = input.nextDouble();  // get  1st item price

        System.out.println("Enter name of product 2:");
        itemname2 = input_string.nextLine(); // get 2nd item name
        System.out.println("Enter quantity of  product 2:");
        itemquantity2 = input.nextInt(); // get 2nd item quantity
        System.out.println("Enter price of  product 2:");
        price2 = input.nextDouble(); // get  2nd item price

        System.out.println("Enter name of product 3:");
        itemname3 = input_string.nextLine(); // get 3rd item name
        System.out.println("Enter quantity of  product 3:");
        itemquantity3 = input.nextInt(); // get 3rd item quantity
        System.out.println("Enter price of  product 3:");
        price3 = input.nextDouble(); // get  3rd item price
    } //  end getItemDetails() method

    /**
     * method to calculate individual items pricing,subtotal,sales tax and final
     * total
     */
    void performOperations() {
        total1 = itemquantity1 * price1;
        total2 = itemquantity2 * price2;
        total3 = itemquantity3 * price3;
        subtotal = total1 + total2 + total3;
        salestax = (subtotal * 7.25) / 100;
        total = subtotal + salestax;
    } // end performOperations() method

    /**
     * method to generate the final invoice output
     */
    void displayScreen() {
        
        LocalDateTime currenttime = LocalDateTime.now();// assigning the current date-time from the system 
        int year = currenttime.getYear(); //assigning year field
        int month = currenttime.getMonthValue(); //assigning month of year field
        int day = currenttime.getDayOfMonth(); //assigning day of month field
        System.out.println("\nInvoice for " + custname); //printing customer name
        Random rand = new Random(); //create object for Random
        int invoiceno = rand.nextInt(90000) + 10000; // generating random 5-digit no for invoice
        
        //printing invoice number and current date
        System.out.printf("%-12s%-28d%-5s%02d-%02d-%d\n", "Invoice No: ", invoiceno, "Date:", day, month, year); 
        
        //printing header  
        System.out.printf("%-30s%-10s%-10s%-10s\n", "Item", "Quantity", "Price", "Total"); 

        //formatting the column limits as per problem statement and rounding the pricing to two decimal places
        System.out.printf("%-30s%-10d%-10.2f%-10.2f\n", itemname1, itemquantity1, price1, total1);
        System.out.printf("%-30s%-10d%-10.2f%-10.2f\n", itemname2, itemquantity2, price2, total2);
        System.out.printf("%-30s%-10d%-10.2f%-10.2f\n", itemname3, itemquantity3, price3, total3);

        System.out.printf("%-50s%-10.2f\n", "Subtotal", subtotal); //printing sub-total
        System.out.printf("%-50s%-10.2f\n", "7.25% salex tax", salestax);//printing salextax
        System.out.printf("%-50s%-10.2f\n", "Total", total); //printing final total

    } // end displayScreen() method
} //end CustomerInfo class
