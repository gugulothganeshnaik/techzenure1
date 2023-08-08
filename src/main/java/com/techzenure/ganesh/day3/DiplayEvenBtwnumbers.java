package com.techzenure.ganesh.day3;
import java.util.Scanner;
public class DiplayEvenBtwnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number:");
		int number1 = input.nextInt();
		System.out.print("Enter Second Number:");
		int number2 = input.nextInt();	
		if(number2<number1) {
			System.out.println("Second Number grater than first Number");
		}
		else {
		while(number1<=number2) {
			System.out.print(number1+" ");
			number1=number1+2;
		}
		}
        }

	
	}


