ICE Task 4
Due date: 23/5/2024

Consider the attached file Sales.java which contains a Java program that prompts for and reads in the sales for each of 5 salespeople in a company. It then prints out the id and amount of sales for each salesperson and the total sales. Study the code, then compile and run the program to see how it works. Now modify the program as follows:
1.	Compute and print the average sale. (You can compute this directly from the total; no loop is necessary.)
2.	Find and print the maximum sale. Print both the id of the salesperson with the max sale and the amount of the sale, e.g. "Salesperson 3 had the highest sale with $4500." Note that you don't need another loop for this; you can do it in the same loop where the values are read and the sum is computed.
3.	Do the same for the minimum sale.
4.	After the list, sum, average, max and min have been printed, ask the user to enter a value. Then print the id of each salesperson who exceeded that amount, and the amount of their sales. Also print the total number of salespeople whose sales exceeded the value entered.
5.	The salespeople are objecting to having an id of 0—no one wants that designation. Modify your program so that the ids run from 1–5 instead of 0–4. Do not modify the array—just make the information for salesperson 1 reside in array location 0, and so on.
6.	Instead of always reading in 5 sales amounts, at the beginning ask the user for the number of sales people and then create an array that is just the right size. The program can then proceed as before.
