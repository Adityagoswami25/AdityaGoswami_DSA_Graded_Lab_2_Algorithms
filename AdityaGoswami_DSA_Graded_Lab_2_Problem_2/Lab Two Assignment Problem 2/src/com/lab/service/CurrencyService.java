package com.lab.service;

import java.util.ArrayList;
import java.util.List;

public class CurrencyService {

	public void denominatorService(int[] denominations, double amount, int size) {
		
		int[] notes = new int[size];
        for (int i = 0; i < size; i++) {
            notes[i] = (int) (amount / denominations[i]);
            amount -= notes[i] * denominations[i];
        }
        
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int i = 0; i < size; i++) {
            if (notes[i] > 0) {
                System.out.println(denominations[i] + ":" + notes[i]);
            }
        }
	}
	
	public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
