package com.learning.core.day2session1;

public class D02P043 {
public static void main(String[] args) {
        
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
 
        int n = arr.length;
        breakLoop:
        
        for (int i = 0; i < n;i++) {
            for (int j = i + 1; j < n;j++) {
               
                if (arr[i] == arr[j]) {
                	
                	System.out.println("First repeating element is " + arr[i]);
                	break breakLoop;
                	
                }              
                
                }
           
            }
        }        
       
    }
 


