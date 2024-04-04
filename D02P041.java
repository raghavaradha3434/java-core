package com.learning.core.day2session1;
import java.util.*;

public class D02P041 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] array = {9, 17, 3, 39,8};
	        System.out.println("Enter two numbers ranges from 1 to 40:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        boolean found1 = false;
	        boolean found2 = false;
	        for (int i : array) {
	            if (i == num1) {
	                found1 = true;
	            }
	            if (i == num2) {
	                found2 = true;
	            }
	        }
	        if (found1 && found2) {
	            System.out.println("It's Bingo");
	        } else {
	            System.out.println("Not Found ");
	        }
	        scanner.close();
	    }
	}


