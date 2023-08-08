package com.techzenure.ganesh.day6;
import java.util.Scanner;
public class Palindrome {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a word:");
	String str = input.nextLine();
	String revreseString= "";
	int string_length = str.length();
	
	for(int i=(string_length-1);i>=0; --i) {
		revreseString = revreseString + str.charAt(i);
		
	}
	if(str.toLowerCase().equals(revreseString.toLowerCase())) {
		System.out.println(str+" it is a palindrome");
	}
	else {
		System.out.println(str+" it is not a palindrome");
	}
	input.close();	
	}

}
	
