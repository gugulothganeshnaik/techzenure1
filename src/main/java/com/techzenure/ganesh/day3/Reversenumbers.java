package com.techzenure.ganesh.day3;
import java.util.Scanner;
public class Reversenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("enter number: ");
		String number = input.nextLine();
		int length_number = number.length();
		//String rever_order = " ";
		int i=1;
		while(i<=length_number) {
			char result = number.charAt(length_number-i);
			System.out.print(result);
			i=i+1;
		}
		input.close();

	}

}
