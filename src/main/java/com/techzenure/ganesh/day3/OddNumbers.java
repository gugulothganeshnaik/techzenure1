package com.techzenure.ganesh.day3;
import java.util.Scanner;
public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int number=input.nextInt();
		for(int count=1;count<=(number+number);count++) {
			if(count%2==1) {
			System.out.println(count);
			
		}
		
		input.close();
		
		

	}
	}

}
