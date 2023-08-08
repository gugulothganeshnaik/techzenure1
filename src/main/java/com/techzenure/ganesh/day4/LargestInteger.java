package com.techzenure.ganesh.day4;

public class LargestInteger {

 

public static void main(String[] args) {

 

int[] numArray = { 23, 34, 50, 33, 55, 43, 5, 66 };

largest(numArray);

 

 

}

 

private static void largest(int[] numArray) {

 

int largest =0;

for (int num: numArray) {

if(largest < num)

largest= num;

}

 

System.out.format("Largest element = "+ largest );

}

 

 

 

}
