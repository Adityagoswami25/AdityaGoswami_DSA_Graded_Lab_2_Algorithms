package com.glearning.service;

import java.util.Scanner;

public class TransctionService {
	
	int Count = 0;
	public void checkTransctions(int[] arr, int size, int targets) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < targets; i++) {
			long target;
			
			System.out.println("enter the value of target");
			
			target = sc.nextInt();
			
			long total = 0;
			
			for (int j = 0; j < size; j++) {
				total += arr[j];
				
				if (total >= target) {
				
					System.out.println("Target achieved after "+(j + 1) + " transactions ");
					Count = 1;
					break;
				}
			}
			if (Count == 0) {
		
				System.out.println(" Given target is not achieved ");
			}
		}
	}
}

