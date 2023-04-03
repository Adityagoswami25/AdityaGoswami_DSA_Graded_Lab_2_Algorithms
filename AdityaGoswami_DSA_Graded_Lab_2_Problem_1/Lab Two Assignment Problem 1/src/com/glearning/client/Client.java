package com.glearning.client;

import java.util.Scanner;

import com.glearning.service.TransctionService;

public class Client {
	
	public static void main(String args[]) throws Exception {
		
		TransctionService transctionService = new TransctionService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of transaction array");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("enter the values of array");
		
		for (int i = 0; i < size; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		
		int targets = sc.nextInt();
		
		transctionService.checkTransctions(arr, size, targets);
		
		

	}
}
