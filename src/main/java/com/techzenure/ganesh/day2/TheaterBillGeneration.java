package com.techzenure.ganesh.day2;
import java.util.Scanner;
public class TheaterBillGeneration {

	public static void main(String[] args) {
		// TheaterBillGeneration
		
		Scanner input = new Scanner(System.in);
		System.out.print("no of pizzas:");
		int no_of_pizzas = input.nextInt();
		System.out.println("no of pizzas:"+" "+no_of_pizzas);
		
		System.out.print("no of puffs:");
		int no_of_puffs = input.nextInt();
		System.out.println("no of puffs:"+" "+no_of_puffs);
		
		System.out.print("no of cockdrinks:");
		int no_of_cock_drinks = input.nextInt();
		System.out.println("no of cockdrinks:"+" "+no_of_cock_drinks);
		input.close();
        
		System.out.println("Total Bill:");
		
		System.out.print("no of pizzas:"+" "+no_of_pizzas);
		System.out.print("cost of pizzas:"+" "+no_of_pizzas*100);
		

		System.out.println("no of puffs:"+" "+no_of_puffs);
		System.out.print("cost of puffs:"+" "+no_of_puffs*12);
		
		System.out.println("no of cockDrinks:"+" "+no_of_cock_drinks);
		System.out.println("cost of cockDrinks:"+" "+no_of_cock_drinks*5);
		
		int totalprice = (no_of_pizzas*100)+(no_of_puffs*12)+(no_of_cock_drinks*5);
		
		System.out.println("Total Price:"+totalprice);
		
		System.out.println("Enjoy Your Movie");
		
	}

}
