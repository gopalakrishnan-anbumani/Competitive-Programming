package com.java.basics;

public interface Bonus {
	long SILVER = 150000;
	long GOLD = 100000;
	long DIAMOND = 50000;
	
	public long calculateBonusPayout(int actualSales, int targetSales);
}
