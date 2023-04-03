package com.lab.client;

import java.util.Arrays;
import java.util.Scanner;

import com.lab.service.CurrencyService;

public class Client {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of currency denominations");
		int size = sc.nextInt();
		int denominations[] = new int[size];
		
		System.out.println("enter the currency denominations value");
		
		for(int i = 0; i<size; i++) {
			denominations[i]=sc.nextInt();
		}
		
		Arrays.sort(denominations);
		
		System.out.println("enter the amount you want to pay");
		double amount = sc.nextInt();
		
		CurrencyService currencyService = new CurrencyService();
		currencyService.reverse(denominations);
		currencyService.denominatorService(denominations, amount, size);
	}	

}
