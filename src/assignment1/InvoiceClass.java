/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 * This program is to generate customer invoice bill
 * @author Naveen Nehru
 * @version 1.0
 * @since 04-Sep-2016
 */
//This parent class contains the main method and calls the other child class 
public class InvoiceClass {

    /**
     * main method begins program execution
     *
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //creating object-custobj for CustomerInfo class                  
        CustomerInfo custobj = new CustomerInfo();
        custobj.getItemDetails(); //invoking the getItemDetails method
        custobj.performOperations(); //invoking the performOperations method
        custobj.displayScreen(); //invoking the displayScreen method

    } // end main method	
}//end class InvoiceClass

