// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;



//ST10451732

public class Sales
{
	private static Scanner scan = new Scanner(System.in);
	
 public static void main(String[] args)
 {

        System.out.println("How many sales people do you want to enter sales for?");
        int SALESPEOPLE = scan.nextInt();
        scan.nextLine();
		 
         int[] sales = new int[SALESPEOPLE];
		 int sum;
		 int salespersonid=0;
		 
		//for (int j = 0; j < SALESPEOPLE; j++) { 
			 
			 
			 
			 for (int i=0; i<sales.length; i++) //Run this loop for the number of sales people created
			 {
				 salespersonid=i+1;
				 System.out.print("Enter sales for salesperson " + salespersonid + ": ");
				 sales[i] = scan.nextInt();
				 
			 }
			 
			 
			 System.out.println("\nSalesperson | Sales");
			 System.out.println("--------------------");
			 sum = 0;
			 for (int i=0; i<sales.length; i++)
			 {
				salespersonid=i+1; 
				System.out.println(" " + salespersonid + " | " + sales[i]);
				sum += sales[i];
			 
			 }
			 System.out.println("\nTotal sales: " + sum);
			 
			 
			 //---------calc Average
				 int totsum=sum;
				 int avgSales = (int)(totsum / SALESPEOPLE);
			  
				 System.out.println("The average sale is: " + avgSales);
				 
			 //-------Find and print the maximum sale.
				 int maxSale = sales[0]; //set maxSale to 1st member of array
				 int maxSaleIndex = 0; // Keep track of the index of the maximum sale
				 for(int i=0; i<sales.length; i++) //loop through array until highest sale is found
				 {
				   if(maxSale < sales[i])
				   {
					  maxSale = sales[i];
					  maxSaleIndex = i+1;
				   }
				 }
				System.out.println("Highest sale is: " + maxSale + " made by sales person id: " + maxSaleIndex); 
				
				
			  //-------Find and print the lowest sale.
				 int lowSale = sales[0]; //set maxSale to 1st member of array
				 int lowSaleIndex = 0; // Keep track of the index of the low sale
				   for(int i=0; i<sales.length; i++) //loop through array until lowest sale is found
				   {
					   
					 if(lowSale > sales[i])
					 {
						lowSale = sales[i];
						lowSaleIndex = i+1;
					 }
				   }
				  System.out.println("Lowest sale is: " + lowSale + " made by sales person id: " + lowSaleIndex); 
			  
				  
				  //-------Find and print the sales person who exceeded user input's sale.
				  System.out.println("\n Enter a value: ");
				  int userVal = scan.nextInt();
				  int exceededAmount = sales[0];
				  int exceededSalesPerson = 0;
				  int exceededCount=0;
				  String exceededMessage = ""; // Initialize the message as an empty string

				  for(int i=0; i<sales.length; i++) { //loop through array until highest sale is found
					  if(userVal < sales[i]) {
						  exceededAmount = sales[i];
						  exceededSalesPerson = i + 1;
						  exceededCount++;
						  exceededMessage = "Sales person: " + exceededSalesPerson + " exceeded amount with sale of " + exceededAmount;
						  System.out.println(exceededMessage);
					  }
				  }

				  if (exceededCount == 0) {
					  System.out.println("No salesperson exceeded the input value of " + userVal);
				  } else {
					  
					  System.out.println("Total of " + exceededCount + " sales exceeded the amount of " + userVal);
				  }
		 
		}	
 }