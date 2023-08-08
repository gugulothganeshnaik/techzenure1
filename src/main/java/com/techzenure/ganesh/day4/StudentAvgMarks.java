package com.techzenure.ganesh.day4;
import java.util.Scanner;
public class StudentAvgMarks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String charac = "-";
		System.out.println(charac.repeat(20));
		System.out.println("REPORT CARD");
		System.out.println(charac.repeat(20));
		System.out.print("NAME:");
		String name = input.nextLine();
		System.out.println(charac.repeat(20));
		System.out.println("Subject"+"       "+"Marks");
		System.out.println(charac.repeat(20));
		System.out.println("Enter no of Subjects:");
		int[] Marks = {65,67,70,80,90,75};
		int length_marks= Marks.length;
		int i=0;
		int sum=0;
		while(i <length_marks){
			System.out.println("Subjects-"+(i+1)+"     "+Marks[i]);
			sum=sum+Marks[i];
			i=i+1;
		}
		int Average = (sum / length_marks);
		System.out.println(charac.repeat(20));
		System.out.println("Total:"+sum+"    "+"Average:"+Average);
		
		
		input.close();
		

	}

}
